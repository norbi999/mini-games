package lotto;

import lombok.AllArgsConstructor;

import java.util.*;

@AllArgsConstructor
 class InputNumbers {

    private final InputFromUser inputFromUser;

     Set<Integer> myNumbers(){
        return inputFromUser.receiveSixNumbers();
    }
}

