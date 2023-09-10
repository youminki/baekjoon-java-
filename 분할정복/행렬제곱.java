package 분할정복;

import java.util.Scanner;

public class 행렬제곱 {
    public static int N;
    public static int[][] map;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        long B = sc.nextLong();
        map = new int[N][N];
        for(int i=0; i < N; i++){
            for(int j=0; j < N; j++){
                map[i][j] = sc.nextInt() % 1000;
            }
        }
        int[][] result = partition(map, B);
        StringBuilder sb = new StringBuilder();
        for(int i =0; i < N; i++){
            for(int j=0; j < N; j++){
                sb.append(result[i][j]).append(' ');
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }

        public static int[][] partition(int[][] A, long exp){
            if(exp == 1L){
                return A;
            }
            int[][] ret = partition(A, exp / 2);
            ret = multiply(ret, ret);
            if(exp % 2 == 1L){
                ret = multiply(ret, map);
            }
            return ret;
        }

        public static int[][] multiply(int[][] o1, int[][] o2){
            int[][] ret = new int[N][N];
            for(int i=0; i < N; i++){
                for(int j=0; j < N; j++){
                    for(int k=0; k < N; k++){
                        ret[i][j] += o1[i][k] * o2[k][j];
                        ret[i][j] %= 1000;
                    }
                }
            }
            return ret;
        }
}
