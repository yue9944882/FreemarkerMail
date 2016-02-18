package com.kimmin.mail.mvc.type;

/**
 * Created by min.jin on 2016/2/18.
 */


/** Enumeration For Types of Mails **/
public enum MailType {

    OTHER(0),
    TEST(1);

    private final int value;

    private MailType(int value){ this.value = value; }

    public int getValue(){ return this.value; }

    public static MailType findByValue(int value){
        switch(value){
            case 0:
                return OTHER;
            case 1:
                return TEST;
            default:
                return null;
        }
    }

}
