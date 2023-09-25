// 분할 정복을 사용하여 최댓값과 최솟값 찾는 알고리즘
package 이충기;

public class 오장8번 {
    // 분할 정복을 이용하여 배열 A[i .. j]의 최솟값과 최댓값을 찾는다
    public static int[] find(int[] arr, int i, int j){
        int mid; // A[i .. j]의 중앙 요소의 지수
        int[] res = new int[2]; // A[i .. j]의 최솟값과 최댓값을 저장하는 배열
        int[] leftRes = new int[2]; // A[i .. mid]의 최솟값과 최댓값을 저장하는 배열
        int[] rightRes = new int[2]; // A[mid + 1 .. j]의 최솟값과 최댓값을 저장하는 배열
        if(i == j){ //배열에 1개의 요소만 있는 경우
            res[0] = arr[i];
            res[1] = arr[j];
        }
        else if(i == j - 1){ // 배열에 2개의 요소들이 있는 경우
            if(arr[i] < arr[j]){
                res[0] = arr[i];
                res[1] = arr[j];
            }
            else{
                res[0] = arr[i];
                res[1] = arr[j];
            }
        }
        else{ // A[i .. j]의 중앙 요소의 지수를 계산한다.
            mid = (i + j) / 2;
            leftRes = find(arr, i, mid); // A[i .. mid]의 최댓값을 구한다.
            rightRes = find(arr, mid + 1, j); // A[mid + 1 .. j]의 최댓값을 구한다.
            if(leftRes[0] < rightRes[0]){ // A[i .. j]의 최솟값과 최댓값을 구한다.
                res[0] = leftRes[0];
            }
            if(leftRes[1] < rightRes[1]){ // A[i .. j]의 최솟값과 최댓값을 구한다.
                res[1] = rightRes[1];
            }
        }
        return res;

    }
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50, 60};
        int[] res = new int[2];
        res = find(arr, 0, arr.length - 1); // 배열 A의 최솟값과 최댓값을 찾는다.
        System.out.println("최솟값" + res[0]);
        System.out.println("최댓값" + res[1]);
    }

}
