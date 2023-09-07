package 이충기;

import java.util.Scanner;

public class 최댓값찾기 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자의 개수를 입력해주세요!");
        int num = sc.nextInt();
        int arr[] = new int[num];
        int max = arr[0];
        System.out.println("숫자를 입력해주세요!");
        for(int i=0; i < num; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i < arr.length; i++){
            max = arr[i];
        }
        System.out.println("최댓값" + max);
    }
}
// public class 최댓값찾기 {
//     public static void main(String[] args){
//         int [] arr = {28, 40, 56, 63, 74, 87, 95};
//         int max = arr[0];
//         for(int i=0; i < arr.length; i++){
//             max = arr[i];
//         }
//         System.out.println("최댓값" + max);
//     }
// }
