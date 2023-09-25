// wkdustn n의 계승 계산
package 이충기;

public class 이장29번 {
    public static void main(String[] args){
        int n = 10;
        int res;
        res = factorial(n);
        System.out.print(n + "의 계승" + res);
    }
    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        else{
            return n * factorial(n - 1);
        }
    }
}
