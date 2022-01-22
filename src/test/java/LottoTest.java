
import org.junit.Assert;
import org.junit.Test;
import data.Lotto;

import java.util.TreeSet;

public class LottoTest {
    @Test
    public void should_generate_six_numbers(){
        //given
        Lotto lotto=new Lotto();

        //when

        //then
        Assert.assertEquals(lotto.numberList().size(),6);
    }



}
