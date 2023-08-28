// 사칙연산.java 10869번
// https://www.acmicpc.net/problem/10869
package 기초;

import java.util.Scanner;

public class 사칙연산 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int Plus = A + B;
        int Minus = A - B;
        int Multiply = A * B;
        int Division = A / B;
        int Rest = A % B;
        System.out.printf("%d\n%d\n%d\n%d\n%d",Plus, Minus, Multiply, Division, Rest);
    }
}
