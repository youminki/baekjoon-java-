// https://www.acmicpc.net/problem/10818
//최소최대.java 10818
package 일차원배열;
import java.util.Scanner;

public class 최소최대 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        int max = arr[0];
        int min = arr[0];
        for(int i=0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            else if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.print(min + " " + max);
    }
}


// import java.io.BufferedReader;
// import java.io.BufferedWriter;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.io.OutputStreamWriter;
// import java.util.StringTokenizer;

// public class 최소최대 {
//     public static void main(String[] args) throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//         int N = Integer.parseInt(br.readLine());
//         int arr[] = new int[N];
//         StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//         for(int i=0; i < N; i++){
//             arr[i] = Integer.parseInt(st.nextToken());
//         }
        
//         int max = arr[0];
//         int min = arr[0];
//         for(int i=0; i < N; i++){
//             if(arr[i] < min){
//                 min = arr[i];
//             }
//             if(arr[i] > max){
//                 max = arr[i];
//             }
//         }
//         bw.write(min + " " + max);
//         bw.flush();
//     }
// }