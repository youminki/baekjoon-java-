package 이충기;

import java.util.Scanner;

public class 이장이십육 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] FREQ = {1, 0, 7, 5, 4};
        int[] CUME;
        CUME = ComputerSum(FREQ);
        System.out.println(CUME);

        for(int i=0; i < CUME.length; i++){
            System.out.print(CUME[i] + " ");
        }
    }
    public static int[] ComputerSum(int[] FREQ){
        int n = FREQ.length;
        int [] CUME = new int[n];

        CUME[0] = FREQ[0];
        for(int i=1; i < n; i++){
            CUME[i] = CUME[i - 1] + FREQ[i];
        }
        return CUME;

    }
}


// -----------------------------------------
// 주석버전
// "이충기" 패키지에 속하는 클래스 "이장이십육" 정의
// package 이충기;

// // Java 표준 라이브러리의 Scanner 클래스를 임포트
// import java.util.Scanner;

// // "이장이십육" 클래스 정의
// public class 이장이십육 {
//     // main 메서드 시작
//     public static void main(String[] args) {
//         // Scanner 객체 생성
//         Scanner sc = new Scanner(System.in);

//         // 정수 배열 "FREQ"를 초기화
//         int[] FREQ = {1, 0, 7, 5, 4};

//         // 누적 합 배열 "CUME"를 선언
//         int[] CUME;

//         // "ComputerSum" 메서드를 호출하여 누적 합 배열 "CUME" 초기화
//         CUME = ComputerSum(FREQ);

//         // "CUME" 배열의 값을 출력
//         System.out.println(CUME);

//         // "CUME" 배열의 요소를 공백으로 구분하여 출력
//         for (int i = 0; i < CUME.length; i++) {
//             System.out.print(CUME[i] + " ");
//         }
//     }

//     // "ComputerSum" 메서드 정의
//     public static int[] ComputerSum(int[] FREQ) {
//         // 배열의 길이를 저장하는 변수 "n" 선언 및 초기화
//         int n = FREQ.length;

//         // 누적 합 배열 "CUME" 선언 및 초기화
//         int[] CUME = new int[n];

//         // "CUME" 배열의 첫 번째 요소 초기화
//         CUME[0] = FREQ[0];

//         // 누적 합 배열 "CUME" 계산
//         for (int i = 1; i < n; i++) {
//             CUME[i] = CUME[i - 1] + FREQ[i];
//         }

//         // 계산된 "CUME" 배열 반환
//         return CUME;
//     }
// }
