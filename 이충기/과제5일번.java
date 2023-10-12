package 이충기;

public class 과제5일번 {
    public static void main(String[] args) {
        int n = 4;  // 노드의 개수, 0부터 시작하므로 4개의 노드가 있습니다.

        // 가중치 행렬 W 및 최단 경로 행렬 D
        int[][] W = {
            {0, 0, 0, 0, 0},
            {0, 0, INF, 3, INF},
            {0, 2, 0, INF, INF},
            {0, INF, 7, 0, 1},
            {0, 6, INF, INF, 0}
        };

        int[][] D = new int[n + 1][n + 1];

        // 시작 노드와 도착 노드 지정
        int start = 1;  // 예를 들어, 서울을 시작 노드로 선택
        int end = 4;    // 예를 들어, 청주를 도착 노드로 선택

        // 경로를 저장할 배열
        String[][] pathList = new String[n + 1][n + 1];

        // 노드 이름 배열
        String[] name = { "0", "서울", "춘천", "대전", "청주" };

        // pathList 초기화: 각 (i, j) 쌍에 노드 이름을 할당
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                pathList[i][j] = name[i];
            }
        }

        // D 행렬을 W로 초기화
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                D[i][j] = W[i][j];
            }
        }

        // Floyd-Warshall 알고리즘을 사용하여 최단 경로 계산
        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (D[i][j] > D[i][k] + D[k][j]) {
                        // 최단 경로 업데이트
                        D[i][j] = D[i][k] + D[k][j];
                        // 해당 경로의 중간 노드를 pathList에 저장
                        pathList[i][j] = name[k];
                    }
                }
            }
        }

        // 각 (i, j) 쌍에 도착 노드 이름으로 설정
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                pathList[i][j] = name[j];
            }
        }

        // 최단 경로 및 중간 노드 출력
        System.out.println("Shortest path from " + name[start] + " to " + name[end] + ": " + D[start][end]);
        System.out.println("Intermediate nodes: " + pathList[start][end]);
    }
}
