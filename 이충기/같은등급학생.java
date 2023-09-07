package 이충기;

import java.util.Scanner;

public class 같은등급학생 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[0];
        int sum =0;
        for(int i=0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i < n; i++){
            for(int j=0; j < i; j++){
                sum += arr[j];
            }
            arr[i] = sum;
        }
        System.out.println(sum);
    }
}
