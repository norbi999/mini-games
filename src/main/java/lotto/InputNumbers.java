package lotto;

import lombok.AllArgsConstructor;

import java.util.Set;

@AllArgsConstructor
class InputNumbers {

    private final InputFromUser inputFromUser;

    Set<Integer> myNumbers() {
        return inputFromUser.receiveSixNumbers();
    }
}

