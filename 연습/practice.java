// 문자와문자열.java 27866
// https://www.acmicpc.net/problem/27866
package 연습;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class practice {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for(int i=0; i < T; i++){
            String arr[] = br.readLine().split(" ");
            int count = Integer.parseInt(arr[0]);
            String S = arr[1];
            for(int j=0; j < S.length(); j++){
                for(int k=0; k < count; k++){
                    bw.write(S.charAt(j));
                }
            }
            bw.write("\n");
        }
        bw.flush();
    }
}