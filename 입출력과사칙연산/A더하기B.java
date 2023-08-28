// A더하기B.java 1000번
// https://www.acmicpc.net/problem/1000
package 입출력과사칙연산;

import java.util.Scanner;

public class A더하기B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int result = A + B;
        System.out.println(result);
    }
}