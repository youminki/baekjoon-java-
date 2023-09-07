// 색종이 만들기 2630
// https://www.acmicpc.net/problem/2630
package 분할정복;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 색종이만들기 {
    public static void main(String[] args ) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][N];
        for(int i=0; i < N; i++){
            for(int j=0; j < i; j++){
            }
        }
        bw.write(arr[N][N]);
        bw.flush();
    }
}

//part 1
// 1 1 0 0 0 0 1 1
// 1 1 0 0 0 0 1 1
// 0 0 0 0 1 1 0 0
// 0 0 0 0 1 1 0 0
// 1 0 0 0 1 1 1 1
// 0 1 0 0 1 1 1 1
// 0 0 1 1 1 1 1 1
// 0 0 1 1 1 1 1 1

//---------------------

//part 2
// 1 1 0 0 | 0 0 1 1
// 1 1 0 0 | 0 0 1 1
// 0 0 0 0 | 1 1 0 0
// 0 0 0 0 | 1 1 0 0
//---------------------
// 1 0 0 0 | 1 1 1 1
// 0 1 0 0 | 1 1 1 1
// 0 0 1 1 | 1 1 1 1
// 0 0 1 1 | 1 1 1 1

//---------------------

//part 3
// 1 1 0 0 | 0 0 1 1
// 1 1 0 0 | 0 0 1 1
//---------------------
// 0 0 0 0 | 1 1 0 0
// 0 0 0 0 | 1 1 0 0
//---------------------
// 1 0 0 0 | 1 1 1 1
// 0 1 0 0 | 1 1 1 1
//---------------------
// 0 0 1 1 | 1 1 1 1
// 0 0 1 1 | 1 1 1 1