package com.ciklum.study.newbanner;


import org.apache.commons.lang3.ArrayUtils;

import java.util.Random;



public class MixedBanner extends AbstractBanner  {
    MixedBanner(Storage s, String topic){
        super(s,topic);
    }
    @Override
    public String[] makeBanner(int size) {

        String[] body1 = ArrayUtils.remove(body, 0);
        Random rnd = new Random();
        for (int j = body1.length - 1; j >= 1; j--) {
            int index = rnd.nextInt(j + 1);
            String temp = body1[index];
            body1[index] = body1[j];
            body1[j] = temp;

        }
        String[] result = new String[size];
        System.arraycopy(body1,0,result,0,size);

        return result;

    }
}
