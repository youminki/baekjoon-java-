// https://www.acmicpc.net/problem/16974
// 레벨햄버거(16974)
package 분할정복;

import java.util.Scanner;

public class 레벨햄버거 {
    private static int N;
    private static long X;
    private static long[] hamburger;
    private static long[] patty;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        X = sc.nextLong();
        hamburger = new long[N + 1];
        patty = new long[N + 1];
        hamburger[0] = patty[0] = 1;
        for(int i=1; i <= N; i++){
            hamburger[i] = 1 + hamburger[i - 1] + 1 + hamburger[i - 1] + 1;
            patty[i] = patty[i - 1] + 1 + patty[i - 1];
        }
        System.out.println(partition(N, X) + "\n");

    }
    private static long partition(int level, long count){
        if(level == 0){
            if(count == 0){
                return 0;
            }
            else if(count == 1){
                return 1;
            }
        }
        if(count == 1){
            return 0;
        }
        else if(count <= hamburger[level - 1] + 1){
            return partition(level - 1, count - 1);
        }
        else if(count == 1 + hamburger[level - 1] + 1){
            return patty[level - 1] + 1;
        }
        else if( count <= 1 + hamburger[level - 1] + 1 + hamburger[level - 1]){
            return patty[level - 1] + 1 + partition(level - 1, count - (1 + hamburger[level - 1] + 1));
        }
        else{
            return patty[level - 1] + 1 + patty[level - 1];
        }
    }
}


// ------------------------------------------------------
// // 주석버전

// // 주어진 문제: https://www.acmicpc.net/problem/16974
// // 레벨햄버거(16974)

// package 분할정복;

// import java.util.Scanner;

// public class 레벨햄버거 {
//     private static int N; // 레벨 햄버거의 층 수
//     private static long X; // 먹을 햄버거의 번호
//     private static long[] hamburger; // 각 레벨의 햄버거 길이를 저장하는 배열
//     private static long[] patty; // 각 레벨의 패티 수를 저장하는 배열

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         N = sc.nextInt(); // 레벨의 수를 입력받음
//         X = sc.nextLong(); // 먹을 햄버거의 번호를 입력받음
//         hamburger = new long[N + 1]; // 레벨 수 + 1 크기의 배열 초기화
//         patty = new long[N + 1]; // 레벨 수 + 1 크기의 배열 초기화
//         hamburger[0] = patty[0] = 1; // 초기 레벨 0의 햄버거 길이와 패티 수를 1로 설정

//         // 레벨과 햄버거 길이, 패티 수를 계산하여 배열에 저장
//         for(int i = 1; i <= N; i++){
//             hamburger[i] = 1 + hamburger[i - 1] + 1 + hamburger[i - 1] + 1;
//             patty[i] = patty[i - 1] + 1 + patty[i - 1];
//         }

//         // partition 함수 호출 결과를 출력
//         System.out.println(partition(N, X) + "\n");
//     }

//     // 레벨과 먹을 햄버거의 번호를 입력으로 받아서 패티 수를 계산하는 재귀 함수
//     private static long partition(int level, long count){
//         if(level == 0){
//             if(count == 0){
//                 return 0; // 레벨이 0이고 먹을 햄버거 번호가 0이면 0 반환
//             }
//             else if(count == 1){
//                 return 1; // 레벨이 0이고 먹을 햄버거 번호가 1이면 1 반환
//             }
//         }
//         if(count == 1){
//             return 0; // 먹을 햄버거 번호가 1이면 0 반환
//         }
//         else if(count <= hamburger[level - 1] + 1){
//             return partition(level - 1, count - 1); // 먹을 햄버거 번호가 왼쪽 햄버거 범위 내에 있을 때
//         }
//         else if(count == 1 + hamburger[level - 1] + 1){
//             return patty[level - 1] + 1; // 먹을 햄버거 번호가 패티 위치일 때
//         }
//         else if(count <= 1 + hamburger[level - 1] + 1 + hamburger[level - 1]){
//             return patty[level - 1] + 1 + partition(level - 1, count - (1 + hamburger[level - 1] + 1));
//             // 먹을 햄버거 번호가 오른쪽 햄버거 범위 내에 있을 때
//         }
//         else{
//             return patty[level - 1] + 1 + patty[level - 1]; // 먹을 햄버거 번호가 레벨 전체 범위에 있을 때
//         }
//     }
// }
