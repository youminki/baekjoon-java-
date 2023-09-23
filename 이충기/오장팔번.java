// 최댓값과 최솟값 찾는 알고리즘
package 이충기;

public class 오장팔번 {
    public static int[] find(int[] arr, int i, int j){
        int mid;
        int[] res = new int[2];
        int[] leftRes = new int[2];
        int[] rightRes = new int[2];
        if(i == j){
            res[0] = arr[i];
            res[1] = arr[j];
        }
        else if(i == j - 1){
            if(arr[i] < arr[j]){
                res[0] = arr[i];
                res[1] = arr[j];
            }
            else{
                res[0] = arr[i];
                res[1] = arr[j];
            }
        }
        else{
            mid = (i + j) / 2;
            leftRes = find(arr, i, mid);
            rightRes = find(arr, mid + 1, j);
            if(leftRes[0] < rightRes[0]){
                res[0] = leftRes[0];
            }
            if(leftRes[1] < rightRes[1]){
                res[1] = rightRes[1];
            }
        }
        return res;

    }
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50, 60};
        int[] res = new int[2];
        res = find(arr, 0, arr.length - 1);
        System.out.println("최솟값" + res[0]);
        System.out.println("최댓값" + res[1]);
    }

}
