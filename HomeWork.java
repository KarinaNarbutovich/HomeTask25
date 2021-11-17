package lesson25;

import java.util.Random;
import java.util.Scanner;

public class HomeWork {
    // The first exercise:
    public void sum()  {
        Integer secondNum = null;
        int firstNum = 5;
        try {
            Integer sum = firstNum + secondNum;
            System.out.println("Sum of numbers = " + sum);

        } catch (NullPointerException e) {
            System.err.println("The secondNum can't to be null");
        }
        finally {
            System.out.println("Inside bloсk finally");
        }
    }

    public static void main(String[] args) {
        // The first exercise:
        HomeWork firstEx = new HomeWork();
        firstEx.sum();
        // The second exercise:
        int[] array1 = new int[5];
        var random1 = new Random();
        try {
            for (int i = 0; i <= array1.length; i++) {
                array1[i] = random1.nextInt();
                System.out.println("Value: " + array1[i] + " " + "Index: " + i);
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Array index out of bounds exception: index 5 out of bounds for length 5");
        }
        finally {
            System.out.println("Inside bloсk finally");
        }
    }
}
