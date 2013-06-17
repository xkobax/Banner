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

    private String[][] base = {{"AUTO","Audi","BMW","Lada","Toyota","Ford","Dodge","Maserati","Mercedes","Lexus","Nissan","Mitsubishi","Citroen"},
            {"MOTO","Ducati","BMW","Yamaha","Honda","Kawasaki","Aprilia"},
            {"VELO","Bianchi","Colnago","Eddie Mercx","HVZ","Kellys","Samoilov","Tommassini","Battaglin"},
            {"SCOOTER","Giorno","Verde","Vino","Julio","Vespa","Lambretta"}};

}
