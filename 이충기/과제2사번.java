package 이충기;

public class 과제2사번 {
    // 억지 기법을 사용하여 도치 수 계산
    public int countInversionsBruteForce(int[] A) {
        int count = 0; // 도치 수를 저장할 변수 초기화
        int N = A.length; // 배열의 길이

        // 모든 가능한 쌍을 비교하여 도치 수 계산
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (A[i] > A[j]) {
                    count++; // A[i]가 A[j]보다 크면 도치이므로 도치 수 증가
                }
            }
        }

        return count; // 최종 도치 수 반환
    }

    // 합병 정렬을 사용하여 도치 수 계산
    public int countInversions(int[] A) {
        int[] aux = new int[A.length]; // 임시 배열 생성
        return countInversionsRecursive(A, aux, 0, A.length - 1);
    }

    // 배열 A의 부분 배열에서 도치 수 계산 (재귀적으로 호출됨)
    private int countInversionsRecursive(int[] A, int[] aux, int low, int high) {
        if (low >= high) return 0; // 배열 크기가 1 이하면 도치 수 0 반환

        int mid = low + (high - low) / 2; // 중간 지점 계산
        int count = 0; // 도치 수를 저장할 변수 초기화

        // 왼쪽 부분 배열과 오른쪽 부분 배열에 대해 재귀적으로 도치 수 계산
        count += countInversionsRecursive(A, aux, low, mid);
        count += countInversionsRecursive(A, aux, mid + 1, high);

        // 왼쪽과 오른쪽 부분 배열을 합병하면서 도치 수 계산
        count += mergeAndCount(A, aux, low, mid, high);

        return count; // 최종 도치 수 반환
    }

    // 부분 배열을 합병하면서 도치 수 계산
    private int mergeAndCount(int[] A, int[] aux, int low, int mid, int high) {
        for (int k = low; k <= high; k++) {
            aux[k] = A[k]; // 원본 배열을 임시 배열에 복사
        }

        int count = 0; // 도치 수를 저장할 변수 초기화
        int i = low, j = mid + 1;

        // 합병 과정에서 도치 수 계산
        for (int k = low; k <= high; k++) {
            if (i > mid) {
                A[k] = aux[j++];
            } else if (j > high) {
                A[k] = aux[i++];
            } else if (aux[i] <= aux[j]) {
                A[k] = aux[i++];
            } else {
                A[k] = aux[j++];
                count += (mid - i + 1); // i와 mid 사이에 있는 모든 원소들은 j보다 크다.
            }
        }

        return count; // 합병 과정에서 계산된 도치 수 반환
    }

    public static void main(String[] args) {
        과제2사번 counter = new 과제2사번();
        int[] A = {82, 35, 27, 96, 73, 14, 58, 49};
        int inversions = counter.countInversions(A);
        System.out.println("\n도치 수: " + (inversions-1));
    }
}
