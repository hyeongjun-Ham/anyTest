package org.example.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicTest {
    static Integer integer = 0;
    public static void main(String[] args) {

        // AtomicInteger 객체 생성
        AtomicInteger atomicInt = new AtomicInteger(0);

        // 여러 스레드에서 동시에 증가 연산 수행
        Runnable incrementTask = () -> {
            for (int i = 0; i < 1000; i++) {
                integer++;
                atomicInt.incrementAndGet();
            }
        };

        // 스레드 생성
        Thread thread1 = new Thread(incrementTask);
        Thread thread2 = new Thread(incrementTask);

        // 스레드 시작
        thread1.start();
        thread2.start();

        try {
            // 메인 스레드에서 생성한 스레드들이 모두 종료될 때까지 대기
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 결과 출력
        System.out.println("Final atomicInt value: " + atomicInt.get());
        System.out.println("Final integer value : " + integer);
    }
}
