// https://www.acmicpc.net/problem/154z6
// 평균.java 1546
package 일차원배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 평균 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        float arr[] = new float[N];
        float average = 0;
        float M = 0;
        st = new StringTokenizer(br.readLine());
        for(int i=0; i < arr.length; i++){
            arr[i] = Float.parseFloat(st.nextToken());
            if(arr[i] > M){
                M = arr[i];
            }
        }
        for(int j=0; j < arr.length; j++){
            average = average + (arr[j]/M * 100) / N;
        }
        bw.write(String.format("%.2f",average));
        bw.flush();
    }
}
// import java.util.Scanner;

// public class 평균 {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt();
//         float arr[] = new float[N];
//         float M = 0;
//         float average = 0;
//         for(int i=0; i < arr.length; i++){
//             arr[i] = sc.nextInt();
//             if(arr[i] > M){
//                 M = arr[i];
//             }
//         }
//         for(int j=0; j < arr.length; j++){
//                 average = average +  (arr[j] / M * 100) / N;
//             }
//         System.out.println(average);
//     }
// }
