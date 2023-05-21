# 네이버 쇼핑 API를 활용한 데이터 채우기
### 개요
시중에서 판매하는 영양제의 이미지 URL을 DB에 저장하기 위해 네이버 쇼핑 API를 활용한 코드작성
### 선택 이유
국내에서 판매하는 영양제들의 이미지를 제일 많이 갖고 있고 정확하게 가져올 수 있는 네이버 쇼핑 API를 선택
### 효과
클릭 한 번으로 간편하고 정확하게 DB에 URL값, 브랜드명 저장
### 핵심코드
[src/main/java/com/ssafy/onu/service/DataService.java](https://github.com/PrimeJin/onu-nutrient-image-crawling/blob/master/backend/src/main/java/com/ssafy/onu/service/DataService.java)
<br/>

# 이를 활용한 최종 프로젝트 결과물
# 💊 OnU (My Own Nutrient)

## 목차
1. [서비스 소개](#-서비스-소개)
2. [주요 기능](#-주요-기능)
3. [기획](#-기획)
4. [서비스 아키텍쳐](#%EF%B8%8F-서비스-아키텍쳐)
5. [기술 특이점 및 성과](#-기술-특이점-및-성과)
6. [멤버소개 및 회고](#-멤버소개-및-회고)
7. [Git 전략 및 컨벤션](#-git-전략-및-컨벤션)


## 💊 서비스 소개

### 개요
![image](https://github.com/PrimeJin/onu-readme/assets/110287222/14fa1452-4de3-45fd-9aa3-199be94f9207)
- **서비스명: OnU**
- **소개: 본인의 영양제 섭취 목적에 맞는 올바른 영양제를 선택하고, 꾸준한 복용으로 이어질 수 있도록 도와주는 서비스**


## 🤗 주요 기능
### 📌 영양제 추천
- **설문조사를 통해 사용자에게 필요한 영양제 추천**
- 기대효과
  - 영양제에 대한 선택지 간소화
  - 나에게 맞는 적합한 영양제 선택

 <img src="https://github.com/PrimeJin/onu-readme/assets/110287222/3041c5b6-b4c9-4910-ba99-96a9037dd557"  width="600" height="600"/>

### 📌 영양 분석
- **현재 복용중인 영양제를 반영한 영양 성분 그래프 표시**
- **영양 성분 분석으로 원하는 영양제 조합을 만들어 저장 가능**

 <img src="https://github.com/PrimeJin/onu-readme/assets/110287222/80493ed7-d557-4552-9119-9d61235fb515"  width="600" height="600"/>

### 📌 복용 알림
- **알림 서비스 구독 -> 원하는 시간에 복용 알림 수신 -> 알림 링크 클릭 -> 캘린더 체크**
- 기대효과
  - 꾸준한 영양제 복용 유도

 <img src="https://github.com/PrimeJin/onu-readme/assets/110287222/e906cda4-ad2f-44bf-abdd-7d9518fe2b74"  width="600" height="600"/>


### 📌 제품 비교
- **고민 중인 영양제 선택하여 다른 영양제와 비교 가능**
- 기대효과
  - 자기 주도적 영양제 선택

 <img src="https://github.com/PrimeJin/onu-readme/assets/110287222/8f10197d-1dcd-48f3-9ed5-d0d74c4c1993"  width="600" height="600"/>

### 📌 영양제 검색 및 복용 영양제 등록
**영양제에 대해 아는정보 (이름, 브랜드명)로 입력시 검색결과 조회**
- 검색의 경우 영양제 비교, 전체 영양제 조회, 영양분석에도 사용

**검색 결과에서 복용중인 영양제로 등록가능**

<img src="https://github.com/PrimeJin/onu-readme/assets/110287222/c9cd02b0-020d-40be-b9bc-caba5fa761e6"  width="600" height="600"/>

### 📌 성분, 기능에 해당하는 영양제 조회
**원하는 성분과 기능을 선택하여 해당 성분, 기능을 갖고있는 영양제 조회**

<img src="https://github.com/PrimeJin/onu-readme/assets/110287222/83680135-a341-4492-a529-feda754f2b82"  width="600" height="600"/>

### 📌 리뷰
**영양제 별 리뷰 관리를 통해 사용자의 영양제 선택에 도움 제공**

<img src="https://github.com/PrimeJin/onu-readme/assets/110287222/8891b310-c9c1-4ee8-98db-52abf1e5af2f"  width="600" height="600"/>

### 📌 소셜로그인
**카카오톡 소셜로그인**

<img src="https://github.com/PrimeJin/onu-readme/assets/110287222/01736e86-555c-45f5-8258-410a6e0baa0f"  width="600" height="600"/>


## 💻 기획
### ERD
https://www.erdcloud.com/d/PmD3cgGfv76aYTXxT
![image](https://github.com/PrimeJin/onu-readme/assets/110287222/ed631f7b-03b1-4394-8447-0b6023d8e9af)


### Figma
https://www.figma.com/file/BxdV1dLGmP6Vj4AXDauJBO/A703?node-id=0-1&t=sClrQLqVYlRlpm3A-0
![image](https://github.com/PrimeJin/onu-readme/assets/110287222/a4ed2834-1590-4405-ade1-e113945d880d)

<br/>

## ⚙️ 서비스 아키텍쳐
![image](https://github.com/PrimeJin/onu-readme/assets/110287222/69423c47-a127-48d7-98e9-1bc123438c05)

<br/>

## 👍🏻 기술 특이점 및 성과
### 📌 Cache(Redis)활용
- 로그인 token
- 휴대폰 번호인증
- 영양 성분 조회시 join된 테이블 조회대신 redis 활용
- 영양제 비교 

### 📌 Full-Text-Search
**Full Text Search 사용으로 데이터 1000건 기준 검색 속도 200% 성능 개선**
![image](https://github.com/PrimeJin/onu-readme/assets/110287222/515da6cc-b74a-47f7-bbc5-7d1adeb5781f)

### 📌 협업 필터링 추천 시스템
**사용자들에게 얻은 기호정보에 따라서 사용자들에게 추천해주는 방법**
**코사인 유사도를 활용하여 사용자 간의 유사도 측정**
![image](https://github.com/PrimeJin/onu-readme/assets/110287222/ced37a30-f386-4deb-a8c1-57a326371949)

**현재 복용중인 영양제를 바탕으로 사용자 간의 유사도 테이블 생성**
- 영양제 섭취 목적으로 filtering한 data와 비교
- 사용자의 설문 답변에 맞춘 영양제 추천

![image](https://github.com/PrimeJin/onu-readme/assets/110287222/9d4ff06a-96f1-4ecf-9372-5abcab81fff5)

### 📌 SSR, 이미지 최적화
**Next.js 프레임워크를 통한 서버사이드 렌더링, 이미지 최적화로 성능 개선**
![image](https://github.com/PrimeJin/onu-readme/assets/110287222/e3868996-7430-4c50-b6ea-deaf05b258f8)

<br/>

## 👋🏼 멤버소개 및 회고
![image](https://github.com/PrimeJin/onu-readme/assets/110287222/28de8cdc-cbbb-4d52-8fee-11ca4838739f)

### 조우진
기획한 기능을 구현뿐만 아니라 기존에 사용해왔던 방식에서 성능을 더 개선할 수 있는 방법을 고민하고 적용하면서 한층 더 성장할 수 있었다. 이번에 활용한 Cache와 Full-Text-Search, 서버 분리 등을 앞으로 더 발전시켜 현업에서 좋은 성과를 내는 백엔드 개발자가 되고싶다. SSAFY에서 진행하는 마지막 프로젝트인만큼 그동안 학습해왔던 역량들을 정리하고 발전시키면서 든든한 팀원들과 함께 잘 마무리한 것 같다
### 여민지
처음 인프라 담당을 하여 MSA를 적용해보면서 aws와docker, nginx에 대한 이해도를 높일 수 있었다. 또한 cache의 사용과, 검색의 위한 서버분리, full text search로 성능 개선에 중점을 두어 개발한 프로젝트로 성능 개선에 중점을 둔 프로젝트로서 의미가 있었다. 향후 더 많은데이터와 대용량 트래픽을 적용하여 성능 차이를 직접 경험해보고 싶다.
### 한상원
좀 늦은 감이 있지만 Next.js와 Typescript를 처음 사용해본 프로젝트였다. 익숙해지는데 시간이 걸리긴 했어도 왜 사람들이 좋다좋다 하는지 알게되어 만족스러웠다. 다만 3번째 팀프로젝트임에도 내가 그만큼 성장했는가에 대해서는 확신이 없다. 늘 시간은 부족하고 내가 만든 코드는 항상 어디선가 문제가 생긴다. 미안함과 아쉬움이 남는다. 아직 갈길이 멀다고 느낀다.
### 이정현
이번 프로젝트를 통해 Next.js를 처음 경험해 보았는데, 프레임워크를 사용한 개발이 왜 좋은지를 크게 느낄 수 있었다. 또한 이전 프로젝트보다 훨씬 props를 많이 사용하여 개발을 진행하였는데, typeScript를 통해 코드를 짜는 과정에서 발생하는 오류로 변수들의 타입을 유추하는 연습을 많이 해볼 수 있어 좋았지만, props를 너무 많이 사용하다보니 기능은 동작하지만 굉장히 가독성이 떨어지는 코드를 작성하게 되어 아쉽고 이를 개선할 방법을 찾아야겠다고 생각했다.
### 나유현
이번 프로젝트에서는 처음으로 cache를 적용해 보았다. 단순 조회했을 때보다 그 성능이 몇 배는 빨라져서 놀라웠다. 기능 구현을 위해 단순히 cache를 적용한 수준에 불과한데, 학습을 통해 더욱 이해를 높여 나가야겠다. 항상 묵묵히 맡은 일들을 해내고 배려하는 팀원들에게 고마움을 느낀다.
### 송진주
자바와 스프링부트, JPA에 대한 이해를 넓히는 것을 목표로 이번 프로젝트에 임했다. 팀원들의 도움을 받아 여러 가지 API를 만들어보고 오류를 수정하면서 충분히 습득할 수 있었다. 코드 리팩토링 같은 추가적인 작업을 못해서 아쉽지만, 다음엔 꼼꼼히 리팩토링하여 더욱 효율적이고 재활용성이 높은 코드를 만들고 싶다. 이전에 프론트를 맡았어서 이번 프론트에 도움이 되고 싶었으나 기억이 잘 나지 않아 많은 도움을 주지 못했다. 꾸준한 학습이 중요하다는 것을 깨달았다.


<br/>

## 🌟 Git 전략 및 컨벤션
### Git 전략
```
master -> develop -> backend  -> be/feature/기능명
master -> develop -> frontend -> fe/feature/기능명

Merge
기능 branch 개발 완료 => backend or frontend 각 파트 branch에 Pull request => 팀 확인 및 각 파트 리더 merge 승인
- ex) be/feature/login 개발 완료 ⇒ backend에 Pull Request ⇒ 팀 확인 및 backend 리더 merge 승인

이후 정상작동 확인 후 Git 담당자가 develop에 merge 작업 수행,  develop => master에 merge 작업 수행 
```
### Git 컨벤션
```
[이슈번호] BEorFE/태그종류: (작업한 내용 동사형) 작업내용
- ex) [이슈번호] BE/Fix: Resolve getUser function NullPointerException error
- ex) [이슈번호] FE/Feat : Add find password function

본문(바디) 내용 작성 시 이번 커밋과 관련하여 수행한 내용 한글로 상세하게 작성
```
**태그종류**
| 태그 이름 | 설명 |
| --- | --- |
| Feat | 새로운 기능 추가 |
| Design | CSS, UI 등 디자인 관련 작업 |
| Style | 코드 포맷팅, 세미 콜론 누락 등 |
| Test | 테스트 코드 추가 및 리팩토링 (테스트 이외 코드 변경 X) |
| Fix | 버그 수정 |
| Rename | 파일 혹은 폴더명 수정한 경우 |
| Remove | 파일 삭제하는 작업 수행한 경우 |
| Comment | 주석 추가 및 변경 |
| Refactor | 코드 리팩토링 |
| Docs | 문서 수정한 경우 |
