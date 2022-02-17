package com.company;

public class Main {

    public static void main(String[] args) {
        Kvartira kv = new Kvartira("ул.Озерная");
        System.out.println(kv);
        Objijitia obji = new Objijitia("ул.македонская");
        System.out.println(obji);
        Hotel hotel = new Hotel("ул.маяковская");
        System.out.println(hotel);
        Uybuloo [] uybulolor = {kv,obji,hotel};

        for (Uybuloo adam:uybulolor) {
            adam.payment();
            adam.residents();
        }
    }
}
