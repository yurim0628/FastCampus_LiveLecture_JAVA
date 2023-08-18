package kr.fc.java;

import java.io.File;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FC38 {
    public static void main(String[] args) {
        try {
            // File class => 파일, 디렉토리 생성
            // FILE *fp

            // 파일 복사 예제

            // 파일 객체 생성
            File sourceFile = new File("pic.PNG"); // 복사할 원본 파일
            System.out.println("원본 파일 크기: " + sourceFile.length() + " bytes");

            // FileInputStream과 BufferedInputStream을 사용하여 파일을 읽기 위한 준비
            FileInputStream fis = new FileInputStream(sourceFile);
            BufferedInputStream bis = new BufferedInputStream(fis);

            // FileOutputStream과 BufferedOutputStream을 사용하여 파일을 쓰기 위한 준비
            FileOutputStream fos = new FileOutputStream("newpic.png"); // 새로운 복사본 파일
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            // 파일 내용 복사
            // 0 ~ 255 (픽셀)
            int data;
            int byteCount = 0; // 복사한 바이트 수를 기록할 변수
            while ((data = bis.read()) != -1) {
                bos.write(data); // 읽은 바이트를 새 파일에 쓴다
                byteCount++;
            }

            // 스트림을 닫고 리소스를 해제한다
            bis.close();
            bos.close();

            System.out.println("이미지 복사완료");
            System.out.println("복사한 바이트 수: " + byteCount + " bytes");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
