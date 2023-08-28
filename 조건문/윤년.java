// 윤년.java 2753번
// https://www.acmicpc.net/problem/2753
package 조건문;

import java.util.Scanner;

public class 윤년 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}


// 풀어서 쓴 버전

// package 조건문;

// import java.util.Scanner;

// public class 윤년 {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int year = sc.nextInt();
//         if(year % 4 == 0){
//             if(year % 400 == 0){
//                 System.out.println(1);
//             }
//             else if(year % 100 == 0){
//                 System.out.println(0);
//             }
//             else{
//                 System.out.println(1);
//             }
//         }
//         else{
//             System.out.println(0);
//         }
//     }
// }

