// // X 보다작은수.java 10871
// // https://www.acmicpc.net/problem/10871
// package 일차원배열;
import java.util.Scanner;

public class X보다작은수 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int arr[] = new int[N];

        for(int i=0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        for(int i=0; i < N; i++){
            if(arr[i] < X){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
// import java.io.BufferedReader;
// import java.io.BufferedWriter;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.io.OutputStreamWriter;
// import java.util.StringTokenizer;

// public class X보다작은수 {
//     public static void main(String[] args) throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//         StringTokenizer st = new StringTokenizer(br.readLine());
//         int N = Integer.parseInt(st.nextToken());
//         int X = Integer.parseInt(st.nextToken());
//         st = new StringTokenizer(br.readLine());
//         for(int i=0; i < N; i++){
//             int num = Integer.parseInt(st.nextToken());
//             if(num < X){
//                 bw.write(Integer.toString(num) + " ");
//                 bw.flush();
//             }
//         }
//     }
// }
