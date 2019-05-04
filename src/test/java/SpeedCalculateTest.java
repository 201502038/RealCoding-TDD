import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;


import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;

public class SpeedCalculateTest {
    @Mock
    SpeedCalculate speedCalculate = new SpeedCalculate();

    @Test
    public  void TestMakeoperand() {
        assertThat(speedCalculate.makeNumber(),notNullValue());
    }

    @Test //결과가 최소한번 출력되었는지 확인하는 메소드
    public void checkResult() {
        speedCalculate = mock(SpeedCalculate.class);
        speedCalculate.makeResult();
        Mockito.verify(speedCalculate, Mockito.atMost(1)).makeResult();
    }

    @Test
    public void Testcalculate() {
        char[] r = {'1','+','1','+','1'};
        assertThat(speedCalculate.calculate(r),is(3));
    }



}
