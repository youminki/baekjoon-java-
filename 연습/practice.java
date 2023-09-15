// =============================================
// 주석버전
// 필요한 Java 라이브러리 임포트
import java.util.Scanner;

// "프렉탈평면" 클래스 정의
public class practice {
    static int s, N, K, R1, R2, C1, C2; // 입력값 및 변수 선언

    // 재귀 함수로 해당 위치가 1인지 0인지 계산하는 함수
    static int func(int size, int x, int y) {
        if (size == 1) return 0; // 기저 조건: len이 1이면 0 반환
        int border = size / N; // 현재 길이를 N으로 나눈 값을 계산하여 border 변수에 저장

        // 주어진 조건에 따라 위치가 1 또는 0인지 판단
        if (x >= border * (N - K) / 2 && x < border * (N + K) / 2
                && y >= border * (N - K) / 2 && y < border * (N + K) / 2) {
            return 1; // 조건을 만족하면 1 반환
        }
        return func(border, x % border, y % border); // 재귀 호출로 다음 레벨의 위치 확인
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력값 받기
        s = sc.nextInt(); // 반복 횟수
        N = sc.nextInt(); // 프렉탈 크기
        K = sc.nextInt(); // 검은 부분 크기
        R1 = sc.nextInt(); // 출력할 행 범위 시작
        R2 = sc.nextInt(); // 출력할 행 범위 끝
        C1 = sc.nextInt(); // 출력할 열 범위 시작
        C2 = sc.nextInt(); // 출력할 열 범위 끝

        if (s == 0) {
            System.out.println(0); // 반복 횟수가 0이면 0을 출력하고 프로그램 종료
            return;
        }

        int size = 1;
        while (s-- > 0) {
            size *= N; // 반복 횟수에 따른 전체 길이 계산
        }

        // 행과 열을 반복하여 결과 출력
        for (int i = R1; i <= R2; i++) {
            for (int j = C1; j <= C2; j++) {
                System.out.print(func(size, i, j)); // 위치의 결과 출력
            }
            System.out.println(); // 다음 행으로 이동
        }
    }
}
23