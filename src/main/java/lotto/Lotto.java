package lotto;

import lombok.AllArgsConstructor;

import java.util.Set;

@AllArgsConstructor
 public class Lotto {

    private final InputNumbers inputNumbers;
    private final OutputNumbers outputNumbers;
    private final HitsNumbers hitsNumbers;
 //   private final Scanner scan;

    public LottoResult start() {

        Set<Integer> chooseYourNumbers = inputNumbers.myNumbers();
        Set<Integer> generateNumbers =outputNumbers.lottoNumbers();
        return hitsNumbers.hits(chooseYourNumbers, generateNumbers);

        /*System.out.println("Wybierz Gre");
        System.out.println("1 - Lotek");
        String choice = scan.nextLine();
        switch (choice) {
            case "1":

                default:
                System.out.println("Zły wybor");

        }
        return new LottoResult("you didn't choice");*/
    }
    }
