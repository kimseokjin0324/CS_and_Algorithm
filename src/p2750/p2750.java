package p2750;

import java.util.Scanner;

//브론즈 1 백준 2750 2022.10.17
public class p2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A =new int[N];
        for (int i = 0; i < N; i++) {
            A[i] =sc.nextInt();
        }

        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - 1 - i; j++) {
                if(A[j]>A[j+1]){
                    int temp =A[j];
                    A[j]= A[j+1];
                    A[j+1]= temp;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.println(A[i]);
        }
     }
}
