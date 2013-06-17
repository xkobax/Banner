package com.ciklum.study.newbanner;

import org.apache.commons.lang3.ArrayUtils;

public abstract class AbstractBanner extends Banner  {
    String[] body;
    private String topic;
    private int size;
    AbstractBanner(String[] base){
        this.body = base;
    }

    public String[] cutBanner(String[] body) {
        return ArrayUtils.remove(body, 0);
    }

    public String[] turnToSize(String[] body,int size) {
        String[] result = new String[size];
        System.arraycopy(body,0,result,0,size);
        return result;
    }
}
