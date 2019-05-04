import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class RockPaperScissorsTest {
    private RockPaperScissors rockPaperScissors;
    private final int rock = 0;
    private final int paper = 1;
    private final int scissors = 2;

    private final int lose = -1;
    private final int draw = 0;
    private final int win = 1;

    private final int error = -404;

    @Test
    public void initTest() {
        RockPaperScissors rockPaperScissors = new RockPaperScissors();
        rockPaperScissors.init();
        int value = rockPaperScissors.getComputer();
        assertTrue(value >= 0 && value < 3);
    }

    @Test
    public void imWinBecuaseItsRockTest() {
        RockPaperScissors rockPaperScissors = new RockPaperScissors();
        int result = rockPaperScissors.battle(scissors, rock);
        assertTrue(result == win);
    }

    @Test
    public void imLoseBecuaseItsRockTest() {
        RockPaperScissors rockPaperScissors = new RockPaperScissors();
        int result = rockPaperScissors.battle(paper, rock);
        assertTrue(result == lose);
    }

    @Test
    public void imDrawBecuaseItsRockTest() {
        RockPaperScissors rockPaperScissors = new RockPaperScissors();
        int result = rockPaperScissors.battle(rock, rock);
        assertTrue(result == draw);
    }

    @Test
    public void imWinBecuaseItsScissorsTest() {
        RockPaperScissors rockPaperScissors = new RockPaperScissors();
        int result = rockPaperScissors.battle(paper, scissors);
        assertTrue(result == win);
    }

    @Test
    public void imLoseBecuaseItsScissorsTest() {
        RockPaperScissors rockPaperScissors = new RockPaperScissors();
        int result = rockPaperScissors.battle(rock, scissors);
        assertTrue(result == lose);
    }

    @Test
    public void imDrawBecuaseItsScissorsTest() {
        RockPaperScissors rockPaperScissors = new RockPaperScissors();
        int result = rockPaperScissors.battle(scissors, scissors);
        assertTrue(result == draw);
    }


    @Test
    public void imWinBecuaseItsPaperTest() {
        RockPaperScissors rockPaperScissors = new RockPaperScissors();
        int result = rockPaperScissors.battle(rock, paper);
        assertTrue(result == win);
    }

    @Test
    public void imLoseBecuaseItsPaperTest() {
        RockPaperScissors rockPaperScissors = new RockPaperScissors();
        int result = rockPaperScissors.battle(scissors, paper);
        assertTrue(result == lose);
    }

    @Test
    public void imDrawBecuaseItsPaperTest() {
        RockPaperScissors rockPaperScissors = new RockPaperScissors();
        int result = rockPaperScissors.battle(paper, paper);
        assertTrue(result == draw);
    }

    @Test
    public void errorInputInBattleTest() {
        RockPaperScissors rockPaperScissors = new RockPaperScissors();
        int result = rockPaperScissors.battle(paper, error);
        assertTrue(result == error);
    }
}