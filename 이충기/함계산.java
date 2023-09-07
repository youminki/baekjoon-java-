package 이충기;

import java.util.Scanner;

public class 함계산 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int sum = 0;
        int i = 0;
        while(i < n){
            i++;
            sum += i;
        }
        System.out.println(sum);
    }
}
