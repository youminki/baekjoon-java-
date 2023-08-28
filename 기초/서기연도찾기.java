// 1998년생인 내가 태국에서는 2541년생?! 18108번
// https://www.acmicpc.net/problem/18108
package 기초;

import java.util.Scanner;

public class 서기연도찾기 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int BC = sc.nextInt();
        int AD =  BC - 543;
        System.out.print(AD);
    }
}
