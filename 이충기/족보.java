package 이충기;

public class 족보 {
    int[][] C; // 공사 여부 배열
    int m, n;

    public ShortestPath(int m, int n) {
        this.m = m;
        this.n = n;
        C = new int[m + 1][n + 1];
    }

    // find 함수는 집에서 학교로 가는 최단 경로의 수를 계산하는 함수입니다.
    public int find(int i, int j) {
        // 만약 C[i][j]가 0이면, 공사 중이므로 0을 반환합니다.
        if (C[i][j] == 0) {
            return 0;
        }

        // 특별한 경우: 시작점에 도달한 경우, 1을 반환합니다.
        if (i == 1 && j == 1) {
            return 1;
        }

        // 특별한 경우: 첫 번째 행(i == 1)에 도달한 경우, 직전 열로 이동합니다.
        if (i == 1) {
            return find(i, j - 1);
        }

        // 특별한 경우: 첫 번째 열(j == 1)에 도달한 경우, 직전 행으로 이동합니다.
        if (j == 1) {
            return find(i - 1, j);
        }

        // 일반적인 경우: 이전 열(j-1)로부터 이전 행(i-1)으로 이동하거나
        // 이전 행(i-1)로부터 이전 열(j-1)로 이동한 경로의 합을 반환합니다.
        return find(i, j - 1) + find(i - 1, j);
    }

    public static void main(String[] args) {
        int m = 6;
        int n = 5;
        ShortestPath solver = new ShortestPath(m, n);
        int shortestPaths = solver.find(m, n);
        System.out.println("1,1에서 6,5까지 가는 최단 경로의 수: " + shortestPaths);
    }
}