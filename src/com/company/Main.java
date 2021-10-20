package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("type in a number");
        int number = scan.nextInt();

        System.out.println("type in a thing");
        String thing = scan.next();

        int number2 = number++;
        String frogman = thing.substring(number2, number);
        System.out.print(frogman);
    }
}
