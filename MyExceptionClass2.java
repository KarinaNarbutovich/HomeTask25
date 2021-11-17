package lesson25;

import java.util.Scanner;

//The fourth exercise
public class MyExceptionClass2 extends RuntimeException {
    public MyExceptionClass2(String message) {
        super(message);
    }

    public MyExceptionClass2() {
    }

    public void getOperationByCode() throws MyExceptionClass2 {
        Integer opcode;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the operation code = ");
        opcode = in.nextInt();

        if (opcode == 1) {
            System.out.println("Number added");
        } else if (opcode == 2) {
            System.out.println("Number deleted");
        } else {
            throw new MyExceptionClass2("Wrong opcode entered (valid codes: 1,2)");
        }
    }

    public static void main(String[] args) {
        MyExceptionClass2 first = new MyExceptionClass2();
        try {
            first.getOperationByCode();
        } catch (MyExceptionClass2 e) {
            e.printStackTrace();
        }
    }
}