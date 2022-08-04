package doit;

import java.util.Scanner;

public class one_1 {

        public static void main(String[] args) {
            Scanner stdIn   = new Scanner(System.in);

            System.out.println("세정수의 최대값 구하기");
            System.out.printf("a의 값 :   "); int a = stdIn.nextInt();
            System.out.printf("b의 값 :   "); int b = stdIn.nextInt();
            System.out.printf("c의 값 :   "); int c = stdIn.nextInt();
            int max =a;
            if(b>max) max =b;
            if(c>max) max =c;

            System.out.println(" 최대 값은 "+ max+"입니다.");
    }
}
