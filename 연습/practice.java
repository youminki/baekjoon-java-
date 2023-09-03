// 문자와문자열.java 27866
// https://www.acmicpc.net/problem/27866
package 연습;

import java.util.Scanner;

public class practice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0; i < T; i++){
            int count = sc.nextInt();
            String S = sc.next();
            for(int j=0; j < S.length(); j++){
                for(int k=0; k < count; k++){
                    System.out.print(S.charAt(j));
                }
            }
            System.out.print("\n");
        }

    }
}