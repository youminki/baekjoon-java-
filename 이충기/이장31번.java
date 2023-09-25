// 이진 탐색(배열이 주어졌을 때 주어진 값 18찾기)
package 이충기;

public class 이장31번 {
    public static void main(String[] args) {
        int[] A = {10, 12, 13, 14, 18, 20, 25, 27, 30, 35, 40, 45, 47};
        int x = 18;
        int n = A.length;
        int location = binarySearch(A, 0, n - 1, x); // binarySearch 메서드 호출
        if (location != -1) {
            System.out.println(x + "의 위치: " + location); // 값을 찾은 경우 위치 출력
        } else {
            System.out.println(x + "를 찾을 수 없습니다."); // 값을 찾지 못한 경우 메시지 출력
        }
    }

    public static int binarySearch(int[] A, int first, int last, int target) {
        int res;
        if (first > last) { // 찾지 못한 경우
            res = -1;
        } else { // 중간 요소의 위치 계산
            int mid = (first + last) / 2;
            if (target == A[mid]) { // target이 중간 요소와 같으면 위치 반환
                res = mid;
            } else if (target < A[mid]) { // target이 중간 요소보다 작으면 앞쪽 반에서 찾음
                res = binarySearch(A, first, mid - 1, target);
            } else { // target이 중간 요소보다 크면 뒤쪽 반에서 찾음
                res = binarySearch(A, mid + 1, last, target);
            }
        }
        return res;
    }
}
