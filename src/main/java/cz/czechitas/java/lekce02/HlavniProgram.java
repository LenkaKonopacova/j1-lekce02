package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

public class
HlavniProgram {
    private Turtle zofka;
    public void trojuhelnik() {
        zofka = new Turtle();


        {
            zofka.turnLeft(60);
            zofka.move(60);
            zofka.turnRight(120);
            zofka.move(60);


        }


    }


    public void obdelnik() {
        zofka = new Turtle();

        for (int i = 0; i < 2; i++) {
            zofka.move(60);
            zofka.turnRight(90);
            zofka.move(100);
            zofka.turnRight(90);



        }

    }












    public void nohy() {
        zofka = new Turtle();
        zofka.penDown();

        {
            zofka.turnLeft(150);
            zofka.move(20);
            zofka.turnLeft(120);
            zofka.penUp();
            zofka.move(20);
            zofka.penDown();
            zofka.turnLeft(120);
            zofka.move(20);

            zofka.penUp();
            zofka.turnRight(120);
            zofka.move(100);

            zofka.penDown();
            zofka.turnRight(120);
            zofka.move(30);
            zofka.turnLeft(120);
            zofka.penUp();
            zofka.move(30);
            zofka.penDown();
            zofka.turnLeft(120);
            zofka.move(30);










        }

    }
    public void prasatko() {
        zofka = new Turtle();


        {
            nohy();
            trojuhelnik();
            obdelnik();


        }



    }

    public static void main(String[] args){


          new HlavniProgram().prasatko();










}}

