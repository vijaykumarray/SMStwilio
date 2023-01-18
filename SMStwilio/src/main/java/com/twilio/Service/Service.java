package com.twilio.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.twilio.SmsRequest.SmsRequest;
import com.twilio.SmsSender.SmsSender;
import com.twilio.TwilioSmsSender.TwilioSmsSender;
@org.springframework.stereotype.Service

public class Service {

    private final SmsSender smsSender;

    @Autowired
    public Service(@Qualifier("twilio") TwilioSmsSender smsSender) {
        this.smsSender = smsSender;
    }

    public void sendSms(SmsRequest smsRequest) {
        smsSender.sendSms(smsRequest);
    }
}
