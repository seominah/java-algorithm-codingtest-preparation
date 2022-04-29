package string.s_01;

import java.util.Scanner;

public class Main {

    public int solution(String str, char c) {
        int answer = 0;
        str = str.toLowerCase();
        c = Character.toLowerCase(c);
        char[] charArray = str.toCharArray();

        for (char t : charArray) {
            if (t == c) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char c = scanner.next().charAt(0);
        System.out.println(T.solution(str, c));
    }
}
