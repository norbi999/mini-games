package main;

import java.util.Scanner;

import data.Lotto;


public class Main {

    public static void main(String[] args) {

        System.out.println("Wybierz Gre");
        System.out.println("1 - Lotek");

        Lotto lotto = new Lotto();

        Scanner scan = new Scanner(System.in);
        String choice = scan.nextLine();
        switch (choice) {
            case "1":
                lotto.setNumbers();
                lotto.numberList();
                lotto.hits();
                break;
            default:
                System.out.println("Zły wybor");

        }
    }
}
