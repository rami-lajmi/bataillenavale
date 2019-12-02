package com.rami.lajmi;

import java.util.Random;


public class Ocean {

        Random r = new Random();

        Navire[] navires = new Navire[5]; //creates an array that can hold 5 Player objects
        for(Navire navire : navires) {
            navire.setCx((int) (Math.random() * ((10 - 1) + 1)) + 1);
            navire.setCy((char)(r.nextInt(10) + 'A'));
            navire.setDir(Directions.NORTH);
            System.out.println(navire.getType()+" | Pt de placement : "+navire.getCy()+navire.getCx()+" | "+navire.getDir());
        }


}
