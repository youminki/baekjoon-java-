// 별찍기일.java 2438
// https://www.acmicpc.net/problem/2438
package 반복문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 별찍기일 {
    public static void main(String[] agrs) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i=1; i <= N; i++){
            for(int j = 1; j <= i; j++)
                bw.write("*");
                bw.write("\n");
        }
        bw.flush();
    }
}
