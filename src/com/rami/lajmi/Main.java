package com.rami.lajmi;

import java.util.Random;

import java.util.ArrayList; // import the ArrayList class


public class Main {

    public static void main(String[] args) {
        System.out.println("--- Bienvenue dans la bataille navale ---");
        Random r = new Random();

        System.out.println("Bot à vous de placer");

        Ocean.placerBateau();



        char c = (char)(r.nextInt(26) + 'A');
        System.out.println(c);


        Navire Navire = new Navire();
    }
}
