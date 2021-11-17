package lesson25;
//The third exercise

import java.util.Scanner;

public class MyExceptionClass extends Exception {
    public MyExceptionClass() {
    }

    public void getSeriesOfPassport() throws MyExceptionClass {
        String passportSeries;
        Scanner seriesIn = new Scanner(System.in);
        System.out.print("passportSeries = ");
        passportSeries = seriesIn.nextLine();
        boolean series = passportSeries.matches("[A-Z]{2}");
        if (!series) {
            throw new MyExceptionClass();
        }
    }

    public void getIdOfPassport() throws MyExceptionClass {
        String passportId;
        Scanner idIn = new Scanner(System.in);
        System.out.print("passportID = ");
        passportId = idIn.nextLine();
        boolean id = passportId.matches("\\d{7}");
        if (!id) {
            throw new MyExceptionClass();
        }
    }

    public static void main(String[] args) {
        MyExceptionClass user = new MyExceptionClass();
        try {
            user.getSeriesOfPassport();
        } catch (MyExceptionClass e) {
            System.err.println("\nEnter a number other than zero");
            e.printStackTrace();
        }
        try {
            user.getIdOfPassport();
        } catch (MyExceptionClass k) {
            System.err.println("\nIncorrectly entered passport ID");
            k.printStackTrace();
        }
    }
}
