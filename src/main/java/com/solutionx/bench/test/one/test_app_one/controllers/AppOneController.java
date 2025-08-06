package com.solutionx.bench.test.one.test_app_one.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(path = "")
public class AppOneController {
    private final static String apiOne = "testapp/one/api_one";

    @GetMapping(value = apiOne)
    public ResponseEntity<String> apitOne() {

        log.info("called : [{}]", apiOne);
        return ResponseEntity.ok("Ack : " + apiOne);
    }
}
