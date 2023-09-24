package 동적프로그래밍;

import java.util.Scanner;

public class practice{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 입력 받을 수열의 길이 N
        int[] dp = new int[N + 1]; // 각 위치에서의 수열의 원소를 저장할 배열
        int[] LRdp = new int[N + 1]; // 왼쪽에서 오른쪽으로 증가하는 부분 수열의 길이를 저장할 배열
        int[] RLdp = new int[N + 1]; // 오른쪽에서 왼쪽으로 증가하는 부분 수열의 길이를 저장할 배열
        int res = 0; // 가장 긴 바이토닉 부분 수열의 길이를 저장할 변수

        for(int i=1; i <= N; i++){
            dp[i] = sc.nextInt(); // 수열의 원소를 입력받음
        }
        // 좌 -> 우: 왼쪽에서 오른쪽으로 증가하는 부분 수열의 길이 계산
        for(int i=1; i <= N; i++){
            LRdp[i] = 1; // 초기 길이는 1로 설정
            for(int j=1; j < i; j++){
                if(dp[i] > dp[j]){ // 현재 위치의 원소가 이전 원소보다 큰 경우
                    // 이전 위치의 부분 수열 길이 + 1과 현재 위치의 길이 중 큰 값을 선택하여 저장
                    LRdp[i] = Math.max(LRdp[j] + 1, LRdp[i]);
                }
            }
        }
        // 우 -> 좌: 오른쪽에서 왼쪽으로 증가하는 부분 수열의 길이 계산
        for(int i=N; i >= 1; i--){
            RLdp[i] = 1; // 초기 길이는 1로 설정
            for(int j=N; j > i; j--){
                if(dp[i] > dp[j]){ // 현재 위치의 원소가 이전 원소보다 큰 경우
                    // 이전 위치의 부분 수열 길이 + 1과 현재 위치의 길이 중 큰 값을 선택하여 저장
                    RLdp[i] = Math.max(RLdp[j] + 1, RLdp[i]);
                }
            }
        }

        for(int i=1; i <= N; i++){
            // 각 위치에서의 왼쪽에서 오른쪽으로 증가하는 길이와
            // 오른쪽에서 왼쪽으로 증가하는 길이를 합쳐서 중복된 원소 1을 빼고 가장 큰 길이를 선택
            res = Math.max(res, LRdp[i] + RLdp[i] - 1);
        }

        System.out.println(res); // 결과 출력
    }
}
