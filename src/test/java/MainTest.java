import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

public class MainTest {


    @Test
    public void mainMock(){
        Main _main = mock(Main.class);
        assertTrue(_main != null);

    }   //main 생성 Test

    Main main = new Main();

    @Test
    public void makeUpDownTest(){
        assertTrue(main.makeUpDown().getClass()==UpDown.class);
    }   //upDown 생성 Test

    @Test
    public void makeSpeedCalculateTest(){
        assertTrue(main.makeSpeedCalculate().getClass() ==SpeedCalculate.class);
    }   //SpeedCalculate 생성 Test

    @Test
    public void makeUpgradeRockPaperScissorsTest(){
        assertTrue(main.makeUpgradeRockPaperScissors().getClass()==UpgradeRockPaperScissors.class);
    }   //UpgradeRockPaperScissors 생성 Test

}