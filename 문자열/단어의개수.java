// https://www.acmicpc.net/problem/1152
// 단어의개수.java 1152
package 문자열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 단어의개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String S = br.readLine();
        StringTokenizer st = new StringTokenizer(S, " ");
        bw.write(Integer.toString(st.countTokens()));
        bw.flush();
    }
}

// import java.util.Scanner;

// public class 단어의개수 {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         String S = sc.nextLine().trim();
//         System.out.println(S.split(" ").length);
//     }
// }
