// A더하기B.java 1000번
// https://www.acmicpc.net/problem/1000
package 기초;

import java.util.Scanner;

public class A더하기B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int sum = 0;
        sum = A + B;
        System.out.println(sum);
    }
}