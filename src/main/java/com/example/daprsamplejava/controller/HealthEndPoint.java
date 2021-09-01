package com.example.daprsamplejava.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthEndPoint {

  @GetMapping("/report")
  public String report() {
    return "";
  }
}
