package com.ciklum.study.newbanner;


import static org.apache.commons.lang3.StringUtils.equalsIgnoreCase;

public abstract class AbstractBanner extends Banner  {

    AbstractBanner(Storage s,String topic){
        int k = 0;
        for (int i = 0; i < s.getBase().length; i++) {
            if (s.getBase()[i][0].equalsIgnoreCase(topic)) {
                k = i;
            }
        }
        this.body = s.getBase()[k];
    }


}
