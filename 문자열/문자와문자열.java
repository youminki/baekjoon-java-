// 문자와문자열.java 27866
// https://www.acmicpc.net/problem/27866
package 문자열;

import java.util.Scanner;

public class 문자와문자열 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int N = sc.nextInt();
        System.out.println(S.charAt(N - 1));
    }
}
// import java.util.Scanner;

// public class 문자와문자열 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String arr[] = sc.next().split("");
//         int find = sc.nextInt();
//         System.out.println(arr[find - 1]);
//     }
// }