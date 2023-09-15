package 이충기;
public class 과제1 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13};
        int x = 5;
        
        int index = find(arr, x, 0, arr.length - 1);
        if (index != -1) {
            System.out.println(x + "는 " + index + "번째 위치에 있음.");
        } else {
            System.out.println(x + "는 없음");
        }
    }
    
    public static int find(int[] arr, int x, int first, int last) {
        if (first > last) {
            return -1; // 배열 arr[] x가 없는 경우
        }
        int mid = (first + last) / 2;
        if (arr[mid] == x) {
            return mid; // x를 찾은 경우
        } else if (arr[mid] < x) {
            return find(arr, x, mid + 1, last); // 오른쪽
        } else {
            return find(arr, x, first, mid - 1); // 왼쪽
        }
    }
}

// package 이충기;

// public class 과제1 {
//     public static void main(String[] args) {
//         int[] arr = {1, 1, 2, 2, 3, 3, 3, 1, 3, 3, 4};
//         int[] res = new int[arr.length];
//         int size = 0; //결과에 저장될 개수 저장

//         // 배열을 순회하면서 중복된 요소를 제거한 결과를 배열에 저장
//         for (int i = 0; i < arr.length; i++) {
//             int j;
//             for (j = 0; j < size; j++) {
//                 if (arr[i] == res[j]) {
//                     break;
//                 }
//             }
//             if (j == size) {
//                 res[size] = arr[i];
//                 size++;
//             }
//         }
//         for (int i = 0; i < size; i++) {
//             System.out.print(res[i] + " ");
//         }
//     }
// }
