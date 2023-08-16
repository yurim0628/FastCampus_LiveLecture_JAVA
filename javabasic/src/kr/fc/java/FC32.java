package kr.fc.java;

import java.io.EOFException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FC32 {
    public static void main(String[] args) {
        // 한글 한자를 입력하여 출력
        InputStream is = System.in; // 표준 입력 스트림(System.in)을 사용하여 입력을 받음
        // 문자입력스트림 ? Reader 계열
        InputStreamReader isr = new InputStreamReader(is); // 바이트 스트림을 문자 스트림으로 변환
        System.out.print("한글 한자를 입력:");
        try {
            int data;
            while((data=isr.read())!=-1) {
                System.out.print((char) data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
