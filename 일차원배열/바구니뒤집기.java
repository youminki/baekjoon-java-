// https://www.acmicpc.net/problem/10811
// 바구니뒤집기.java 10811
package 일차원배열;

import java.util.Scanner;

public class 바구니뒤집기 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int arr[] = new int[N];
        int temp;
        for(int i=0; i < arr.length; i++){
            arr[i] = i + 1;
            //System.out.println(i);
        }
        for(int i=0; i < M; i++){
            int I = sc.nextInt() - 1;
            int J = sc.nextInt() - 1;
            while(I < J){
                temp = arr[I];
                arr[I++] = arr[J];
                arr[J--] = temp;
            }
        }
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
