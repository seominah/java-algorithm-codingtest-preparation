package string.s_02;

import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String answer = "";
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            if (c >= 65 && c <= 90) {
                answer += (c+32);
            } else {
                answer += (c-32);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.printf(T.solution(str));
    }
}
