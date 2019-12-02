package com.rami.lajmi;

public class Navire {
    private String type;
    private int taille;
    private Directions dir;
    private int cx;

    private char cy;

    public String getType(){
        return "Navire";
    }
    public int getTaille() { return 3; }
    public Directions getDir() { return dir; }
    public int getCx() {
        return cx;
    }
    public char getCy() {
        return cy;
    }
    public void setDir(Directions d){ dir = d; }
    public void setCx(int x) {
        cx = x;
    }
    public void setCy(char y) {
        cy = y;
    }

}
