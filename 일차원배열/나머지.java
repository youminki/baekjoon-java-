// https://www.acmicpc.net/problem/3052
// 나머지.java 3052
package 일차원배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 나머지 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int arr[] = new int [10];
        int temp = 0;
        int count = 0;
        for(int i=0; i < 10; i++){
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken()) % 42;
        }
        for(int i=0; i < 10; i++){
            temp = 0;
            for(int j=i+1; j < 10; j++){
                if(arr[i] == arr[j]){
                    temp++;
                }
            }
            if(temp == 0){
                count++;
            }

        }
        bw.write(String.valueOf(count));
        bw.flush();
    }
}
// import java.util.Scanner;

// public class 나머지 {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int arr[] = new int[10];
//         int temp = 0;
//         int count = 0;

//         for(int i=0; i < 10; i++){
//             arr[i] = sc.nextInt() % 42;
//         }
//         for(int i=0; i < 10; i++){
//             temp = 0;
//             for(int j = i + 1; j <10; j++){
//                 if(arr[i] == arr[j]){
//                     temp++;
//                 }
//             }
//             if(temp == 0){
//                 count++;
//             }
//         }
//         System.out.println(count);
//     }
// }
