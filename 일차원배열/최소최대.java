// https://www.acmicpc.net/problem/10818
//최소최대.java 10818
package 일차원배열;

import java.util.Scanner;

public class 최소최대 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        int max = -1000001;
        int min = 1000001;
        for(int i=0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            else if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.printf("%d %d", min, max);
    }
}
