package data;

import java.util.*;

public class HitsNumbers {

    public void hits(Set first, Set second) {

        first.retainAll(second);
        System.out.println("Liczba trafien: " + first.size());
    }
}














