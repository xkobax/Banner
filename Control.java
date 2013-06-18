package com.ciklum.study.newbanner;

import org.apache.commons.lang3.ArrayUtils;

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
        String[] income = storage.getByName(topic);
        String[] base = ArrayUtils.remove(income, 0);
        Banner fixed = new FixedBanner(base);
        String fix = Arrays.toString(fixed.makeBanner(size));
        boolean flow = true;
        while (flow) {
            if (type == 1) {
                Banner mixed = new MixedBanner(base);
                System.out.println(Arrays.toString(mixed.makeBanner(size)));
                System.out.println("Press any button to refresh or Q to exit.");
                Scanner d = new Scanner(System.in);
                String o = d.next();
                if ("Q".equals(o)) {
                    flow = false;
                }
            }  else if (type == 2) {
                System.out.println(fix);
                System.out.println("Press any button to refresh or Q to exit.");
                Scanner d = new Scanner(System.in);
                String o = d.next();
                if ("Q".equals(o)) {
                    flow = false;
                }
            }
        }
    }
}