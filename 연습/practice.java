package 연습;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class practice {
    public static int N;
    public static long B;
    public static int[][] map;

    public static void main(String[] agrs) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        B = Long.parseLong(input[1]);
        map = new int[N][N];
        for(int i=0; i < N; i++){
            input = br.readLine().split(" ");
            for(int j=0; j < N; j++){
                map[i][j] = Integer.parseInt(input[j]) % 1000;
            }
        }

        int[][] result = partition(B);

        for(int i=0; i < N; i++){
            for(int j=0; j < N; j++){
                bw.write(result[i][j] + " ");
            }
            bw.write("\n");
        }
        bw.flush();
    }
    public static int[][] partition(long count){
        if(count == 1){
            return map;
        }
        int[][] result = partition(count / 2);
        if(count % 2 == 0){
            return multiply(result, result);
        }
        else{
            int[][] result2 = multiply(result, map);
            return multiply(result, result2);
        }
    }

    public static int[][] multiply(int[][] A, int[][] B){
        int[][] temp = new int[N][N];
        for(int i=0; i < N; i++){
            for(int j=0; j < N; j++){
                for(int k=0; k < N; k++){
                    temp[i][j] += (A[i][k] * B[k][j]) % 1000;
                }
                temp[i][j] %= 1000;
            }
        }
        return temp;
    }
}