// A더하기B.java 10950
// https://www.acmicpc.net/problem/10950
package 반복문;

import java.util.Scanner;

public class A더하기B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++){
            int a = sc.nextInt();;
            int b = sc.nextInt();;
            System.out.printf("%d\n", a + b);
        }
    }
}
