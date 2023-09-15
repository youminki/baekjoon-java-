// 다음의 숫자들에 대해 100을 이진탐색으로 찾는 과정을 보여라. 
// 10, 20, 25, 35, 45, 55, 60, 75, 80, 90, 95


package 이충기;

import java.util.Arrays;
import java.util.Scanner;

public class 문제2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = {10, 20, 25, 35, 45, 55, 60, 75, 80, 90, 95};
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

