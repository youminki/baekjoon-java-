package 연습;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class practice {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =  new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int [] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i < arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int search = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i=0; i < arr.length; i++){
            if(arr[i] == search){
                count++;
            }
        }
        bw.write(Integer.toString(count));
        bw.flush();
    }
}
