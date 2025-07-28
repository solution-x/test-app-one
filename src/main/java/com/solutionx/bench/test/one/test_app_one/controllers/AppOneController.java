package com.solutionx.bench.test.one.test_app_one.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(path = "")
public class AppOneController {

    @PostMapping(value = "testapp/one/api_one")
    public ResponseEntity<String> apitOne(@RequestBody String reqStr) {

        log.info("called : {}", reqStr);
        return ResponseEntity.ok("Ack : " + reqStr);
    }
}
