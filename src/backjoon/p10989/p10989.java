package backjoon.p10989;

import java.io.*;

public class p10989 {
    public static long result;
    public static int[] A;
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        A= new int[N];

        for (int i = 0; i < N; i++) {
            A[i]= Integer.parseInt(br.readLine());
        }

        br.close();
        Radix_sort(A,5);
        for (int i = 0; i < N; i++) {
            bw.write(A[i]+"\n");
        }
        bw.flush();
        bw.close();
    }

    private static void Radix_sort(int[] A, int max_size) {
        int[] output =new int[A.length];
        int jarisu = 1;
        int count =0;
        while(count != max_size){//최대 자리수만큼 반복
            int[] bucket = new int[10]; // 0,1,2,3,4,5,6,7,8,9 각자리수 값
            for (int i = 0; i < A.length; i++) {
                bucket[(A[i]/jarisu)%10]++; //일의 자리수 부터 시작해서
            }
            for (int i = 1; i <10 ; i++) {  //합배열을이용해 index계산하기
                bucket[i] += bucket[i-1];
            }
            for (int i = A.length-1; i >=0 ; i--) { //현재자릿수를 기준으로 정렬
               output[bucket[(A[i]/jarisu%10)]-1]=A[i];
                bucket[(A[i]/jarisu)%10]--;
            }
            for (int i = 0; i < A.length; i++) {
                //다음자리수를 이동하기위해 현재자리수 기준정렬데이터저장하기
                A[i] =output[i];
            }
            jarisu = jarisu*10;
            count++;
        }
    };
}
