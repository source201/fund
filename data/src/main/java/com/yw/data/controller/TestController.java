package com.yw.data.controller;

import com.yw.data.service.LoadDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private LoadDataService loadDataService;

    @GetMapping("/loadNetWorth")
    public void loadNetWorth(String fundcode){
        loadDataService.getFundNetWorth(fundcode);
    }

    @GetMapping("/hello")
    public String helloWorld(){
        return "hello yw";
    }
}
