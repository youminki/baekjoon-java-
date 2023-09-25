// 같은 등급의 학생

package 이충기;

import java.util.Scanner;

public class 이장26번 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] FREQ = {1, 0, 7, 5, 4};  // 정수 배열 "FREQ"를 초기화
        int[] CUME; // 누적 합 배열 "CUME"를 선언
        CUME = ComputerSum(FREQ); // "ComputerSum" 메서드를 호출하여 누적 합 배열 "CUME" 초기화
        System.out.println(CUME);

        for(int i=0; i < CUME.length; i++){ // "CUME" 배열의 요소를 공백으로 구분하여 출력
            System.out.print(CUME[i] + " ");
        }
    }
    public static int[] ComputerSum(int[] FREQ){
        int n = FREQ.length; // 배열의 길이를 저장하는 변수 "n" 선언 및 초기화
        int [] CUME = new int[n]; // 누적 합 배열 "CUME" 선언 및 초기화

        CUME[0] = FREQ[0]; // "CUME" 배열의 첫 번째 요소 초기화
        for(int i=1; i < n; i++){ // 누적 합 배열 "CUME" 계산
            CUME[i] = CUME[i - 1] + FREQ[i];
        }
        return CUME;

    }
}
