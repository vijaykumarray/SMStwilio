package com.twilio.SmsSender;

import com.twilio.SmsRequest.SmsRequest;

public interface SmsSender {

    void sendSms(SmsRequest smsRequest);

    // or maybe void sendSms(String phoneNumber, String message);
}
