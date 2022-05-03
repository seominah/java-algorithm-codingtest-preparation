package string.s_07;

import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String answer = "";
        str = str.toLowerCase();
        char[] charArray = str.toCharArray();
        int lt = 0;
        int rt = charArray.length - 1;
        while (lt < rt) {
            if (charArray[lt] == charArray[rt]) answer = "YES";
            else {
                return "NO";
            }
            lt++;
            rt--;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(T.solution(str));
    }
}
