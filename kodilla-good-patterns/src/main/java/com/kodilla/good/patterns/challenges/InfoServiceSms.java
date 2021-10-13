package com.kodilla.good.patterns.challenges;

public class InfoServiceSms implements InfoService {
    public void informUserAboutOrder(User user) {
        System.out.println("Info service:\nSMS has been sent to " + user.getLoginName() + "\n");
    }
}
