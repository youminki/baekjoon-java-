package 연습;

public class practice {

    public static String findItems(int[] v, int[] w, int[][] K, int C, int n) {
        String itemList = ""; // 물건들의 목록을 저장할 문자열

        int i = n; // n부터 시작
        int j = C;

        while (i > 0 && j > 0) {
            if (K[i][j] != K[i - 1][j]) {
                // 현재 물건을 선택한 경우
                itemList = i + " " + itemList;
                j -= w[i];
            }
            i--;
        }

        return itemList;
    }

    public static void main(String[] args) {
        int C = 5; // 배낭의 용량
        int n = 4; // 물건의 개수
        int[] v = {0, 12, 10, 20, 15}; // 물건의 가치 배열
        int[] w = {0, 2, 1, 3, 2}; // 물건의 무게 배열
        int[][] K = new int[n + 1][C + 1];

        // K 배열 생성과 초기화 (이미 생성된 배열을 사용하는 것으로 가정)
        // ... 0-1 배낭 알고리즘을 사용하여 K 배열을 계산하는 코드

        // 배낭에 넣을 수 있는 물건들의 최대 가치를 구성하는 물건들의 목록 찾기
        String itemList = findItems(v, w, K, C, n);
        System.out.println("물건 목록: " + itemList);
    }
}

