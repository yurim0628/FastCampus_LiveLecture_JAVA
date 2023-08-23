package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.util.EntityUtils;

import java.io.FileOutputStream;

@Data
@AllArgsConstructor
public class DownloadBroker extends Thread implements Runnable {  // 스레드(알바생)가 처리하는 작업 클래스
    // 다운로드할 이미지의 URL과 파일 이름, HttpClient 인스턴스를 저장하는 클래스

    private final String imageUrl; // 다운로드할 이미지 URL
    private final String imageName; // 저장할 이미지 파일 이름
    private final HttpClient httpClient; // HttpClient 인스턴스

    // Thread의 run() 메서드를 오버라이드하여 이미지 다운로드 작업을 수행한다.
    public void run() {
        try {
            HttpGet httpGet = new HttpGet(imageUrl); // HTTP GET 요청 생성
            HttpResponse response = httpClient.execute(httpGet); // GET 요청 실행
            HttpEntity entity = response.getEntity(); // 응답 엔터티 추출

            // 엔터티를 byte 배열로 변환하여 저장
            byte[] imgBuf = EntityUtils.toByteArray(entity);

            // 이미지 파일로 저장
            FileOutputStream fos = new FileOutputStream(imageName);
            fos.write(imgBuf);
            fos.close();

            System.out.println("이미지 다운로드 완료");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
