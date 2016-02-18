package com.kimmin.mail.mvc.service;

/**
 * Created by min.jin on 2016/2/18.
 */


public interface SendMailService {

    boolean sendMail(String addr);
    void setDepartureMail(String addr, String passwd);
    void setSMTPSite(String host);


}
