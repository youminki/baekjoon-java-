// https://www.acmicpc.net/problem/1003
// 파보나치 함수(1003)

package 동적프로그래밍;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 파보나치함수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        int[] dp = new int[41];
        dp[1] = 1;
=
        for (int i = 2; i < 41; i++) {
            dp[i] = dp[i - 2] + dp[i - 1];
        }

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                bw.write("1 0\n");
            } else {
                bw.write(dp[n - 1] + " " + dp[n] + "\n");
            }
        }
        bw.flush();
    }
}

