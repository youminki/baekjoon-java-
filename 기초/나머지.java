// 나머지.java 10430번
// https://www.acmicpc.net/problem/10430
package 기초;

import java.util.Scanner;

public class 나머지 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int result1 = (A + B) % C;
        int result2 = ((A % C) + (B % C)) % C;
        int result3 = (A * B) % C;
        int result4 = ((A % C) * (B % C)) % C;
        System.out.printf("%d\n%d\n%d\n%d", result1, result2, result3, result4);
    }
}
