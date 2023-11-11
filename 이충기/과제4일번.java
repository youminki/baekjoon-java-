package 이충기;

public class 과제4일번 {
    // 분할 정복 알고리즘
    public static int partition(int[] arr, int n) {
        if (n == 0){
            return 0;
        }
        else if (n == 1){
            return arr[0];
        }
        else{
            return Math.max(partition(arr, n - 1), partition(arr, n - 2) + arr[n - 1]);
        }
    }
    
    // 동적 계획 알고리즘
    public static int DPS(int[] arr, int n){
        int[] dp = new int[n];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);
        
        for (int i = 2; i < n; i++){
            dp[i] = Math.max(dp[i-1], dp[i-2] + arr[i]);
        }
        
        return dp[n-1];
    }

    public static void main(String[] args){
        int[] arr = {5, 1, 2, 10}; // 동전의 가치를 나타내는 배열입니다.
        int n = arr.length;
        System.out.println("분할 정복 알고리즘 결과: " + partition(arr, n));
        System.out.println("동적 계획 알고리즘 결과: " + DPS(arr, n));
    }
}


