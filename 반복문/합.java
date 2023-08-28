// 합.java 8393
// https://www.acmicpc.net/problem/8393
package 반복문;

import java.util.Scanner;

public class 합 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
