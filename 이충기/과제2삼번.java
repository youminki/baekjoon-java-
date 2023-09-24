package 이충기;

public class 과제2삼번 {
    // 억지 기법을 사용하여 도치 수 계산
    public int Count(int[] arr) {
        int count = 0; // 도치 수를 저장할 변수 초기화
        int N = arr.length; // 배열의 길이
        // 도치 계산
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (arr[i] > arr[j]) {
                    count++; // arr[i]가 arr[j]보다 크면 도치이므로 도치 수 증가
                }
            }
        }
        return count; // 최종 도치 수 반환
    }
    // 정렬된 부분 배열 arr[low..mid]와 arr[mid + 1..high]를 합병하면서 도치 수를 계산
    public static int merge(int arr[], int low, int mid, int high) {
        int inversions = 0; // 도치 수를 저장하는 변수 초기화
        int leftLength = mid - low + 1; // 왼쪽 부분 배열의 길이 계산
        int rightLength = high - mid; // 오른쪽 부분 배열의 길이 계산

        int[] leftArr = new int[leftLength]; // 왼쪽 부분 배열을 저장하는 임시 배열
        int[] rightArr = new int[rightLength]; // 오른쪽 부분 배열을 저장하는 임시 배열

        // 임시 배열에 데이터 복사
        for (int i = 0; i < leftLength; i++) {
            leftArr[i] = arr[low + i];
        }
        for (int j = 0; j < rightLength; j++) {
            rightArr[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = low;

        // 왼쪽 부분 배열과 오른쪽 부분 배열을 합병하면서 도치 수 계산
        while (i < leftLength && j < rightLength) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            }
            else {
                arr[k++] = rightArr[j++];
                inversions += (leftLength - i); // 도치 수 증가 (i와 mid 사이의 원소 개수)
            }
        }

        // 나머지 원소들을 복사
        while (i < leftLength) {
            arr[k++] = leftArr[i++];
        }
        while (j < rightLength) {
            arr[k++] = rightArr[j++];
        }

        return inversions; // 합병과정에서 계산된 도치 수 반환
    }

    // 합병 정렬 메서드 (도치 수를 계산하기 위해 수정)
    public static int mergeSort(int arr[], int low, int high) {
        int inversions = 0; // 도치 수를 저장하는 변수 초기화
        if (low < high) {
            int mid = (low + high) / 2; // 배열의 가운데 값을 계산
            inversions += mergeSort(arr, low, mid); // 왼쪽 반을 정렬하고 도치 수 누적
            inversions += mergeSort(arr, mid + 1, high); // 오른쪽 반을 정렬하고 도치 수 누적
            inversions += merge(arr, low, mid, high); // 합병하면서 도치 수 누적
        }
        return inversions; // 최종 도치 수 반환
    }

    // 배열을 출력하는 메서드
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {82, 35, 27, 96, 73, 14, 58, 49};
        System.out.println("주어진 배열");
        printArray(arr);

        int inversions = mergeSort(arr, 0, arr.length - 1);
        System.out.println("\n도치 수: " + (inversions - 1)); // 정확한 도치 수 출력
    }
}
