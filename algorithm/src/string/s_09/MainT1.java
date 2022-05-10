package string.s_09;

import java.util.Scanner;

public class MainT1 {
    public int solution(String str) {
        int answer = 0;
        for (char c : str.toCharArray()) {
            if (c >= 48 && c <= 57) answer = answer*10 + (c-48);
        }
        return answer;
    }

    public static void main(String[] args) {
        MainT1 T = new MainT1();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.print(T.solution(str));
    }
}
