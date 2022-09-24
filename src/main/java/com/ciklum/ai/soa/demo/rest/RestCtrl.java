package com.ciklum.ai.soa.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestCtrl {

    private static final String SIMPLE_REFLEX_RESP_PREFIX = "You typed ";

    @GetMapping("/hi/{str}")
    public String hello(@PathVariable String str) {
        System.out.println(SIMPLE_REFLEX_RESP_PREFIX + str);
        return SIMPLE_REFLEX_RESP_PREFIX + str;
    }

}
