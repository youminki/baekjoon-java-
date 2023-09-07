package 이충기;

public class 사전평가시험1 {
    public static void main(String[] args){
        int count = 0;
        int mystery = 1;
        while(count < 5){
            count++;
            mystery = mystery * count;
        }
        System.out.printf("%d %d",count, mystery);
    }
}

