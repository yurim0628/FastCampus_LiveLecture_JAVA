package org.example;

public class API08 {
    public static void main(String[] args) {
        // 현재 실행 중인 스레드를 얻어온다. (주 스레드)
        Thread t1 = Thread.currentThread();
        System.out.println(t1.getName()); // 스레드 이름 출력 (보통 "main" 이다.)
        System.out.println(t1.getPriority()); // 스레드 우선순위 출력 (1~10 범위)

        // 1. 알파벳 A부터 Z까지 출력하기
        // 1-1. 알파벳을 출력하는 작업 (Runnable)을 만든다.
        // Runnable target = new AlphaData();
        // 1-2. 작업을 수행할 스레드 (작업자)를 생성한다.
        // Thread alpha = new Thread(target); // 스레드와 작업을 연결한다.
        Thread alpha = new AlphaData(); // AlphaData 클래스를 이용해 스레드 생성 및 시작
        // 1-3. 스레드를 시작한다.
        alpha.start(); // 이로써 run() 메서드가 실행된다: ready 상태(Queue) -> running(실행) -> block(봉쇄) -> dead(소멸)

        // 2. 1부터 100까지의 숫자 출력하기
        try {
            for (int i = 1; i <= 100; i++) {
                System.out.print(i);
                Thread.sleep(1000); // 스레드를 1초 동안 일시 정지시킨다. (문맥 교환 발생)
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println();
    }
}
