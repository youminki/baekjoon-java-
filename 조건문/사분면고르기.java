// 사분면고르기.java 14681번
// https://www.acmicpc.net/problem/14681
package 조건문;

import java.util.Scanner;

public class 사분면고르기 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(x > 0 && y > 0){
            System.out.println(1);
        }
        else if(x < 0 && y > 0){
            System.out.println(2);
        }
        else if(x < 0 && y < 0){
            System.out.println(3);
        }
        else{
            System.out.println(4);
        }
    }
}
