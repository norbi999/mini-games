package main;

import java.util.Scanner;

import data.RandomNumbers;


public class Main {

    public static void main(String[] args) {

        System.out.println("Wybierz Gre");
        System.out.println("1 - Lotek");

        RandomNumbers randomNumbers = new RandomNumbers();

        Scanner scan = new Scanner(System.in);
        String choice = scan.nextLine();
        switch (choice) {
            case "1":
                System.out.println("Podaj swoje liczby");
                randomNumbers.setNumbers();
                randomNumbers.numberList();
                randomNumbers.hits();
                break;
            default:
                System.out.println("Zły wybor");

        }
    }
}
