package com.ciklum.study.newbanner;

public class Banner  implements Bannermakeable  {
    String[] body;
    private String topic;
    private int size;

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;

    }


    @Override
    public String[] makeBanner(int size) {
        return new String[0];
    }
}
