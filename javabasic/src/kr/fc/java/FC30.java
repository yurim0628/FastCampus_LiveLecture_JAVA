package kr.fc.java;

import java.io.IOException;
import java.io.InputStream;

public class FC30 {
    public static void main(String[] args) {
        // 표준입출력 방식(파일, 메모리, 네트워크)
        // 키보드로 부터 데이터를 입력받는 것 : 표준입력
        // 빨대 = 스트림(Stream) - 통로역할 : 객체로 취급
        // 문자열 -> String
        // 예외 -> Exception
        // 스트림 -> Stream(X) : InputStream(입력) - read(), OutputStream(출력) - write()

        // System.in을 이용하여 키보드로부터 데이터를 입력받는 InputStream 객체를 생성한다.
        InputStream kin = System.in;

        // 사용자로부터 영문 1자를 입력받는다.
        System.out.print("영문1자를 입력:");

        try {
            int data = kin.read(); // InputStream의 read() 메서드를 사용하여 데이터를 읽는다.
            // read() 메서드는 입력 스트림으로부터 바이트 데이터를 읽어온다.
            // 입력된 데이터의 아스키 코드 값을 반환한다.

            // PrintStream cout = System.out;
            System.out.println(data); // 입력받은 문자의 아스키 코드 값을 출력한다.
        } catch (IOException e) { // IOException은 입출력 동작에서 예외가 발생할 수 있는 경우 처리한다.
            e.printStackTrace(); // 예외 메세지와 스택 트레이스를 출력한다.
        }
    }
}
