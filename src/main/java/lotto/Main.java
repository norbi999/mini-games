package lotto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lotto lotto = new Lotto(
                new InputNumbers(new InputFromUserFromScanner(new Scanner(System.in))),
                new OutputNumbers(new OutputFormLottoFromGenerator()),
                new HitsNumbers());
        lotto.start();
    }
}