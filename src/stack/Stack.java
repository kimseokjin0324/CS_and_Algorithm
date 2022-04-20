package stack;

import java.util.ArrayList;
import java.util.Collections;

/**
 * - JAVA ArrayList 클래스를 활용해서 스택을 다루는 push, pop 기능 구현해보기
 * - pop 기능 호출 시, 스택에 데이터가 없을 경우, null 을 리턴하도록 함
 * - 다양한 데이터 타입을 다룰 수 있도록, Java Genric 타입 문법을 활용해보기
 */
public class Stack<T> {
    ArrayList<T> stack = new ArrayList<>();

    public T pop() {
        if (stack.isEmpty())
            return null;
       else return stack.remove(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void push(T item) {
        stack.add(item);
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
