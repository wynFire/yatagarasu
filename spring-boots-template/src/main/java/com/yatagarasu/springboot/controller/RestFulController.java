package com.yatagarasu.springboot.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class RestFulController {
  
  @RequestMapping("/rest")
  @ResponseBody
  public String home() {
    return "Hello world Rest Ful!";
  }
  
  public static void main(String[] args) {
    SpringApplication.run(RestFulController.class, args);
  }
}
