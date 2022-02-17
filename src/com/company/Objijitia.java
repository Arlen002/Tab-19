package com.company;

public class Objijitia extends Bulo implements Uybuloo{
    public Objijitia(String adress) {
        super(adress);
    }

    @Override
    public void payment() {
        System.out.println(" Общежитиеда жашагандар аренда толошот.");
    }

    @Override
    public void residents() {
        System.out.println(" 3-4 адам жашайт\n");
    }
}
