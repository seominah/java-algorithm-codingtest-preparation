package string.s_09;

import java.util.Scanner;

public class Main {
    public int solution(String str) {
        int answer = 0;
        str = str.toUpperCase().replaceAll("[A-Z]", "");
        answer = Integer.parseInt(str);
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.print(T.solution(str));
    }
}
