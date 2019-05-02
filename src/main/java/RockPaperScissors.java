import lombok.Data;

import java.util.Random;
import java.util.Scanner;

@Data
public class RockPaperScissors {
    int computer; // 0 is rock, 1 is paper, 2 is scissors
    int user;
    private final int rock = 0;
    private final int paper = 1;
    private final int scissors = 2;

    private final int lose = -1;
    private final int draw = 0;
    private final int win = 1;

    private final int error = -404;

    public void init() {
        computer = generate();
        System.out.println(computer);
    }

    private int generate() {
        Random random = new Random();
        return random.nextInt(3);
    }

    public int battle(int computer, int user) { // -1 : user lose, 0 : draw, 1 : user win
        if (computer == rock) { // rock
            switch (user) {
                case rock:
                    return draw;
                case paper:
                    return win;
                case scissors:
                    return lose;
                default:
                    return error;
            }
        } else if (computer == paper) { // paper
            switch (user) {
                case paper:
                    return draw;
                case scissors:
                    return win;
                case rock:
                    return lose;
                default:
                    return error;
            }
        } else if (computer == scissors) { // rock
            switch (user) {
                case scissors:
                    return draw;
                case rock:
                    return win;
                case paper:
                    return lose;
                default:
                    return error;
            }
        }
        return error;
    }

    public void run() {
        init();
        System.out.println("Welcome to RockPaperScissor");
        System.out.println("Choose rock-paper-scissors");
        System.out.println("rock : 0");
        System.out.println("paper : 1");
        System.out.println("scissors : 2");
        Scanner scanner = new Scanner(System.in);
        user = scanner.nextInt();

        if(user > 2 || user < 0) {
            while(user < 3 && user > 0) {
                printError();
                user = scanner.nextInt();
            }
        }
        int result = battle(computer, user);
        if(result == win) {
            System.out.println("You win");
        }
        else if(result == lose) {
            System.out.println("You lose");
        }
        else if(result == draw) {
            System.out.println("You draw");
        }
    }

    public void printError() {
        System.out.println("Error. input 0 or 1 or 2");
    }
}
