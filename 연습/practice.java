// 문자와문자열.java 27866
// https://www.acmicpc.net/problem/27866
package 연습;

public class practice {
    public static void main(String[] args){
        int sum = 0;
        for(int i=1; i< 10; i++){
            for(int j=1; j < 10; j++){
                sum += i * j;
            }
        }
        System.out.println(sum);
    }
}