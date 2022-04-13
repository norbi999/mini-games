package lotto;

import java.util.Set;

 class HitsNumbers {
     LottoResult hits(Set<Integer> first, Set<Integer> second) {
        first.retainAll(second);
       // System.out.println("Liczba trafien: " + first.size());
         return new LottoResult("Liczba trafien: " + first.size());
    }
}














