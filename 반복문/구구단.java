// 구구단.java 2739
// https://www.acmicpc.net/problem/2739
package 반복문;

import java.util.Scanner;

public class 구구단 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 1; i <= 9; i++){
            System.out.printf("%d * %d = %d\n", N, i, N * i);
        }
    }
}
