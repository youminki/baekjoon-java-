// https://www.acmicpc.net/problem/10813
// 공바꾸기.java 10813
package 일차원배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 공바꾸기 {
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
            int I = Integer.parseInt(st.nextToken());
            int J = Integer.parseInt(st.nextToken());
            temp = arr[I - 1];
            arr[I - 1] = arr[J - 1];
            arr[J - 1] = temp;
        }
        for(int i=0; i < arr.length; i++){
            bw.write(arr[i] + " ");
            bw.flush();
        }
    }
}
// import java.util.Scanner;

// public class 공바꾸기 {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt();
//         int M = sc.nextInt();
//         int arr[] = new int [N];
//         int temp;
        
//         for(int i=0; i < arr.length; i++){
//             arr[i] = i + 1;
//         }

//         for(int i=0; i < M; i++){
//             int I = sc.nextInt();
//             int J = sc.nextInt();
//             temp = arr[I - 1];
//             arr[I - 1] = arr[J - 1];
//             arr[J - 1] = temp;
//         }
//         for(int i=0; i < arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }

//     }
// }
