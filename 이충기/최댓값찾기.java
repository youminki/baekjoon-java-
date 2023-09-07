package 이충기;

public class 최댓값찾기 {
    public static void main(String[] args){
        int[] arr = {72, 60, 83, 47, 89, 95};
        int maximum = 0;
        maximum = findMax(arr);
        System.out.println("최댓값 = " + maximum);
    }
    public static int findMax(int[] A){
        int max;
        max = A[0];
        for(int i=1; i < A.length; i++){
            if(a[i] > max){
                max = A[i];
            }
            return max;
        }
    }
}
