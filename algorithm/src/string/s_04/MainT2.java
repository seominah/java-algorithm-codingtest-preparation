package string.s_04;

import java.util.ArrayList;
import java.util.Scanner;

public class MainT2 {
    public ArrayList<String> solution(int n, String[] strings) {
        ArrayList<String> answer = new ArrayList<>();
        for (String s : strings) {
            char[] charArray = s.toCharArray();
            int lt = 0;
            int rt = s.length() - 1;
            while (lt < rt) {
                char tmp = charArray[lt];
                charArray[lt] = charArray[rt];
                charArray[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(charArray);
            answer.add(tmp);
        }

        return answer;
    }

    public static void main(String[] args) {
        MainT2 T = new MainT2();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String[] strings = new String[num];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.next();
        }
        for (String str :
                T.solution(num, strings)) {
            System.out.println(str);
        }
    }

}
