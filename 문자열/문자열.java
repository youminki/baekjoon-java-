// https://www.acmicpc.net/problem/9086
// 문자열.java 9086
package 문자열;

import java.util.Scanner;

public class 문자열 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0; i < T; i++){
            String S = sc.next();
            System.out.printf("%s%s\n",S.charAt(0), S.charAt(S.length() - 1));
        }
    }
}
