

import data.GenerateNumbers;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class HitsNumbersTest {


    @Test
    public void should_generate_six_numbers() {
        //given
        GenerateNumbers generateNumbers = new GenerateNumbers();
        //when

        //then
        Assert.assertEquals(generateNumbers.randomNumbersList().size(), 6);
        Assert.assertEquals(generateNumbers.randomNumbersList().size(), 6);
        Assert.assertEquals(generateNumbers.randomNumbersList().size(), 6);
    }


}
