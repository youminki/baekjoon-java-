package 이충기;

public class 실행시간측정단위{
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