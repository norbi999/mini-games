package lotto;

import lombok.AllArgsConstructor;
import java.util.Set;

@AllArgsConstructor
public class InputFromUserForTest implements InputFromUser {
    Set<Integer> numbers;
    @Override
    public Set<Integer> receiveSixNumbers() {
        return numbers;
    }
}