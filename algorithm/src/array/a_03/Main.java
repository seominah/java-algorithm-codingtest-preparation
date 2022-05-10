package array.a_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public String solution(Integer[] A, Integer[] B) {
        String answer = "";
        for (int i=0; i<A.length; i++) {
            if (A[i] == B[i]) {
                answer += "D";
            } else if (A[i] == 1 && B[i] == 3) {
                answer += "A";
            } else if (A[i] == 2 && B[i] == 1) {
                answer += "A";
            } else if (A[i] == 3 && B[i] == 2) {
                answer += "A";
            } else {
                answer += "B";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        Integer[] A = new Integer[count];
        Integer[] B = new Integer[count];
        for (int i = 0; i < count; i++) {
            A[i] = scanner.nextInt();
        }
        for (int i = 0; i < count; i++) {
            B[i] = scanner.nextInt();
        }
        for (char x : T.solution(A,B).toCharArray()) {
            System.out.println(x);
        }
    }
}
