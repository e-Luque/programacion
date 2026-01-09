package com.juego.clases;

public class GestorClases {
    Clases guerrero = new Clases("Guerrero", 120,3,0,0);
    Clases paladin = new Clases("Paladin",115,2,1,0);
    Clases monje = new Clases("Monje",110,2,0,1);
    Clases picaro = new Clases("Picaro",105,0,0,3);
    Clases druida = new Clases("Druida",100,2,1,0);
    Clases sacerdote = new Clases("Sacerdote", 95,0,3,0);
    Clases mago = new Clases("Mago",90,0,3,0);
    Clases bardo = new Clases("Bardo",90,0,3,0);

    public Clases getGuerrero() {
        return guerrero;
    }

    public Clases getDruida() {
        return druida;
    }

    public Clases getMonje() {
        return monje;
    }

    public Clases getPaladin() {
        return paladin;
    }

    public Clases getPicaro() {
        return picaro;
    }

    public Clases getBardo() {
        return bardo;
    }

    public Clases getMago() {
        return mago;
    }

    public Clases getSacerdote() {
        return sacerdote;
    }
}
