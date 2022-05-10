package array.a_04;

import java.util.Scanner;

public class Main {
    public int[] solution(int num) {
        int[] array = new int[num];
        array[0] = 1;
        array[1] = 1;

        for (int i = 2; i < num; i++) {
            array[i] = array[i-2] + array[i-1];
        }

        return array;
    };

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int x: T.solution(num)) {
            System.out.printf(x + " ");
        }
    }
}
