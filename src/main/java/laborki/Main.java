package laborki;

/**
 * @author Rafał Sochacki 20047
 * @author Adrian Szostak 19777
 *
 * It is Main class for application from 2nd lesson of JOP
 */

import laborki.model.Cezar;
import laborki.model.Human;
import laborki.model.Prostokat;
import laborki.model.Trojkat;

public class Main {
    public static void main(String[] args) {

        //Zadanie 1
        //2 sposoby utworzenia nowego obiektu klasy Human
        Human rafal = new Human();
        rafal.setAge(30);
        rafal.setWeight(84);
        rafal.setHeight(190);
        rafal.setName("Rafał");
        rafal.setGender("male");
        rafal.setFeetSize(43);
        rafal.setIndexNumber(20047);

        Human adrian = new Human(24, 80, 180, "Adrian", "male", 42, 19777);

        System.out.println(rafal.toString());
        System.out.println(adrian.toString());

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        //Zadanie 2
        Prostokat prostokat = new Prostokat(30, 20);

        System.out.println("Obwod prostokata to: " + prostokat.obwod());
        System.out.println("Pole prostokata to: " + prostokat.pole());
        System.out.println("Przekatna prostokata to: " + prostokat.przekatna());


        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        //Zadanie 3
        Trojkat trojkat = new Trojkat();

        trojkat.setBokA(14);
        trojkat.setBokB(13);
        trojkat.setBokC(15);

        System.out.println("Pole Trojkata: " + trojkat.poleTrojkata());
        System.out.println("Obwod Trojkata: " + trojkat.obwodTrojkata());
        System.out.println("Czy jest to trojkat rownoboczny? " + trojkat.isEquilateral());
        System.out.println("Czy trojkat jest rownoramienny? " + trojkat.isLsosceles());
        System.out.println("Czy trojkat jest roznoboczny? " + trojkat.isScalene());

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        //Zadanie 4
        Cezar cezar = new Cezar();
        cezar.setSlowo("Rafal");
        cezar.setPrzesuniecie(1);
        System.out.println(cezar.szyfrowanie());

        cezar.setSlowo("Adrian");
        cezar.setPrzesuniecie(2);
        System.out.println(cezar.szyfrowanie());

    }


}
