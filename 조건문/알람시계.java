package 조건문;

import java.util.Scanner;

public class 알람시계 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        if(M >= 45){
            M = M - 45;
            System.out.printf("%d %d", H, M);
        }
        else if(H == 0){
            H = (H + 24) - 1;
            M = (M + 60) - 45;
            System.out.printf("%d %d", H, M);
        }
        else if(M < 45){
            H = H - 1;
            M = (M + 60) - 45;
            System.out.printf("%d %d", H, M);
        }
    }
}
