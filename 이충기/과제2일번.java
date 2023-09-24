// 과제2 1번 최솟값찾기

package 이충기;

public class 과제2일번 {
    public static int partition(int[] arr, int start, int end){
        if(start == end){
            return arr[start];
        }
        int mid = (start + end) / 2;
        int leftArr = partition(arr, start, mid);
        int rightArr = partition(arr, mid + 1, end);
        return Math.min(leftArr, rightArr);
    }
    public static void main(String[] args){
        int[] arr = {1,3,2,4,6,9,7,8};
        System.out.println(partition(arr, 0, arr.length - 1));
    }
}
