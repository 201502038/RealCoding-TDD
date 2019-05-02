import java.util.Scanner;

public class UpDown {
    private int answer;
    private int coin;
    public UpDown() {
        this.answer = this.makeRandom();
        this.coin = 10;
    }
        public void setAnswer(int answer) {
            this.answer = answer;
        }

        public int makeRandom() {
            return (int) (Math.random() * 100);
        }

        public boolean check(int input) {
            if (answer > input) {
                System.out.println(input + "보다 큰 숫자입니다!!!");
            return false;
        } else if (answer == input) {
            System.out.println("정답입니다!!!");
            return true;
        } else {
            System.out.println(input + "보다 작은 숫자입니다!!!");
            return false;
        }
    }

    public int remainCoin() {
        return this.coin;
    }
    public void useCoin(){
        this.coin--;
    }
    public void run() {
        Scanner scan = new Scanner(System.in);
        int answer = (int) (Math.random() * 100);
        System.out.println("스무고개에 오신 것을 환영합니다.!!!");
        int i = 10;
        while (true) {
            if (i == 0) {
                System.out.println("도전 횟수가 종료되었습니다!!!");
            }
            System.out.print("남은 도전 횟수 : " + i + "\n숫자를 입력해주세요! : ");
            int input = scan.nextInt();
            if (answer > input) {
                System.out.println(input + "보다 큰 숫자입니다!!!");
            } else if (answer == input) {
                System.out.println("정답입니다!!!");
                break;
            } else {
                System.out.println(input + "보다 작은 숫자입니다!!!");
            }
            i--;
        }
    }
}

