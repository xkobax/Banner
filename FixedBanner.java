package com.ciklum.study.newbanner;

public class FixedBanner extends AbstractBanner  {
    FixedBanner(String[] s){
        super(s);
    }
    @Override
    public String[] makeBanner(int size) {
        String[] body1 = cutBanner(body);
        //Arrays.sort(body1);
        return turnToSize(body1,size);
    }
}
