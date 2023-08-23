package org.example;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClients;

// JVM -> main Thread
public class API07 {
    public static void main(String[] args) {
        String imageUrl = "https://sum.su.or.kr:8888/Themes/main/images/sub/audio_defaultimg.jpg";
        String imageName = "audio_defaultimg.jpg";
        HttpClient httpClient = HttpClients.createDefault();

        // 이미지 다운로드 -> 별도의 Thread를 만들어서 처리
        // DownloadBroker db = new DownloadBroker(imageUrl, imageName, httpClient);
        // db.start(); // run() 구동
        // main Thread

        // 1. 알바생(스레드)이 해야할 일은 만들어 놓았다. (DownloadBroker)
        Runnable job = new DownloadBroker(imageUrl, imageName, httpClient); // 이미지를 다운로드하기 위한 작업을 정의한다.
        // 2. 알바생을 채용해야한다. // 3. 알바생과 일을 연결한다.
        Thread t1 = new Thread(job); // 스레드를 생성하고 작업을 연결한다.
        // 4. 일을 시작한다.
        t1.start(); // 스레드의 작업을 시작한다.

        System.out.println("main Thread 종료");
    }
}

/*
- MySQL(8.0) 설치
+ Data Modeling(ERD -> RM)
+ JDBC -> Mybatis -> ORM(Hibernate) -> JPA(Spring)
 */