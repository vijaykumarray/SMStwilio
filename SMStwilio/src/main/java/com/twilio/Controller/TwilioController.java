package com.twilio.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.twilio.SmsRequest.SmsRequest;

@RestController
@RequestMapping("api/v1/sms")
public class TwilioController {

    private final Service service;

    @Autowired
    public TwilioController(Service service) {
        this.service = service;
    }

    @PostMapping
    public void sendSms(@Validated @RequestBody SmsRequest smsRequest) {
        ((TwilioController) service).sendSms(smsRequest);
    }
}
