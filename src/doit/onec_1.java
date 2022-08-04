package doit;

import java.util.Scanner;

public class onec_1 {
    static int med3(int a, int b, int c) {
        if (a >= b) {
            if (b >= c)
                return b;
            else if (a <= c)
                return a;
            else return c;
        } else if (a > c) return a;
        else if (b > c) return c;
        else return b;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("세 정수의 중앙값을 구함");
        System.out.printf("a의 값 ");
        int a = stdIn.nextInt();
        System.out.printf("b의 값 ");
        int b = stdIn.nextInt();
        System.out.printf("c의 값 ");
        int c= stdIn.nextInt();

        System.out.println("중앙값은 "+med3(a,b,c)+"입니다.");
    }
}
