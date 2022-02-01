package data;

import java.util.Scanner;
import java.util.Set;

public class Lotto {
    public void start() {

        System.out.println("Wybierz Gre");
        System.out.println("1 - Lotek");


        Scanner scan = new Scanner(System.in);
        String choice = scan.nextLine();
        switch (choice) {
            case "1":
                Set chooseYourNumbers = new ChooseYourNumbers().myNumbers();
                Set generateNumbers = new GenerateNumbers().randomNumbersList();
                HitsNumbers hitsNumbers = new HitsNumbers();
                hitsNumbers.hits(chooseYourNumbers, generateNumbers);

                break;
            default:
                System.out.println("Zły wybor");

        }
    }
}
