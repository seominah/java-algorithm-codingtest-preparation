package array.a_06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public boolean isPrime(int num) {
        if (num == 1) return false;
        for (int i=2; i<num; i++) {
            if (num%i == 0) {
                return false;
            }
        }
        return true;
    }

    public List<Integer> solution(int num, int[] array){
        List<Integer> answer = new ArrayList<>();
        // 자연수 뒤집기
        int[] reversArray = new int[num];
        for (int i=0; i<num; i++) {
            int reverseNum = 0;
            while (array[i] != 0) {
                reverseNum = array[i] % 10 + reverseNum * 10;
                array[i] /= 10;
            }
            reversArray[i] = reverseNum;
            if (isPrime(reverseNum)) answer.add(reverseNum);
        }

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] array = new int[num];
        for (int i=0; i<num; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i : T.solution(num, array)) {
            System.out.print(i + " ");
        }
    }
}
