package 연습;

import java.util.Scanner;

public class practice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();
        int[] dp = new int[41];
        dp[1] = 1;
        for(int i = 2; i < 41; i++){
            dp[i] = dp[i - 2] + dp[i - 1];
        }
        for(int i = 0; i < t; i++){
            int n = sc.nextInt();
            if(n == 0){
                sb.append("1 0\n");
                continue;
            }
            sb.append(dp[n - 1] + " " + dp[n] + "\n");
        }
        System.out.println(sb.toString());
    }
}
