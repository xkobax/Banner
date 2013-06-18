package com.ciklum.study.newbanner;

import java.util.Random;

public class MixedBanner extends AbstractBanner  {
    MixedBanner(String[] s){
        super(s);
    }
    @Override
    public String[] makeBanner(int size) {

        String[] body1 = cutBanner(body);
        Random rnd = new Random();
        for (int j = body1.length - 1; j >= 1; j--) {
            int index = rnd.nextInt(j + 1);
            String temp = body1[index];
            body1[index] = body1[j];
            body1[j] = temp;
        }
        return turnToSize(body1,size);
    }
}
