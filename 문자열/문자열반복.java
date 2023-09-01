// https://www.acmicpc.net/problem/2675
// 문자열반복.java 2675
package 문자열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 문자열반복 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i < T; i++){
            String[] arr = br.readLine().split(" ");
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
