package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first parameter:");
        int a = sc.nextInt();
        System.out.println("Enter the second parameter:");
        int b = sc.nextInt();

        try {
            count(a, b);
        } catch (InvalidParameter e) {
            System.out.println("Invalid parameter: " + e.getMessage());
        }
    }

    static void count(int a, int b) throws InvalidParameter {
        if (a > b) {
            throw new InvalidParameter("The second parameter must be bigger to the first parameter");
        }

        int count = b - a;
        for (int i = 1; i <= count; i++) {
            System.out.println(i);
        }
    }
}
