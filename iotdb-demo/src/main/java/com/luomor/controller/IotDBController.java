package com.luomor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class IotDBController {
    private static Logger logger = LoggerFactory.getLogger(IotDBController.class);

    @GetMapping("/iot")
    public String iot() {
        return "iot";
    }
}
