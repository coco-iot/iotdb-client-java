package com.luomor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.luomor.service.SessionService;

import org.apache.iotdb.rpc.IoTDBConnectionException;
import org.apache.iotdb.rpc.StatementExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class IotDBController {
    private static Logger logger = LoggerFactory.getLogger(IotDBController.class);

    @Autowired
    SessionService sessionService;

    @GetMapping("/iot")
    public String iot() throws IoTDBConnectionException, StatementExecutionException {
        sessionService.test();
        return "iot";
    }
}
