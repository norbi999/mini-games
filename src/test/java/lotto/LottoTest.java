package lotto;


import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class LottoTest {
@Test
    public void shoudl_test_lotto_game_with_six_right(){
    //given
    Lotto lotto=new Lotto(
            new InputNumbers(new InputFromUserForTest(new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6)))),
            new OutputNumbers(new OutputNumbersForTest(new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6)))),
            new HitsNumbers());

    //when
    LottoResult lottoResult = lotto.start();
    //then
    assertThat(lottoResult.getMessage()).isEqualTo("Liczba trafien: 6");
}@Test
    public void shoudl_test_lotto_game_with_three_right(){
        //given
        Lotto lotto=new Lotto(
                new InputNumbers(new InputFromUserForTest(new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6)))),
                new OutputNumbers(new OutputNumbersForTest(new HashSet<>(Arrays.asList(1, 98, 97, 4, 5, 96)))),
                new HitsNumbers());

        //when
        LottoResult lottoResult = lotto.start();
        //then
        assertThat(lottoResult.getMessage()).isEqualTo("Liczba trafien: 3");
    }
    @Test
    public void shoudl_test_lotto_game_with_one_right(){
        //given
        Lotto lotto=new Lotto(
                new InputNumbers(new InputFromUserForTest(new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6)))),
                new OutputNumbers(new OutputNumbersForTest(new HashSet<>(Arrays.asList(51, 98, 97, 4, 25, 96)))),
                new HitsNumbers());

        //when
        LottoResult lottoResult = lotto.start();
        //then
        assertThat(lottoResult.getMessage()).isEqualTo("Liczba trafien: 1");
    }
}
