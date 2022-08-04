package doit;

import java.util.Scanner;

public class examQ3 {
    static int min4(int a, int b, int c, int d) {
        int min;
        min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        if (d < min) min = d;
        return min;
    }

    public static void main(String[] args) {
        Scanner stdIn= new Scanner(System.in);
        int a,b,c,d;

        System.out.println("네 정수의 최소값을 구함");
        System.out.printf("a의 값 :");
        a= stdIn.nextInt();
        System.out.printf("b의 값 :");
        b= stdIn.nextInt();
        System.out.printf("c의 값 :");
        c= stdIn.nextInt();
        System.out.printf("d의 값 :");
        d= stdIn.nextInt();

        int min =min4(a,b,c,d);
        System.out.println("최소값은 "+min+ "입니다");
    }
}
