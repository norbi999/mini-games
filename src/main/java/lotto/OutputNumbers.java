package lotto;

import lombok.AllArgsConstructor;

import java.util.Set;

@AllArgsConstructor
class OutputNumbers {

    private final OutputFromLotto outputFromLotto;

    Set<Integer> lottoNumbers() {
        return outputFromLotto.drawnSixNumbers();
    }
}
