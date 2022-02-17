package com.company;

public class Hotel extends Bulo implements Uybuloo{
    public Hotel(String adress) {
        super(adress);
    }

    @Override
    public void payment() {
        System.out.println(" Гостиницада жашагандар аренда толошот.");
    }

    @Override
    public void residents() {
        System.out.println(" 2 адам жашайт\n");
    }
}
