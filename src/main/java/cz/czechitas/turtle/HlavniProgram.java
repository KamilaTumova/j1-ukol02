package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

public class HlavniProgram {
    private Turtle zofka;

    public void start() {
        zofka = new Turtle();

        //nakresliCtverec(20);
        //nakresliObdelnik(20,40);

    }


public void nakresliCtverec(double strana_a){
    for (int i = 0; i < 4; i++) {
        zofka.move(strana_a);
        zofka.turnRight(90);
    }

}

public void nakresliObdelnik(double strana_a, double strana_b){
    for (int i = 0; i < 2; i++) {
        zofka.move(strana_a);
        zofka.turnRight(90);
        zofka.move(strana_b);
        zofka.turnRight(90);
}
    }
    public static void main(String[] args) {
        new HlavniProgram().start();

    }

}

