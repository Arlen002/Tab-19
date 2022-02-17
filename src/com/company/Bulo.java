package com.company;

public abstract class Bulo {
    private String adress;

    public Bulo(String adress) {
        this.adress = adress;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return " Bulo { " +
                " adress = " + adress + '\'' +
                " }\n";
    }
}
