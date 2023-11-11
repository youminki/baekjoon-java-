package 이충기;

public class 과제6이번 {

    public static int[][] knapsack(int c, int[] w, int[] v, int n) {
        int[][] dp = new int[n + 1][c + 1];
        
        for (int i = 0; i <= n; i++) { // 배낭의 용량이 0일 때 어떤 물건도 넣을 수 없다.
            dp[i][0] = 0;
        }
        for (int j = 0; j <= c; j++) { // 배낭에 어떤 물건도 넣지 않을 때
            dp[0][j] = 0;
        }

        for (int i = 1; i <= n; i++) {  // K[i][j]를 행 순서대로 같은 행에서는 열 순서대로 계산한다.
            for (int j = 1; j <= c; j++) {
                if (w[i] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - w[i]] + v[i]);
                    
                }
            }
        }

        return dp;
    }

    public static void main(String[] args) {
        int c = 5; //배낭의 용량
        int n = 4; // 물건의 가치배열의 길이
        int[] w = {0, 2, 1, 3, 2}; //물건의무게
        int[] v = {0, 12, 10, 20, 15}; //물건의 가치
        int[][] result = knapsack(c, w, v, n);
        
        // 결과를 출력
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= c; j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }

        // 최대 가격을 구성하는 물건들을 추적
        int[] L = new int[n+1];
        int idx = 0;
        
        for(int i = n; i > 0; i--){
            if(result[i][c] != result[i-1][c]) {
                L[idx++] = i;
                c = c - w[i];
            }
        }

        // 추적한 물건들을 출력
        System.out.println("최대 가격을 구성하는 물건들:");
        for(int i=0; i<idx; i++){
            System.out.println("물건 " + L[i] + ": 가치 " + v[L[i]] + ", 무게 " + w[L[i]]);
        }
    }
}


// package 이충기;

// public class 과제6이번 {
//     static int Knapsack(int W, int weight[], int value[], int n){
//         int i, j;
//         int K[][] = new int[n + 1][W+ 1];
//         // 배낭의 용량이 0일 때 어떤 물건도 넣을 수 없다.
//         for(i=0; i <= n; i++){
//             K[i][0] = 0;
//         }
//         // 배낭에 어떤 물건도 넣지 않을 때
//         for(j=0; j <= W; j++){
//             K[0][j] = 0;
//         }
//         // K[i][j]를 행 순서대로 같은 행에서는 열 순서대로 계산한다.
//         for(i=1; i <= n; i++){
//             for(j=1; j <= W; j++){
//                 if(weight[i - 1] > j){
//                     // 물건 i의 무게가 임시 배낭 용량을 초기화한경우
//                     K[i][j] = K[i - 1][j];
//                 }
//                 else{
//                     //물건 i를 배낭에 넣을 경우와 넣지 않을 경우 고려
//                     K[i][j] = Math.max(value[i - 1] + K[i - 1][j - weight[i - 1]], K[i - 1][j]);
//                 }
//             }
//         }
//         return K[n][W];
//     }
//     public static void main(String[] args){
//         int value[] = {12, 10, 20, 15}; // 물건의 가치 배열
//         int weight[] = {2, 1, 3, 2}; // 물건의 무게 배열
//         int C = 5; // 배낭의 용량
//         int n = value.length;
//         System.out.println("최대가치 = " + Knapsack(C, weight, value, n));
//     }
// }
