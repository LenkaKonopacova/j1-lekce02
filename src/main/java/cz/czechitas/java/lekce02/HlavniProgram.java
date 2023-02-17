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
    public void slunce() {
        zofka = new Turtle();
        zofka.penUp();
        zofka.turnLeft(65);
        zofka.move(350);
        zofka.penDown();
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 3; j++) {
                zofka.turnRight(10);
                zofka.move(5);
            }
                zofka.turnLeft(90);
                zofka.move(20);
                zofka.turnLeft(180);
                zofka.move(20);
                zofka.turnLeft(90);





        }

    }
    public void kolo() {
        zofka = new Turtle();
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(150);
        zofka.penDown();
        for (int i = 0; i < 40; i++) {
            zofka.move(3);
            zofka.turnRight(10);


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
    public void xhran() {
        zofka = new Turtle();
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(200);
        zofka.penDown();
        for (int i = 0; i < 8; i++) {
            zofka.move(40);
            zofka.turnRight(45);


        }

    }

    public static void main(String[] args){


       // new HlavniProgram().prasatko();
       // new HlavniProgram().kolo();
       // new HlavniProgram().xhran();
        new HlavniProgram().slunce();










}}

