package 이충기;

public class 사전평가시험3 {
        public static void main(String[] args) {
        int n = 3;
        fun(n);
    }
    public static void fun(int n) {
        if (n < 1) {
            System.out.print('B');
        } else {
            fun(n - 1);
            System.out.print('R');
        }
    }
}