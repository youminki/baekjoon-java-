// 문자와문자열.java 27866
// https://www.acmicpc.net/problem/27866
package 분할정복;

import java.util.Scanner;

public class 색종이만들기 {
    public static int[][] map;
    public static int white;
    public static int blue;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        map = new int[N][N];
        for(int i=0; i < N; i++){
            for(int j=0; j < N; j++){
                map[i][j] = sc.nextInt();
            }
        }
        partition(0, 0, N);
        System.out.println(white);
        System.out.println(blue);
    }
    public static void partition(int row, int col, int size){
        if(colorCheck(row, col, size)){
            if(map[row][col] == 0){
                white++;
            }
            else{
                blue++;
            }
            return;
        }
        int newSize = size / 2;
        partition(row, col, newSize);
        partition(row, col + newSize, newSize);
        partition(row + newSize, col, newSize);
        partition(row + newSize, col + newSize, newSize);

    }
    public static boolean colorCheck(int row, int col, int size){
        int color = map[row][col];
        for(int i = row; i < row + size; i++){
            for(int j = col; j< col + size; j++){
                if(map[i][j] != color){
                    return false;
                }
            }
        }
        return true;
    }
}