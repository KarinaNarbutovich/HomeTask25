package lesson25;
//The fifth exercise
import java.util.Scanner;

public class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }

    public static void main(String[] args) throws MyException {
        int num1, num2, num;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter numerator: ");
        num1 = in.nextInt();
        System.out.print("Enter Denominator: ");
        num2 = in.nextInt();
        try {
            num = num1 / num2;
            System.out.println("Result = " + num);
        } catch (ArithmeticException e) {
            throw new MyException("The denominator can't to be zero");

        }
    }
}



