// 최댓값.java 2562
//https://www.acmicpc.net/problem/2562
package 일차원배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 최댓값 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int max = 0;
        int location = 0;
        for(int i=0; i < 9; i++){
            int N = Integer.parseInt(br.readLine());
            if(max < N){
                max = N;
                location = i + 1;
            }
        }
        bw.write(max + "\n" + location);
        bw.flush();
    }
}
