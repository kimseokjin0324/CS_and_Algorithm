package backjoon.p2023;

import java.util.Scanner;

public class p2023 {
    static int N;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N =in.nextInt();
        DFS(2,1);           //- 일의 자리수가 2,3,5,7은 소수인 수
        DFS(3,1);           //- 일의자리수가 소수인것부터 탐색시작
        DFS(5,1);
        DFS(7,1);
    }

    private static void DFS(int number, int jarisu) {
        if(jarisu==N) {
            if (isPrime(number)) {
                System.out.println(number);
            }
            return;
        }
        for (int i = 1; i <10 ; i++) {
            if(i%2==0){     //- 짝수라면 더이상탐색할 필요가 없음
                continue;
            }
            if(isPrime(number*10 +i)){  //-소수라면 재귀함수로 자릿수를 늘림
                DFS(number*10+i,jarisu+1);
            }
        }

    }

    private static boolean isPrime(int number) {
        for (int i = 2; i <= number/2 ; i++) {
            if(number%i ==0)
                return false;
        }
        return true;
    }
}
