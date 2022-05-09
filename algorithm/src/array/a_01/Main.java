package array.a_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public List<Integer> solution(Integer[] array) {
        List<Integer> answer = new ArrayList<>();
        answer.add(array[0]);
        for (int i=1; i < array.length; i++) {
            if (array[i-1] < array[i]) {
                answer.add(array[i]);
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
        for (int x : T.solution(array)) {
            System.out.print(x+" ");
        }
    }
}
