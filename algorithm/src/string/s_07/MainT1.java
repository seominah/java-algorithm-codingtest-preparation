package string.s_07;

import java.util.Scanner;

public class MainT1 {
    public String solution(String str) {
        String answer = "YES";
        str = str.toUpperCase();
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) return "NO";
        }

        return answer;
    }


    public static void main(String[] args) {
        MainT1 T = new MainT1();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(T.solution(str));
    }
}
