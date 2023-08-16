package kr.fc.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FC33 {
    public static void main(String[] args) {
        // 한글 여러자를 키보드로 부터 읽기
        // InputStream is = System.in;
        // InputStreamReader isr = new InputStreamReader(is);
        // 버퍼기능이 있는 문자 입력스트림
        // 키보드로부터 라인단위로 문자열을 입력받기위한 스트림을 연결?
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("문자열을 입력하세요: ");
        try {
            String line = br.readLine(); // 라인단위로 읽기 가능 (엔터를 제외한 문자열을 읽기)
            System.out.print(line);
            br.close(); // 입력스트림 닫기
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
