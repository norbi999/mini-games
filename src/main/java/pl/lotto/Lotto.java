package pl.lotto;

import java.util.Scanner;
import java.util.Set;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Lotto {

    private final InputNumbers inputNumbers;
    private final NumberGenerator numberGenerator;
    private final HitsNumbers hitsNumbers;
//    private final Scanner scan;

    public LottoResult start() {
        System.out.println("Wybierz Gre");
        System.out.println("1 - Lotek");
//        String choice = scan.nextLine();

        Set<Integer> chooseYourNumbers = inputNumbers.myNumbers();
        Set<Integer> generateNumbers = numberGenerator.randomNumbersList();
        return hitsNumbers.hits(chooseYourNumbers, generateNumbers);

//        switch (choice) {
//            case "1":
//
//            default:
//                System.out.println("Zły wybor");
//        }
//        return new LottoResult("you didnt choice anything");
    }
}
