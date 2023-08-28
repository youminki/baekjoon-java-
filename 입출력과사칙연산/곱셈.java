// 곱셈 2588번
// https://www.acmicpc.net/problem/2588
package 입출력과사칙연산;

import java.util.Scanner;

public class 곱셈 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int result3 = input1 * ((input2 % 10) - (input2 % 1) / 10);
        int result4 = input1 * (((input2 % 100) - (input2 % 10)) / 10);
        int result5 = input1 * (((input2) - (input2 % 100)) / 100);
        int result6 = input1 * input2;
        System.out.printf("%d\n%d\n%d\n%d",result3, result4, result5, result6);
    }
}
