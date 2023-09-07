package 이충기;

public class 사전평가시험2 {
    public static void main(String[] args){
        int n = 31;
        int start = 1;
        int end = 31;
        int count = 1;
        int min =0;
        int max = 0;
        while(start <= end){
            int mid = (start + end) / 2;
            if(mid == n){
                min += count;
                System.out.println(min);
            }
            else if(mid < n){
                start = mid + 1;
                count++;
                return;
            }
            else{
                end = mid -1;
                count++;
                return;
            }
        }
        System.out.println(max);
    }
}
