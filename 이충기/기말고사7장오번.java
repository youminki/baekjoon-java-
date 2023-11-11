package 이충기;

import java.util.Scanner;

public class 기말고사7장오번 {
    public static void main(String[] args){
        int[] coinValue = {500, 100, 50, 10, 5, 1}; // 동전들의 액면가 배열
        int i; // 동전들의 액면가 배열 지수
        int[] numCoin = new int[6]; //거스름돈에 포함되는 각 동전의 수 배열
        int change; // 남은 거스름돈
        int count = 0; // 거스름돈에 포함되는 동전들의 수

        Scanner sc = new Scanner(System.in);
        
        //거스름돈에 포함되는 각 동전들의 수를 0으로 초기화 한다.
        for(i=0; i < numCoin.length; i++){
            numCoin[i] = 0;
        }
        System.out.print("거스름돈을 입력하세요[0~999]: ");
        change = sc.nextInt(); //거스름돈을 입력받는다.
        i = 0; // 가치가 큰 동전으로 500원짜리 동전을 선택한다.
        System.out.println(change + "원의 거스름돈은 다음과 같다.");

        // 거스름돈이 남아 있는 동안 거스름돈에 포함되는 각 동전의 개수를 계산한다.
        while(change > 0){
            //거스름돈에 남앙ㅅ는 동전들 중 가치가 가장 큰 동전들의 수를 계산한다.
            numCoin[i] = change / coinValue[i];
            count = count + numCoin[i];
            change = change % coinValue[i]; // 남은 거스름돈을 계산한다.
            if(numCoin[i] > 0){
                System.out.println(coinValue[i] + "원짜리 동전" + numCoin[i] + "개");
            }
            i++; // 남아 있는 동전들 중 다음으로 가치가 가장 큰 동전을 선택한다.
        }
        System.out.println("\n거스름돈에 포함되는 동전들의 수" + count); // 거스름돈에 포함되는 동전들의 수를 출력한다.
        sc.close();
    }
}
