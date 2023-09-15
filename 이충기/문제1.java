package 이충기;
public class 문제1 {
    public static void main(String[] args){
        int sum = 0;
        int n = 2;
        for(int i=1; i <= n; i++){
            for(int j=1; j <= i; j++){
                sum += i  * j;
            }
        }
        System.out.println(sum);
    }
}

// 알고리즘의 입력 크기 : n
// 기본 연산 : sum += i * j
// 시간 복잡도 : n(n + 1) / 2 -> n^2