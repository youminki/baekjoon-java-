package 연습;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class practice {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int arr[] = new int[10];
        int temp = 0;
        int count = 0;

        // 10개의 숫자를 입력받고, 각 숫자를 42로 나눈 나머지를 배열에 저장
        for (int i = 0; i < 10; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken()) % 42;
        }

        // 중복을 체크하고 중복되지 않은 나머지 값의 개수를 세는 부분
        for (int i = 0; i < 10; i++) {
            temp = 0; // temp 변수 초기화
            for (int j = i + 1; j < 10; j++) { // 현재 위치(i) 다음부터 배열을 순회하며 중복 체크
                if (arr[i] == arr[j]) { // 중복된 나머지 값을 찾으면 temp를 증가
                    temp++;
                }
            }
            if (temp == 0) { // 중복이 없으면 count를 증가
                count++;
            }
        }

        // 중복되지 않은 나머지 값의 개수를 출력
        bw.write(String.valueOf(count));
        bw.newLine();
        bw.flush();
        
        br.close();
        bw.close();
    }
}
