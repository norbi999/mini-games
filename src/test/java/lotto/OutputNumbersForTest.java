package lotto;

import lombok.AllArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
public class OutputNumbersForTest implements OutputFromLotto{
   Set<Integer>numbers;
    @Override
    public Set<Integer> drawnSixNumbers() { return numbers; }
}
