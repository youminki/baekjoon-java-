// 별찍기이.java
// https://www.acmicpc.net/problem/2439
package 반복문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 별찍기이 {
    public static void main(String[] agrs) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i=1; i <= N; i++){
            for(int j=1; j <= N - i; j++){
                bw.write(" ");
            }
            for(int k=1; k <= i; k++)
                bw.write("*");
                bw.write("\n");
        }
        bw.flush();
    }
}
