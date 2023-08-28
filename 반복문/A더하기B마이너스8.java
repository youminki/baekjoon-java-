// A더하기B마이너스8.java 11022
// https://www.acmicpc.net/problem/11022
package 반복문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A더하기B마이너스8 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for(int i=1; i <= T; i++){
            String s = br.readLine();
            int A = Integer.parseInt(s.split(" ")[0]);
            int B = Integer.parseInt(s.split(" ")[1]);
            bw.write("Case #" + i + ": ");
            bw.write(A + " + " + B + " = ");
            bw.write(A + B + "\n");
        }
        bw.flush();
    }
}
