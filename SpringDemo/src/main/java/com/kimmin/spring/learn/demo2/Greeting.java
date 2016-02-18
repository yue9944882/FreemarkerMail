package com.kimmin.spring.learn.demo2;

/**
 * Created by min.jin on 2016/2/17.
 */
public class Greeting {

    private final long id;
    private final String content;

    public Greeting(long id, String content){
        this.id=id;
        this.content=content;
    }

    public long getId(){
        return id;
    }

    public String getContent(){
        return content;
    }

}
