package 이충기;

import java.util.Scanner;

public class 합계산 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1; i < n; i++){
            sum += n;
        }
        System.out.println(sum);
    }
}
