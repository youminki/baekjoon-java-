// 숫자의합.java 11720
//  https://www.acmicpc.net/problem/11720
package 문자열;

import java.util.Scanner;

public class 숫자의합 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        int result = 0;
        for(int i=0; i < N; i++){
            result += S.charAt(i) - '0';
        }
        System.out.print(result);

    }
}
