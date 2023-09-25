// 빠른 알고리즘

package 이충기;

public class 오장24번 {
    // 배열 S[low .. high]를 S[low]를 기준으로 하여 분할한다.
    // S[low]보다 큰 요소들을 S[low]의 오른쪽에 배치하고 나머지 요소들을 S[low]의 왼쪽에 배치한다.
    public static int partition(int S[], int low, int high){
        int i, j, temp;
        i = low + 1;
        j = high;
        while(i <= j){ // 배열을 S[low]를 기준으로 하여 S[low]보다 큰 요소는 배열의 오른쪽으로 옮기고 작은 요소는 배열의 왼쪽으로 옮긴다.
            if(S[i] <= S[low]){
                i += 1;
            }
            else if(S[j] > S[low]){
                j -= 1;
            }
            else{
                temp = S[i];
                S[i] = S[j];
                S[j] = temp;
                i += 1;
                j -= 1;
            }
        }
        // S[low]를 S[low]보다 작거나 같은 요소들의 구역의 마지막 요소와 교환한다.
        temp = S[low];
        S[low] = S[j];
        S[j] = temp;
        return j;
    }
    public static void quickSort(int S[], int low, int high){ //배열 S[low .. high]를 정렬한다.
        int pivoPoint;
        if(low < high){
            pivoPoint = partition(S, low, high); // 배열 S[low .. high]를 분할할 지수를 계산한다.
            quickSort(S, low, pivoPoint - 1); // S[low .. pivoPoint - 1]을 빠른 정렬을 사용하여 정렬한다.
            quickSort(S, pivoPoint + 1, high);//S[pivoPoint + 1 .. high]을 빠른 정렬을 사용하여 정렬한다.
        }
    }
    public static void printArray(int A[]){ //배열 A의 요소들을 출력한다
        for(int i =0; i < A.length; ++i){
            System.out.print(A[i] + " ");
        }
    }
    public static void main(String args[]){
        System.out.println("\n주어진 배열");
        int A[] = {15, 22, 13, 27, 12, 10, 20, 25, 32};
        printArray(A);
        quickSort(A, 0, A.length - 1);
        System.out.println("\n정렬된 배열");
        printArray(A);
    }
}
