// https://www.acmicpc.net/problem/10809
// 알파벳찾기.java 10809
package 문자열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 알파벳찾기 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int arr[] = new int[26];
        String S = br.readLine();

        for(int i=0; i < 26; i++){
            arr[i] = -1;
        }
        for(int i=0; i < S.length(); i++){
            int index = S.charAt(i) - 'a';
            if(arr[index] == -1){
                arr[index] = i;
            }
        }
        for(int i=0; i < 26; i++){
            sb.append(arr[i]).append(" ");
        }
        bw.write(sb.toString());
        bw.flush();
    }
}