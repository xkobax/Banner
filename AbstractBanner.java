package com.ciklum.study.newbanner;

public abstract class AbstractBanner extends Banner  {
    String[] body;
    private String topic;
    private int size;
    AbstractBanner(String[] base){

        this.body = base;
    }


}
