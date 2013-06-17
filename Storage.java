package com.ciklum.study.newbanner;

import java.util.Arrays;

public class Storage {
    @Override
    public String toString() {
        return "Storage{" +
                "base=" + Arrays.toString(base) +
                '}';
    }

    public String[][] getBase() {
        return base;
    }


     public  String[] getByName (String topic) {
        Storage s = new Storage();
        int k = 0;
        for (int i = 0; i < s.getBase().length; i++) {
            if (s.getBase()[i][0].equalsIgnoreCase(topic)) {
                k = i;
            }
        }
        return s.getBase()[k];







    }


    private String[][] base = {{"AUTO","Audi","BMW","Lada","Toyota","Ford","Dodge","Maserati","Mercedes","Lexus","Nissan","Mitsubishi","Citroen"},
            {"MOTO","Ducati","BMW","Yamaha","Honda","Kawasaki","Aprilia"},
            {"VELO","Bianchi","Colnago","Eddie Mercx","HVZ","Kellys","Samoilov","Tommassini","Battaglin"},
            {"SCOOTER","Giorno","Verde","Vino","Julio","Vespa","Lambretta"}};

}
