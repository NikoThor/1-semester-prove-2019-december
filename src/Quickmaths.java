import java.util.Scanner;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 13/12/2019
 */

public class Quickmaths {
    public static void main(String[] args) {
        System.out.println("*** QuickMaths! ***");
        start();
    }

    public static int gennemsnit(int a, int b) {
        return (a + b) / 2;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void start() {
        int i = 1;
        while(i >=0) {
            Scanner input = new Scanner(System.in);
            System.out.println("Indtaste A:");
            int a = input.nextInt();
            System.out.println("Indtaste b:");
            int b = input.nextInt();
            System.out.println("Sum: " + sum(a, b));
            System.out.println("Gennemsnit: " + gennemsnit(a, b));
            System.out.println("-------------------------");
        }
    }
}