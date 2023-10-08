package 이충기;

public class 과제4일번 {
    public static int partition(int[] C, int n) {
        if (n == 0){
            return 0;
        }
        else if (n == 1){
            return C[0];
        }
        else{
            return Math.max(partition(C, n - 1), partition(C, n - 2) + C[n - 1]);
        }
    }
    
    // 동적 계획 알고리즘
    public static int DPS(int[] C, int n){
        int[] F = new int[n];
        F[0] = C[0];
        F[1] = Math.max(C[0], C[1]);
        
        for (int i = 2; i < n; i++){
            F[i] = Math.max(F[i-1], F[i-2] + C[i]);
        }
        
        return F[n-1];
    }

    public static void main(String[] args){
        int[] C = {5, 1, 2, 10}; // 동전의 가치를 나타내는 배열입니다.
        int n = C.length;
        System.out.println("분할 정복 알고리즘 결과: " + partition(C, n));
        System.out.println("동적 계획 알고리즘 결과: " + DPS(C, n));
    }
}


