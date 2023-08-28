// 주사위세개.java 2480
// https://www.acmicpc.net/problem/2480
package 조건문;

import java.util.Scanner;

public class 주사위세개 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int dice1 = sc.nextInt();
        int dice2 = sc.nextInt();
        int dice3 = sc.nextInt();
        int result;
        if(dice1 == dice2 && dice2 == dice3 && dice1 == dice3){
            result = 10000 + (dice1 * 1000);
        }
        else if(dice1 == dice2 || dice1 == dice3){
            result = 1000 + (dice1 * 100);
        }
        else if(dice1 == dice2 || dice2 == dice3){
            result = 1000 + (dice2 * 100);
        }
        else if(dice2 == dice3 || dice3 == dice1){
            result = 1000 + (dice3 * 100);
        }
        else{
            result = Math.max(dice1, Math.max(dice2, dice3)) * 100;
        }
        System.out.println(result);
    }
}
