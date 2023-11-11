// 배낭문제

package 이충기;

public class 육장39번 {
    static int knapSack(int W, int weight[], int value[], int n){
        int i, j;
        int K[][] = new int[n + 1][W + 1];
        //배낭의 용량이 0일 때 어떤 물건도 넣을 수 없다.
        for(i=0; i <= n; i++){
            K[i][0] = 0;
        }
        //배낭에 어떤 물건도 넣지 않을 때
        for(j=0; j<= W; j++){
            K[0][j] = 0;
        }
        // K[i][j]를 행 순서대로 같은 행에서는 열순서대로 계산한다.
        for(i=1; i <= n; i++){
            for(j = 1; j <= W; j++){
                if(weight[i - 1] > j){
                    //물건 i의 무게가 임시 배낭 용량을 초과하는 경우
                    K[i][j] = K[i - 1][j];
                }
                //물건 i를 배낭에 넣을 경우와 넣지 않을 경우 고려
                else{
                    K[i][j] = Math.max(value[i - 1] + K[i - 1][j -  weight[i - 1]], K[i - 1][j]);
                }
            }
        }
        return K[n][W];
    }
    public static void main(String[] args){
        int value[] = {25, 15, 20, 30}; // 물건의 가치 배열
        int weight[] = {3, 1, 2, 4}; // 물건의 무게 배열
        int C = 7;
        int n = value.length;
        System.out.println("최대가치 = " + knapSack(C, weight, value, n));
    }
}


