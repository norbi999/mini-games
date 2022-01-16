package data;

import java.util.*;

public class RandomNumbers {

    TreeSet<Integer> generateNumbers = new TreeSet<Integer>();
    TreeSet<Integer> selectedNumbers = new TreeSet<Integer>();
    int counter = 0;

    public Set numberList() {
        for (int i = 0; generateNumbers.size() < 6; i++) {
            Random r = new Random();
            int a = (r.nextInt(98) + 1);
            generateNumbers.add(a);
        }
        System.out.println("Wylosowane liczby: " + generateNumbers);
        return generateNumbers;
    }

    public void setNumbers() {

        for (int i = 0; selectedNumbers.size() < 6; i++) {
            Scanner scan = new Scanner(System.in);
            Integer choice = scan.nextInt();
            if (choice < 100 && choice > 0) {
                selectedNumbers.add(choice);
            } else System.out.println("Musisz wybrac liczbe z przedzialu 1-99");
        }
    }

    public void hits() {
        for (Integer numb : generateNumbers) {
            for (Integer num : selectedNumbers)
                if (num == numb)
                    counter++;
        }

        System.out.println("liczba trafien to: " + counter);

    }
}














