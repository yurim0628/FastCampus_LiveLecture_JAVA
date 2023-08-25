package org.example;

public class AlphaData extends Thread implements Runnable {
    @Override
    public void run() {
        try {
            for (char i = 'A'; i <= 'Z'; i++) {
                System.out.println(i);
                Thread.sleep(1000); // 다른 스레드가 cpu의 시간을 얻을 수 있는 기회를 준다.
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
