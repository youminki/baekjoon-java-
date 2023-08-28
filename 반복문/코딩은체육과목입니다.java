// 코딩은체육과목입니다.java 25314
// https://www.acmicpc.net/problem/25314
package 반복문;

import java.util.Scanner;

public class 코딩은체육과목입니다 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = N / 4;
        for(int i = 1; i <= result; i++){
            System.out.print("long ");
        }
        System.out.println("int");
    }
}
