// 문자와문자열.java 27866
// https://www.acmicpc.net/problem/27866
package 연습;

import java.util.Scanner;

public class practice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String arr[] = sc.next().split("");
        int I = sc.nextInt();
        System.out.print(arr[I - 1]);
        
    }
}