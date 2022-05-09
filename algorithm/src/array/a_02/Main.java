package array.a_02;

import java.util.Scanner;

public class Main {
    public int solution(Integer[] array) {
        int answer = 1;
        int taller = array[0];
        for (int i = 0; i < array.length; i++) {
            if (taller < array[i]) {
                taller = array[i];
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Integer[] array = new Integer[num];
        for (int i = 0; i < num; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(T.solution(array));
    }
}
