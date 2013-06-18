package com.ciklum.study.newbanner;

import java.util.Random;

public class MixedBanner extends AbstractBanner  {
    MixedBanner(String[] s){
        super(s);
    }
    @Override
    public String[] makeBanner(int size) {

        Random rnd = new Random();
        for (int j = body.length - 1; j >= 1; j--) {
            int index = rnd.nextInt(j + 1);
            String temp = body[index];
            body[index] = body[j];
            body[j] = temp;
        }
        return turnToSize(body,size);
    }
}
