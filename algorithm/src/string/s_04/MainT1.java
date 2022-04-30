package string.s_04;

import java.util.ArrayList;
import java.util.Scanner;

public class MainT1 {
    public ArrayList<String> solution(int n, String[] strings) {
        ArrayList<String> answer = new ArrayList<>();
        for (String s : strings) {
            String tmp = new StringBuffer(s).reverse().toString();
            answer.add(tmp);
        }

        return answer;
    }

    public static void main(String[] args) {
        MainT1 T = new MainT1();
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
