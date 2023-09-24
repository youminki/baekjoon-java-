// https://www.acmicpc.net/problem/1699
// 제곱수들의합.java
package 동적프로그래밍;

import java.util.Scanner;

public class 제곱수들의합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] dp = new int[N + 1]; // dp 배열 크기를 N + 1로 설정
        dp[0] = 0;

        for (int i = 1; i <= N; i++) {
            dp[i] = 100001;
            for (int j = 1; j * j <= i; j++) { // j*j가 i 이하인 범위까지만 고려
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }

        System.out.println(dp[N]); // dp[N] 출력
    }
}
