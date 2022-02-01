package data;


import java.util.*;

public class ChooseYourNumbers {

    public Set myNumbers() {

        Set<Integer> selectedNumbers = new TreeSet<>();
        for (int i = 0; selectedNumbers.size() < 6; i++) {
            System.out.println("Podaj liczbe");
            Scanner scan = new Scanner(System.in);
            Integer choice = scan.nextInt();
            if (choice < 100 && choice > 0) {
                selectedNumbers.add(choice);
            } else System.out.println("Musisz wybrac liczbe z przedzialu 1-99");
        }
        return selectedNumbers;
    }
}

