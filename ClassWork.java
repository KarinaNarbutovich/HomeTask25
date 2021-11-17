package lesson25;

import java.util.Arrays;
import java.util.Scanner;

public class ClassWork {


    public enum NameOfHero {

        SPIDERMAN("hjhjh"),
        THOR("mmk"),
        HULK("qwe");

        private String superPower;

        NameOfHero(String superPower) {
            this.superPower = superPower;
        }

        public String superPower() {
            return superPower;
        }
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(NameOfHero.values()));
//        Scanner scanner= new Scanner.nextLine();
//        NameOfHero thor = NameOfHero.valueOf("Thor");
//        System.out.println(thor.);
    }
}
