// 박스채우기.java(1493)
// https://www.acmicpc.net/problem/1493
package 분할정복;

import java.util.Scanner;

public class 박스채우기 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int width = sc.nextInt();
        int height = sc.nextInt();
        int N = sc.nextInt();
        int arr[] = new int[N];

        for(int i=0; i < N; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a] = b;
        }

        long use = 0;
        long result = 0;
        for( int i=N - 1; i >= 0; i--){
            
        }
    }
}
