import java.util.InputMismatchException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lan.zold.Rombusz;
public class RombuszTest {
    Rombusz romb;
    @BeforeTest
    public void setUp(){
        this.romb = new Rombusz();
    }
    @Test
    public void TestCalcArea(){
        double actual = this.romb.calcArea(30.0, 40.5 );
        double expected = 584.5;
        Assert.assertEquals(actual, expected);
    }
    
    
}
