package 이충기;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;


public class 문제3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        
        HashSet<Integer> uniqueSet = new HashSet<>();
        
        for (int i = 0; i < N; i++) {
            uniqueSet.add(arr[i]);
        }
        ArrayList<Integer> resultList = new ArrayList<>(uniqueSet);
        
        for (int num : resultList) {
            System.out.print(num + " ");
        }
    }
}

// public class 문제3 {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt();
//         int arr[] = new int[N];
//         for(int i=0; i < N; i++){
//             if(arr[N] == arr[i]){
//                 i--;
//                 break;
//             }
//         }
//         for(int i=0; i< arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
// }



// 1. 배열 arr[N]을 입력받는다.
// 2. 빈 HashSet uniqueSet을 생성한다.
// 3. 반복문을 사용하여 배열 arr의 각 요소를 순회한다:
//    1. 만약 uniqueSet에 현재 요소가 없다면, uniqueSet에 현재 요소를 추가한다.
// 4. uniqueSet의 요소들을 배열 result에 복사한다.
// 5. result 배열을 출력한다.

