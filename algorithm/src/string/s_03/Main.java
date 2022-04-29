package string.s_03;

import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String answer = "";
        int max = 0;
        String[] strArray = str.split(" ");

        for (String s : strArray) {
            if (s.length() > max) {
                max = s.length();
                answer = s;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.printf(T.solution(str));
    }
}
