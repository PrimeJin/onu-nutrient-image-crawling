package com.ssafy.onu.service;

import com.ssafy.onu.entity.NutrientData;
import com.ssafy.onu.repository.NutrientDataRepository;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DataService {
    private NutrientDataRepository nutrientDataRepository;

    public DataService(NutrientDataRepository nutrientDataRepository) {
        this.nutrientDataRepository = nutrientDataRepository;
    }

    @Value("${naver.shop.clientId}")
    private String appClientId;

    @Value("${naver.shop.clientSecret}")
    private String appClientSecret;

    public void getData() {
        String clientId = appClientId; //애플리케이션 클라이언트 아이디
        String clientSecret = appClientSecret; //애플리케이션 클라이언트 시크릿

        List<NutrientData> list = nutrientDataRepository.findAll();

        for(int i=0; i<list.size(); i++) {
            NutrientData nutrientData = list.get(i);

            String name = list.get(i).getProlstNm();
            String text = null;
            try {
                text = URLEncoder.encode("노바렉스 " + name, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("검색어 인코딩 실패",e);
            }

            String apiURL = "https://openapi.naver.com/v1/search/shop?query=" + text;    // JSON 결과
            //String apiURL = "https://openapi.naver.com/v1/search/blog.xml?query="+ text; // XML 결과

            Map<String, String> requestHeaders = new HashMap<>();
            requestHeaders.put("X-Naver-Client-Id", clientId);
            requestHeaders.put("X-Naver-Client-Secret", clientSecret);
            String responseBody = get(apiURL,requestHeaders);

            String url = null;
            String brand = null;
            try {
                JSONParser jsonParser = new JSONParser();
                Object obj = jsonParser.parse(responseBody);
                JSONObject jsonObject = (JSONObject) obj;
//                System.out.println(jsonObject);
                Object urlObj = jsonObject.get("items");
                JSONArray jsonArray = (JSONArray) urlObj;
                JSONObject jsonObj1 = (JSONObject) jsonArray.get(0);

                url = (String) jsonObj1.get("image");
                brand = (String) jsonObj1.get("brand");
            } catch (Exception e) {
                e.printStackTrace();
            }

            nutrientData.setBrand(brand);
            nutrientData.setImageUrl(url);
            nutrientDataRepository.save(nutrientData);

            System.out.println("======= image url: " + url);
        }
    }

    private static String get(String apiUrl, Map<String, String> requestHeaders){
        HttpURLConnection con = connect(apiUrl);
        try {
            con.setRequestMethod("GET");
            for(Map.Entry<String, String> header :requestHeaders.entrySet()) {
                con.setRequestProperty(header.getKey(), header.getValue());
            }

            int responseCode = con.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) { // 정상 호출
                return readBody(con.getInputStream());
            } else { // 오류 발생
                return readBody(con.getErrorStream());
            }
        } catch (IOException e) {
            throw new RuntimeException("API 요청과 응답 실패", e);
        } finally {
            con.disconnect();
        }
    }


    private static HttpURLConnection connect(String apiUrl){
        try {
            URL url = new URL(apiUrl);
            return (HttpURLConnection)url.openConnection();
        } catch (MalformedURLException e) {
            throw new RuntimeException("API URL이 잘못되었습니다. : " + apiUrl, e);
        } catch (IOException e) {
            throw new RuntimeException("연결이 실패했습니다. : " + apiUrl, e);
        }
    }


    private static String readBody(InputStream body){
        InputStreamReader streamReader = new InputStreamReader(body);

        try (BufferedReader lineReader = new BufferedReader(streamReader)) {
            StringBuilder responseBody = new StringBuilder();

            String line;
            while ((line = lineReader.readLine()) != null) {
                responseBody.append(line);
            }

            return responseBody.toString();
        } catch (IOException e) {
            throw new RuntimeException("API 응답을 읽는 데 실패했습니다.", e);
        }
    }
}
