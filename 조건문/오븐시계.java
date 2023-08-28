// 오븐시계.java 2525
// https://www.acmicpc.net/problem/2525
package 조건문;

import java.util.Scanner;

public class 오븐시계 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int Cook = sc.nextInt();
        A = A + Cook / 60;
        B = B + Cook % 60;
        if(B >= 60){
            A = A + 1;
            B = B - 60;
        }
        if(A >= 24){
            A = A - 24;
        }
        System.out.printf("%d %d", A, B);
    }
}
