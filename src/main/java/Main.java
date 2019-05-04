
import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
    public void main(String[] args) {
        System.out.println("<<<랜덤게임을 시작합니다>>>");
        int select ;
        Scanner sc = new Scanner(System.in);
        select = this.selectGame();

        while (select == 1 | select == 2 | select == 3) {
            switch (select) {
                case 1:
                    UpDown updown = this.makeUpDown();
                    updown.run();
                    break;

                case 2:
                    RockPaperScissors urps = this.makeUpgradeRockPaperScissors();
                    urps.run();
                    break;

                case 3:
                    SpeedCalculate ucc = this.makeSpeedCalculate();
                    ucc.run();
                    break;

                default:
                    System.out.println("잘못된 입력입니다.");
            }

            select = this.selectGame();
        }

        System.out.println("<<<랜덤게임을 종료합니다>>>");
    }

    public void printSelectGameMessage(){
        System.out.print("게임을 선택하세요: (1:UpDown, 2:UpgradeRockPaperScissor, 3:SpeedCalculate, 이외값:종료");
    }

    public int selectGame(){
        this.printSelectGameMessage();
        return 1;
    }

    UpDown makeUpDown(){
        return new UpDown();
    }

    RockPaperScissors makeUpgradeRockPaperScissors() {
        return new RockPaperScissors();
    }

    SpeedCalculate makeSpeedCalculate () {
        return new SpeedCalculate();
    }

}
