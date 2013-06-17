package com.ciklum.study.newbanner;


import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;


public class FixedBanner extends AbstractBanner  {
    FixedBanner(Storage s, String topic){
        super(s,topic);
    }
    @Override
    public String[] makeBanner(int size) {
        String[] body1 = ArrayUtils.remove(body, 0);
        Arrays.sort(body1);
        String[] result = new String[size];
        System.arraycopy(body1,0,result,0,size);


        return result;
    }
}
