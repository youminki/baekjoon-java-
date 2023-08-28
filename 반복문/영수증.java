// 영수증.java 25304
// https://www.acmicpc.net/problem/25304
package 반복문;

import java.util.Scanner;

public class 영수증 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        int a;
        int b;
        int price = 0;
        for(int i = 1; i <= N; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            price += a * b;
        }
        if(price == X)
            System.out.println("Yes");
        else{
            System.out.println("No");
        }
    }
}
