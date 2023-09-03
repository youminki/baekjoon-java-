//https://www.acmicpc.net/problem/2908
// 상수.java 2908
package 문자열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 상수 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String arr[] = br.readLine().split(" ");
        String A = new StringBuilder(arr[0]).reverse().toString();
        String B = new StringBuilder(arr[1]).reverse().toString();
        int RA = Integer.parseInt(A);
        int RB = Integer.parseInt(B);
        bw.write(Integer.toString(Math.max(RA, RB)));
        bw.flush();
    }
}
// import java.util.Scanner;

// public class 상수 {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int A = sc.nextInt();
//         int B = sc.nextInt();
//         A = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
//         B = Integer.parseInt(new StringBuilder().append(B).reverse().toString());
//         System.out.print(A > B ? A : B);
//     }
// }
