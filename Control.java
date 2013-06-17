package com.ciklum.study.newbanner;

import com.ciklum.study.banner.Controller;

import java.util.Arrays;
import java.util.Scanner;

public class Control {

    public void controlBanner() {
        System.out.println("Select topic you want to see (AUTO, MOTO, VELO or SCOOTER)");
        Scanner t = new Scanner(System.in);
        String topic = t.next();
        System.out.println("Choose the size of banner (from 1 to 6)");
        Scanner s = new Scanner(System.in);
        Integer size = s.nextInt();
        System.out.println("Choose what banner you want. 1 - mixed. 2 - fixed.");
        Scanner y = new Scanner(System.in);
        Integer type = y.nextInt();
        Storage storage = new Storage();
        boolean flow = true;
        while (flow) {
            if (type == 1) {
                Banner mixed = new MixedBanner(storage,topic);
                System.out.println(Arrays.toString(mixed.makeBanner(size)));
                System.out.println("Press any button to refresh or Q to exit.");
                Scanner d = new Scanner(System.in);
                String o = d.next();
                if (o.equals("Q")) {
                    flow = false;
                }
            }  else if (type == 2) {
                Banner fixed = new FixedBanner(storage,topic);
                System.out.println(Arrays.toString(fixed.makeBanner(size)));
                flow = false;

            }
        }


    }


}