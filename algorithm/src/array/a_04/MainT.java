package array.a_04;

import java.util.Scanner;

public class MainT {
    public void solution(int num) {
        int a = 1;
        int b = 1;
        int c = 0;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < num; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        MainT T = new MainT();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        T.solution(num);
    }
}
