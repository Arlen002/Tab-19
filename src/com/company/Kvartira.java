package com.company;

public class Kvartira extends Bulo implements Uybuloo{

    public Kvartira(String adress) {
        super(adress);
    }

    @Override
    public void payment() {
        System.out.println(" \n Квартирада жашагандар комунальный услуга толошот.");
    }

    @Override
    public void residents() {
        System.out.println(" 7-8 адам жашайт\n");
    }
}
