// 공넣기.java 10810
// https://www.acmicpc.net/problem/10810
package 일차원배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 공넣기 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int arr[] = new int [N];
        
        for(int i=0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int I = Integer.parseInt(st.nextToken());
            int J = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            for(int j=I-1; j < J; j++){
                arr[j] = K;
            }
        }
        for(int i=0; i < arr.length; i++){
            bw.write(arr[i] + " ");
            bw.flush();
        }

    }
}

// import java.util.Scanner;

// public class 공넣기 {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt();
//         int M = sc.nextInt();
//         int arr[] = new int[N];

//         for(int i=0; i < M; i++){
//             int I = sc.nextInt();
//             int J = sc.nextInt();
//             int K = sc.nextInt();
//             for(int j = I - 1; j < J; j++){
//                 arr[j] = K;
//             }
//         }
//         for(int i = 0; i < arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
// }
