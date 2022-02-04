package pl.lotto;

import java.util.Set;

class HitsNumbers {

    LottoResult hits(Set<Integer> first, Set<Integer> second) {
        first.retainAll(second);
        return new LottoResult("Liczba trafien: " + first.size());
    }
}














