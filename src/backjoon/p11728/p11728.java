package backjoon.p11728;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 정렬되어있는 두 배열 A와 B가 주어진다. 두 배열을 합친 다음 정렬해서 출력하는 프로그램을 작성하시오.
 * 입력
 * 첫째 줄에 배열 A의 크기 N, 배열 B의 크기 M이 주어진다. (1 ≤ N, M ≤ 1,000,000)
 * <p>
 * 둘째 줄에는 배열 A의 내용이, 셋째 줄에는 배열 B의 내용이 주어진다. 배열에 들어있는 수는 절댓값이 10^9보다 작거나 같은 정수이다.
 * <p>
 * 출력
 * 첫째 줄에 두 배열을 합친 후 정렬한 결과를 출력한다.
 */
public class p11728 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int [] iArrayA= new int[N];
        int [] iArrayB= new int[M];
        int [] result= new int[N+M];
        st=new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            iArrayA[i]=Integer.parseInt(st.nextToken());
        }
        st=new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            iArrayB[i]=Integer.parseInt(br.readLine());
        }

    }
}
