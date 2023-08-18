package kr.fc.java;

import kr.fc.poly4.B;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class FC37 {
    public static void main(String[] args){
        // 사용자로부터 책 정보를 입력받아 파일에 저장하는 예제

        // BufferedReader를 사용하여 사용자의 키보드 입력을 받는다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("책제목: ");
            String title = br.readLine(); // 사용자로부터 책 제목을 입력받는다.
            System.out.print("출판사: ");
            String company = br.readLine(); // 사용자로부터 출판사를 입력받는다.
            System.out.print("저자: ");
            String name = br.readLine(); // 사용자로부터 저자를 입력받는다.
            System.out.print("가격: ");
            String price = br.readLine(); // 사용자로부터 가격을 입력받는다.

            // 책 정보를 CSV 형식으로 구성한다.
            String data = title + "," + company + "," + name + "," + price;
            // 묶어(VO) --> DAO(CRUD).

            // FileWriter와 BufferedWriter를 사용하여 파일에 책 정보를 저장한다.
            FileWriter fw = new FileWriter("book.txt"); // "book.txt" 파일을 생성 또는 덮어쓴다.
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(data); // 책 정보를 파일에 쓴다.
            bw.close(); // 버퍼를 닫고 내용을 실제로 파일에 쓴다.

            System.out.println("파일생성"); // 파일 생성 완료 메시지를 출력한다.
        } catch (Exception e) {
            e.printStackTrace(); // 예외가 발생하면 스택 트레이스를 출력한다.
        }
    }
}
