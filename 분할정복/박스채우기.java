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
        long count = 0;
        for( int i=N - 1; i >= 0; i--){
            use <<= 3; //2^3
            long partition = (long) (length >> i) * (width >> i) * (height >> i) - use; // 박스를 2^i x 2^i x 2^i만큼 분할해 주고, 전에 박스를 채웠던 큐브의 개수(use)만큼 빼 준다.
            long box = Math.min((long) arr[i], partition);
            use += box;
            count += box;
        }
        if(use == (long) length * width * height){ //계산 결과와 박스의 부피가 같은지 확인
            System.out.println(count);
        }
        else{
            System.out.println(-1);
        }
    }
}
