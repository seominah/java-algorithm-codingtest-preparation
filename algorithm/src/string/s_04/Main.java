package string.s_04;

import java.util.Scanner;

public class Main {
    public String[] solution(int num, String[] strings) {
        String[] strArray = new String[num];
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < strArray.length; i++) {
            sb.append(strings[i]);
            sb.reverse();
            strArray[i] = sb.toString();
            sb.delete(0, sb.length());
    }
        return strArray;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String[] strings = new String[num];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.next();
        }
        for (String str:
             T.solution(num, strings)) {
            System.out.println(str);
        }
    }
}
