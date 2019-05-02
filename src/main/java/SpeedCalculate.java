import javafx.beans.binding.ListBinding;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpeedCalculate {
    int[] numberList = new int[3];
    char[] strings = new char[2];
    char[] result = new char[5];

    public int[] makeNumber() {
        for (int i = 0; i < 3; i++) {
            int number = (int) (Math.random() * 10 + 1);
            numberList[i] = number;
        }
        return numberList;
    }

    public char[] makeOperator() {

        char[] operation = {'/', '*', '+', '-'};
        for (int i = 0; i < 2; i++) {
            int op = (int) (Math.random() * 3);
            strings[i] = operation[op];
        }
        return strings;
    }

    public char[] makeResult() {
        int z = 0;
        for (int i = 0; i < 5; i = i + 2) {
            result[i] = (char) (numberList[z]);
            z++;
        }
        int y = 0;
        for (int i = 1; i < 4; i = i + 2) {
            result[i] = strings[y];
            y++;
        }
        return result;
    }

    public int calculate(char[] result) {
        int _result = 0;

        int prevNum = result[0];
        if(result[0] > 48)
        {
            prevNum -= 48;
        }
        int nextNum = result[2];
        if(result[2] > 48)
        {
            nextNum -= 48;
        }
        int lastNum = result[4];
        if(result[4] > 48)
        {
            lastNum -= 48;
        }
        char s = result[1];
        switch (s) {
            case '*':
                _result = prevNum * nextNum;
                break;
            case '+':
                _result = prevNum + nextNum;
                break;
            case '-':
                _result = prevNum - nextNum;
                break;
            case '/':
                _result = prevNum / nextNum;
                break;
        }
        s = result[3];
        switch (s) {
            case '*':
                _result = _result * lastNum;
                break;
            case '+':
                _result = _result + lastNum;
                break;
            case '-':
                _result = _result - lastNum;
                break;
            case '/':
                _result = _result / lastNum;
                break;
        }

        return _result;

    }

    public void run() {
        makeNumber();
        makeOperator();
        char[] result = makeResult();
        System.out.print((short) result[0]);
        System.out.print(result[1]);
        System.out.print((short) result[2]);
        System.out.print(result[3]);
        System.out.println((short) result[4]);

        Scanner s = new Scanner(System.in);
        System.out.print("답이 무엇일까요? :");
        int x = s.nextInt();
        if (x == calculate(result)){
            System.out.println("정답입니다.");
        }
        else{
            System.out.println("오답입니다.");
        }
    }

}
