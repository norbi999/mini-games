package pl.lotto;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

class NumberGenerator {

    private static final int MAX_GENERATED_NUMBER = 98;

    public Set<Integer> randomNumbersList() {
        Set<Integer> randomNumbers = new TreeSet<>();
        for (int i = 0; randomNumbers.size() < 6; i++) {
            Random r = new Random();
            int a = (r.nextInt(MAX_GENERATED_NUMBER) + 1);
            randomNumbers.add(a);
        }
        System.out.println("Wylosowane liczby: " + randomNumbers);
        return randomNumbers;
    }
}
