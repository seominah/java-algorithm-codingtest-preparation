package array.a_05;

import java.util.Scanner;

public class Main {
    public int solution(int num) {
        int answer = 0;
        int[] array = new int[num+1];
        for (int i=2; i<num; i++) {
            if (array[i] == 0) {
                answer++;
                for (int j=i; j<num; j=j+i) {
                    array[j] = 1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(T.solution(num));
    }
}
