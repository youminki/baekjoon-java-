package 이충기;

import java.util.Arrays;
import java.util.Scanner;

public class 값찾기순차탐색 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = {28, 40, 56, 63, 74, 87, 95};
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == n){
                System.out.print("있다");
                return;
            }
        }
        System.out.print("없다");
    }
}
