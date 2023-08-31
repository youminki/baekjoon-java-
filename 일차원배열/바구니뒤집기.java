// https://www.acmicpc.net/problem/10811
// 바구니뒤집기.java 10811
package 일차원배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 바구니뒤집기 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int arr[] = new int [N];
        int temp;

        for(int i=0; i < arr.length; i++){
            arr[i] = i + 1;
        }
        for(int i=0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int I = Integer.parseInt(st.nextToken()) - 1;
            int J = Integer.parseInt(st.nextToken()) - 1;
            while(I < J){
                temp = arr[I];
                arr[I++] = arr[J];
                arr[J--] = temp;
            }
        }
        for(int i=0; i < arr.length; i++){
            bw.write(arr[i] + " ");
        }
        bw.flush();
    }
}
// import java.util.Scanner;

// public class 바구니뒤집기 {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt();
//         int M = sc.nextInt();
//         int arr[] = new int[N];
//         int temp;
//         for(int i=0; i < arr.length; i++){
//             arr[i] = i + 1;
//             //System.out.println(i);
//         }
//         for(int i=0; i < M; i++){
//             int I = sc.nextInt() - 1;
//             int J = sc.nextInt() - 1;
//             while(I < J){
//                 temp = arr[I];
//                 arr[I++] = arr[J];
//                 arr[J--] = temp;
//             }
//         }
//         for(int i=0; i < arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
// }
