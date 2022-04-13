package lotto;


import org.junit.Test;

import java.util.Scanner;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class HitsNumbersTest {
/*    @Test
    public void should_generate_six_numbers() {
        //given
        NumbersGenerator numbersGenerator = new NumbersGenerator();
        //when

        //then
        Assert.assertEquals(numbersGenerator.randomNumbersList().size(), 6);
        Assert.assertEquals(numbersGenerator.randomNumbersList().size(), 6);
        Assert.assertEquals(numbersGenerator.randomNumbersList().size(), 6);
    }*/

@Test
    public void shoudl_test_lotto_game(){
    //given
    Lotto lotto=new Lotto(
            new InputNumbers(new InputFromUserForTestImpl()),
            new NumbersGenerator(),
            new HitsNumbers());

    //when
    LottoResult lottoResult = lotto.start();
    //then
    assertThat(lottoResult.getMessage()).isEqualTo("Liczba trafien: 6");
}
}
