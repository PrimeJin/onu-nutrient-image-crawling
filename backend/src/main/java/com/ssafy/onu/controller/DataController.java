package com.ssafy.onu.controller;

import com.ssafy.onu.service.DataService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/data")
public class DataController {
    private DataService dataService;
    public DataController(DataService dataService) {
        this.dataService = dataService;
    }
    @PostMapping()
    public void connectData() {
        dataService.getData();
    }


}
