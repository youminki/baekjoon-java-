// 양의 정수 n이 주어 졌을 때 n^2하기
package 이충기;

import java.util.Scanner;

public class 이장25번 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int square = 0;
        // square = n * n;

        //for(int i=0; i < n; i++){
        //    square += square;
        //}
        for(int i=0; i < n; i++){
            for(int j=0; j < n; j++){
                square += 1;
            }
        }
        System.out.print(square);
    }
}
