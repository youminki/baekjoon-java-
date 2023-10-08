package 이충기;

public class 과제4이번 {
    // 거스름돈 n을 최소 동전 개수로 만들기 위한 함수
    public static int minCoins(int n, int[] coins) {
        int[] F = new int[n + 1];
        F[0] = 0;

        for (int i = 1; i <= n; i++) {
            F[i] = Integer.MAX_VALUE; // 초기값 설정
            for (int d : coins) { // 가능한 모든 동전들에 대해 최소값 계산
                if (i >= d) {
                    F[i] = Math.min(F[i], F[i - d] + 1); // 현재 동전을 사용하여 거스름돈을 만들 때와 사용하지 않을 때 중 작은 값 선택
                }
            }
        }
        return F[n-1]; // 거스름돈 n에 필요한 최소 동전 개수 반환
    }

    public static void main(String[] args) {
        int m = 3; // 동전 종류 수
        int n = 4; // 거스름돈 금액
        int[] coins = {1, 3, 4}; // 각 동전의 액면 금액 배열
        int result = minCoins(n, coins); // 최소 동전 개수 계산 함수 호출
        System.out.println("거스름돈 " + n + "원에 포함되는 최소 개수의 동전: " + result + "개");
    }
}
