// https://www.acmicpc.net/problem/11054
// 가장긴바이토닉부분수열.java
package 동적프로그래밍;

import java.util.Scanner;

public class 가장긴바이토닉부분수열 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] dp = new int[N + 1];
        int[] LRdp = new int[N + 1];
        int[] RLdp = new int[N + 1];
        int res = 0;

        for(int i=1; i <= N; i++){
            dp[i] = sc.nextInt();
        }
        // 좌 -> 우
        for(int i=1; i <=N; i++){
            LRdp[i] = 1;
            for(int j=1; j < i; j++){
                if(dp[i] > dp[j]){
                    LRdp[i] = Math.max(LRdp[j] + 1, LRdp[i]);
                }
            }
        }
        // 우 -> 좌
        for(int i=N; i >= 1; i--){
            RLdp[i] = 1;
            for(int j=N; j > i; j--){
                if(dp[i] > dp[j]){
                    RLdp[i] = Math.max(RLdp[j] + 1, RLdp[i]);
                }
            }
        }

        for(int i=1; i <= N; i++){
            res = Math.max(res, LRdp[i] + RLdp[i] - 1); // 중복요소 1 제거
        }

        System.out.println(res);
    }
}
