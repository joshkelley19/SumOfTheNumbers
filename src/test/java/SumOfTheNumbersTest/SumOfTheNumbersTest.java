package SumOfTheNumbersTest;

import org.junit.Assert;
import org.junit.Test;
import static SumOfTheNumbers.SumOfTheNumbers.sum;

/**
 * Created by joshuakelley on 9/9/16.
 */
public class SumOfTheNumbersTest {
    @Test
    public void SumTest(){
        Assert.assertEquals(15, sum(5));
    }
}
