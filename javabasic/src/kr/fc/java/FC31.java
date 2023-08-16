package kr.fc.java;

import java.io.IOException;
import java.io.InputStream;

public class FC31 {
    public static void main(String[] args) throws IOException {
        // 키보드로부터 영문여러자를 입력해서 출력하시오.
        InputStream is = System.in;
        System.out.print("영문 여러자를 입력:");
        try {
            int data;
            while ((data=is.read())!=-1) {
                // int data = is.read();
                // if(data == -1) break;  // 입력 스트림의 끝을 만나면 반복문을 종료한다.
                System.out.print((char)data); // 읽어온 문자를 출력한다. (ASCII 값으로 65는 'A')
                // data = is.read(); // 다음 데이터(엔터 문자)를 읽어온다.
                // System.out.print((char)data); // 읽어온 엔터 문자를 출력한다. ((ASCII 값으로 10은 'Enter')
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
