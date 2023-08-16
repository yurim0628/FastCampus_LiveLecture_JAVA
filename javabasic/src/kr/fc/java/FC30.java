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

/*
int -> byte[] (4byte를 쪼개서 바이트배열에)
byte[] -> int

스트림(빨대)의 분류: java.io

1. 데이터(이진데이터, 문자)의 종류에 따른 분류

1) 바이트스트림 : 이진데이터(바이너리데이터)를 처리하는 스트림
- 바이트입력스트림 : InputStream - read() : 바이트단위로 읽기
- 바이트출력스트림 : OutputStream - writer() : 바이트단위로 쓰기(출력)
  ex) 파일에서 바이트데이터를 읽으려면 어떤 스트림이 필요한가? FileInputStream
  ex) 파일에서 바이트데이터를 저장하려면 어떤 스트림이 필요한가? FileOutputStream
2) 문자스트림: 문자데이터를 처리하는 스트림(스트림 내부에서 문자 인코딩이 적용된다)
- 문자입력스트림 : Reader - read() : 문자단위로 읽기
- 문자출력스트림 : Writer - write(), print(), println() : 문자단위로 쓰기
  ex) 파일에서 문자데이터를 읽으려면 어떤 스트림이 필요한가? FileReader
  ex) 파일에서 문자데이터를 저장하려면 어떤 스트림이 필요한가? FileWriter

2. 처리방식에 따른 분류

1) 노드스트림 : 입출력데이터에 가장 먼저 연결되는 스트림
2) 필터스트림 : 단독사용불가 -> 반드시 노드스트림에 연결(연쇄)해서 사용 => (생성자)
   : 입출력의 성능을 개선시키는 용도
   : 버퍼기능이 있는 스트림
     - BufferedFileInputStream, BufferedFileOutputnputStream
     - BufferedFileReader, BufferedFileWriter
   - 브릿지 스트림 :
     바이트입력스트림을 문자입력스트림으로 변환 : InputStreamReader
     바이트출력스트림을 문자출력스트림으로 변환 : OutputStreamWriter
 */
