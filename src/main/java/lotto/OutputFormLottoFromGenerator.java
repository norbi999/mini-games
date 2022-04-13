package lotto;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

class OutputFormLottoFromGenerator implements OutputFromLotto{
    private final int MAX_GENERATED_NUMBER = 98;

    public Set<Integer> drawnSixNumbers() {
        Set<Integer> randomNumbers = new TreeSet<>();
        while(randomNumbers.size() < 6) {
            Random r = new Random();
            int a = (r.nextInt(MAX_GENERATED_NUMBER) + 1);
            randomNumbers.add(a);
        }
        System.out.println("Wylosowane liczby: " + randomNumbers);
        return randomNumbers;
    }
}

