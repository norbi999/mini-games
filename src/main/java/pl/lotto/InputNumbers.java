package pl.lotto;


import java.util.Set;
import lombok.AllArgsConstructor;

@AllArgsConstructor
class InputNumbers {

    private final InputFromUser inputFromUser;

    Set<Integer> myNumbers() {
        return inputFromUser.receiveSixNumbersFromUser();
    }
}

