// https://www.acmicpc.net/problem/5597
// 과제안내신분..?.java 5597
package 일차원배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 과제안내신분 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int arr[] = new int [31];

        for(int i=1; i < 29; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int check = Integer.parseInt(st.nextToken());
            arr[check] = 1;
        }
        for(int i=1; i < arr.length; i++){
            if(arr[i] != 1){
                bw.write(i + "\n");
            }
        }
        bw.flush();
    }
}
// import java.util.Scanner;

// public class 과제안내신분 {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int arr[] = new int [31];
//         for(int i=1; i < 29; i++){
//             int check = sc.nextInt();
//             arr[check] = 1;
//         }
//         for(int i =1; i < arr.length; i++){
//             if(arr[i] != 1){
//                 System.out.println(i);
//             }
//         }
//         sc.close();
//     }
// }



