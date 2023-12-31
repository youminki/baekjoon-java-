// 개수세기.java 10807
// https://www.acmicpc.net/problem/10807
package 일차원배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 개수세기 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i <  arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int searchNum = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i=0; i < arr.length; i++){
            if(arr[i] == searchNum){
                count++;
            }
        }
        bw.write(Integer.toString(count));
        bw.flush();
    }
}
