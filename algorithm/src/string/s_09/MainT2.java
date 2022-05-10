package string.s_09;

import java.util.Scanner;

public class MainT2 {
    public int solution(String str) {
        String answer = "";
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) answer += c;
        }
        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        MainT2 T = new MainT2();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.print(T.solution(str));
    }
}
