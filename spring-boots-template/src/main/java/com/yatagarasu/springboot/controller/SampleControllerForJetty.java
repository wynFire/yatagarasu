package com.yatagarasu.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yatagarasu.springboot.service.HelloWorldService;

@Controller
public class SampleControllerForJetty {

  @Autowired
  private HelloWorldService helloWorldService;

  @GetMapping("/")
  @ResponseBody
  public String helloWorld() {
    return this.helloWorldService.getHelloMessage();
  }
}
