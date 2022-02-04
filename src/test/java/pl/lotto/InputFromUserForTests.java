package pl.lotto;

import java.util.Set;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class InputFromUserForTests implements InputFromUser {

    Set<Integer> numbers;

    @Override
    public Set<Integer> receiveSixNumbersFromUser() {
        return numbers;
    }
}
