package 이충기;

import java.util.Arrays;
import java.util.Scanner;

public class 값찾기이진탐색 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = {28, 40, 56, 63, 74, 87, 95};
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = (start + end) / 2;
            if(arr[mid] == n) {
                System.out.print("있다");
                return;
            } else if(arr[mid] < n) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.print("없다");
    }
}
