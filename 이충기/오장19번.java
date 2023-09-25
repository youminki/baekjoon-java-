package 이충기;

public class 오장19번{
    // 정렬된 부분 배열 arr[low..mid]와 arr[mid + 1..high]를 합병하는 메서드
    public static void merge(int arr[], int low, int mid, int high) {
        int h, i, j, k;
        int[] res = new int[high + 1]; // 임시 배열 생성
        h = low; // 임시 배열의 시작 위치
        i = low; // 왼쪽 부분 배열의 시작 위치
        j = mid + 1; // 오른쪽 부분 배열의 시작 위치
        while (i <= mid && j <= high) { // 왼쪽과 오른쪽 부분 배열을 비교하면서 합병
            if (arr[i] <= arr[j]) {
                res[h] = arr[i];
                i += 1;
            } else {
                res[h] = arr[j];
                j += 1;
            }
            h += 1;
        }
        if (i > mid) { // 왼쪽 부분 배열이 남아있는 경우
            for (k = j; k <= high; k++) {
                res[h] = arr[k];
                h += 1;
            }
        } else { // 오른쪽 부분 배열이 남아있는 경우
            for (k = i; k <= mid; k++) {
                res[h] = arr[k];
                h += 1;
            }
        }
        for (k = low; k <= high; k++) { // 정렬된 결과를 원래 배열로 복사
            arr[k] = res[k];
        }
    }
    
    public static void mergeSort(int arr[], int n) { // 비재귀 합병 정렬 메서드
        int size = 1;
        while (size < n) {
            for (int i = 0; i < n; i += 2 * size) {
                int low = i;
                int mid = i + size - 1;
                int high = Math.min(i + 2 * size - 1, n - 1);
                merge(arr, low, mid, high);
            }
            size *= 2; // 정렬된 부분 배열의 크기를 2배로 한다.
        }
    }
    
    public static void printArray(int arr[]) { // 배열을 출력하는 메서드
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int arr[] = { 10, 40, 60, 20, 30, 60 };
        System.out.println("주어진 배열");
        printArray(arr);
        mergeSort(arr, arr.length);
        System.out.println("\n정렬된 배열");
        printArray(arr);
    }
}


// package 이충기;

// public class 오장19번 {
//     public static void margeSort2(int A[], int n){
//         // 배열 A[0 .. n - 1]를 비재귀 합병 정렬을 이용하여 정렬한다.
//         // 입력 : 정렬할 수 있는 요소들의 배열 A[0 .. n - 1]
//         // 출력 : 오름차순으로 정렬된 요소들의 배열 A[0 .. n - 1]
//         int size = 1;
//         while(size < n){
//             for(int i=0; i < n; i += 2 * size){
//                 margeSort2(A, i, i + size - 1, i + 2 * size - 1);
//             }
//             size *= 2; // 정렬된 부분 배열의 크기를 2배로 한다.
//         }
//     }
// }
