package pl.lotto;

import java.util.Arrays;
import java.util.HashSet;
import org.junit.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HitsNumbersTest {

//    @Test
//    public void should_generate_six_numbers() {
//        //given
//        NumberGenerator generateNumbers = new NumberGenerator();
//        //when
//
//        //then
//        Assert.assertEquals(generateNumbers.randomNumbersList().size(), 6);
//        Assert.assertEquals(generateNumbers.randomNumbersList().size(), 6);
//        Assert.assertEquals(generateNumbers.randomNumbersList().size(), 6);
//    }

    @Test
    public void should_test_lotto_game() {
        // given
        Lotto lotto = new Lotto(
                new InputNumbers(new InputFromUserForTests(new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6)))),
                new NumberGenerator(),
                new HitsNumbers());

        // when
        LottoResult lottoResult = lotto.start();

        // then
        assertThat(lottoResult.getMessage()).isEqualTo("Liczba trafien: 6");
    }


}
