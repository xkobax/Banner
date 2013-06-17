package com.ciklum.study.newbanner;

public class Banner  implements Bannermakeable  {
    String[] body;
    private String topic;
    private int size;


    @Override
    public String[] makeBanner(int size) {
        return new String[0];
    }
}
