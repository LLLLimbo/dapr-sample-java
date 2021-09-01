package com.example.daprsamplejava.controller;

import java.nio.charset.StandardCharsets;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@Slf4j
@RequestMapping("/sampleJavaApp")
@RestController
public class SampleController {

  @PostMapping("/name")
  public Mono<String> sayName(
      @RequestBody byte[] body, @RequestHeader Map<String, String> headers) {
    return Mono.fromSupplier(
        () -> {
          String message = body == null ? "" : new String(body, StandardCharsets.UTF_8);
          log.info("Received message from {},\nContent={}", headers.get("service"), message);
          return "Limbo";
        });
  }
}
