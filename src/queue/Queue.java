package queue;

import java.util.ArrayList;

/**
 * - JAVA ArrayList 클래스를 활용해서 큐를 다루는 enqueue, dequeue 기능 구현해보기
 * - dequeue 기능 호출 시, 큐에 데이터가 없을 경우, null 을 리턴하도록 함
 * - 다양한 데이터 타입을 다룰 수 있도록, Java Genric 타입 문법을 활용해보기
 */
public class Queue<T> {
    ArrayList<T> arr_queue = new ArrayList<T>();

    public void enqueue(T item) {
        arr_queue.add(item);    //- 인덱스 0에 처음 이들어감 -> dequeue시 인덱스가 0인 값을 remove하면됨
    }

    public T dequeue() {
        if (arr_queue.isEmpty()) {
            return null;
        }else return arr_queue.remove(0);
    }
    public boolean isEmpty() {
        return arr_queue.isEmpty();
    }

    public static void main(String[] args) {
        Queue<Integer> mq = new Queue<Integer>();
        mq.enqueue(1);
        mq.enqueue(2);
        mq.enqueue(3);
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
    }
}
