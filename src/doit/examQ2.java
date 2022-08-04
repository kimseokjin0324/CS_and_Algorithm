package doit;

import java.util.Scanner;

public class examQ2 {

    static int min3(int a, int b, int c) {
        int min;
        min = a;
        if (b < min) min = b;
        if (c < min) min = c;

        return min;
    }

    public static void main(String[] args) {
        int a,b,c;
        Scanner stdIn = new Scanner(System.in);
        System.out.println("세 정수의 최소값을 구함");
        System.out.printf("a의 값 :");
        a= stdIn.nextInt();
        System.out.println("b의 값 :");
        b= stdIn.nextInt();
        System.out.printf("c의 값 :");
        c= stdIn.nextInt();

        int min =min3(a,b,c);
        System.out.println("최소값은 "+min+ "입니다");

    }
}
