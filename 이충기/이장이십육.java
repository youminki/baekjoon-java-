package 이충기;

import java.util.Scanner;

public class 이장이십육 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] FREQ = {1, 0, 7, 5, 4};
        int[] CUME;
        CUME = ComputerSum(FREQ);
        System.out.println(CUME);

        for(int i=0; i < CUME.length; i++){
            System.out.print(CUME[i] + " ");
        }
    }
    public static int[] ComputerSum(int[] FREQ){
        int n = FREQ.length;
        int [] CUME = new int[n];

        CUME[0] = FREQ[0];
        for(int i=1; i < n; i++){
            CUME[i] = CUME[i - 1] + FREQ[i];
        }
        return CUME;

    }
}
