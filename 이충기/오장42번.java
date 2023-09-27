// 선택 알고리즘
package 이충기;
//프로글매 : 배열 내에서 k번째로 작은 요소를 찾는다.
public class 오장42번 {
    //배열 S[first .. last]를 S[first]를 기준으로 하여 분할한다.
    // S[first]보다 큰 요소들을 S[first]의 오른쪽에 배치하고 나머지
    // 요소들을 S[first]의 왼족에 배칳나다.@interface
    public static int partition(int S[], int first, int last){
        int i, j, temp;
        i = first + 1;
        j = last;
        // 배열의 S[first]를 기준으로 하여 S[first]보다 큰요소는 배열의
        // 오른쪽으로 옮기고 작거나 같은 요소는 배열의 왼쪽으로 옮긴다.@interface
        while(i <= j){
            if(S[i] <= S[first]){
                i += 1;
            }
            else if(S[j] > S[first]){
                j -= 1;
            }
            else{
                temp = S[i];
                S[i] = S[j];
                S[j] = temp;
                i += 1;
                j += 1;
            }
        }

        //S[first]를 S[first]보다 작거나 같은 요소들의 구역의 마지막 요소와 교환한다.
        temp = S[first];
        S[first] = S[j];
        S[j] = temp;
        return j;
    }

    //배열 S[first .. last]내에서 k번째 작은 요소를 찾아서 반환한다.
    public static int selection(int[] A, int first, int last, int k){
        int p, S;
        p = partition(A, first, last); // 배열 A[first .. last]를 분할할 지수를 계산한다.
        S = (p - 1) - first + 1; // A[p]보다 작거나 같은 요소들의 수를 계산한다.
        if(k <= S){ // A[p]보다 작거나 같은 요소들의 Small 그룹에서 찾는다.
            return selection(A, first, p - 1, k);
        }
        else if(k == S + 1){
            return A[p]; // k번째 작은 요소를 찾았다.
        }
        else{ //A[p]보다 큰 요소들을 Large 그룹에서 찾는다.
            return selection(A, p + 1, last, k - S - 1);
        }
    }
    public static void main(String[] args){
        int A[] = {48, 12, 70, 38, 75, 67, 96, 52, 81};
        int k = 5;
        System.out.println(k + "번째로 작은 요소 " + selection(A, 0, A.length - 1, k) );
    }
}
