package pl.lotto;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class InputFromUserFromScanner implements InputFromUser {

    private final Scanner scanner;

    @Override
    public Set<Integer> receiveSixNumbersFromUser() {
        Set<Integer> selectedNumbers = new TreeSet<>();
        while (selectedNumbers.size() < 6) {
            System.out.println("Podaj liczbe");
            int choice = scanner.nextInt();
            if (choice < 100 && choice > 0) {
                selectedNumbers.add(choice);
            } else {
                System.out.println("Musisz wybrac liczbe z przedzialu 1-99");
            }
        }
        return selectedNumbers;
    }
}
