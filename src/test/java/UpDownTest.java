import org.junit.Test;

import static org.junit.Assert.*;


public class UpDownTest {

    @Test
    public void makeRandom() {
        UpDown upDown = new UpDown();
        int test = upDown.makeRandom();
        assertTrue(test<100 && test > 0);

    }

    @Test
    public void check() {
        UpDown upDown = new UpDown();
        int test = upDown.makeRandom();
        upDown.setAnswer(test);
        assertEquals(upDown.check(test),true);
        assertEquals(upDown.check(test-1),false);
        assertEquals(upDown.check(test+1),false);
    }

    @Test
    public void remainCoin() {
        UpDown upDown = new UpDown();
        for(int i=0;i<10;i++)
            upDown.useCoin();
        assertEquals(upDown.remainCoin(),0);
    }
}