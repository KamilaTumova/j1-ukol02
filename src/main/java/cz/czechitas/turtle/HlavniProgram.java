package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka;
    Color modra=new Color(0, 42, 255);;
    Color hneda=new Color(82, 38, 8, 200);;
    Color zelena=new Color(18, 210, 18, 200);


    public void start() {
        zofka = new Turtle();
        nakresliSnehulaka(60,45,25,15,20,modra);
        zofka.turnRight(45);
        zofka.penUp();
        zofka.move(100);
        zofka.turnLeft(45);
        zofka.penDown();
        nakresliZmrzlinu(90,30,20,zelena,hneda);
       zofka.turnLeft(135);
      zofka.penUp();
      zofka.move(200);
   zofka.turnRight(45);
   zofka.move(200);
        zofka.turnRight(90);
   zofka.penDown();
   nakresliVlak(130,60,50,20,20,hneda);


    }





public void nakresliCtverec(double strana_a){
    for (int i = 0; i < 4; i++) {
        zofka.move(strana_a);
        zofka.turnRight(90);
    }

}
public void nakresliVlak(double strana_a,double strana_b,double polomer,double polomer2,int nuhelnik, Color barva){
        nakresliKolecko(polomer,nuhelnik, barva);
    nakresliObdelnik(strana_a,2*polomer);
    zofka.turnLeft(90);
    nakresliObdelnik(strana_a,strana_b);
    zofka.move(strana_a/4);
    zofka.turnLeft(180);
    nakresliKolecko(polomer2,nuhelnik,barva);
    zofka.turnLeft(180);
    zofka.move(strana_a/2);
    zofka.turnLeft(180);
    nakresliKolecko(polomer2,nuhelnik,barva);
    zofka.turnLeft(180);
    zofka.move(strana_a/4);
    zofka.turnRight(90);
    nakresliPraTrojuhelnik(strana_b/1.5,barva);
}
public void nakresliZmrzlinu(double strana_b,double polomer,int nuhelnik, Color barvaZmrzliny, Color barvaKornoutu){
     nakresliKolecko(polomer,nuhelnik,barvaZmrzliny);
        nakresliRovTrojuhelnik(2*polomer,strana_b,barvaKornoutu);



}

    public void nakresliSnehulaka(double polomer1,double polomer2,double polomer3,double polomer4,int neuhenik, Color barva){

       zofka.turnRight(90);
        nakresliKolecko(polomer1,neuhenik,barva);
        zofka.turnLeft(180);
       nakresliKolecko(polomer2,neuhenik,barva);
       zofka.turnRight(90);
       zofka.penUp();
       zofka.move(2*polomer2);
       zofka.penDown();
        zofka.turnLeft(90);
      nakresliKolecko(polomer3,neuhenik,barva);
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(polomer2);
        zofka.turnRight(90);
        zofka.move(polomer2);
        zofka.turnLeft(90);
        zofka.penDown();
        nakresliKolecko(polomer4,neuhenik,barva);
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(2*polomer2);
        zofka.turnLeft(90);
        zofka.penDown();
        nakresliKolecko(polomer4,neuhenik,barva);

    }
    public void nakresliRovTrojuhelnik(double strana_a,double strana_b,Color barvaCary) {
        double x = ((strana_a/2)/strana_b);
        double ang= (Math.toDegrees(Math.acos(x)));
        zofka.setPenColor(barvaCary);
        zofka.turnRight(90);
        zofka.move(strana_a);
        zofka.turnRight((180-ang));
        zofka.move(strana_b);
        zofka.turnRight((2*ang));
        zofka.move(strana_b);
        zofka.turnRight(90-ang);


    }
    public void nakresliPraTrojuhelnik(double strana_a,Color barva){
        var velikostPrepony = Math.sqrt(2*Math.pow(strana_a, 2));
        zofka.move(strana_a);
        zofka.turnLeft(135);
        zofka.move(velikostPrepony);
       zofka.turnLeft(135);
       zofka.move(strana_a);
    }

public void nakresliKolecko(double polomer, double nuhelnik, Color barvaCary){
    zofka.setPenColor(barvaCary);
    double ang = 180/nuhelnik;
    double radians = Math.toRadians(ang);
       double a= polomer*(2*Math.tan((radians)));
    zofka.move(a/2);
    for (int i = 0; i < nuhelnik-1; i++) {
        zofka.turnRight(2*(ang));
        zofka.move(a);

    }
    zofka.turnRight(2*(ang));
    zofka.move(a/2);
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

