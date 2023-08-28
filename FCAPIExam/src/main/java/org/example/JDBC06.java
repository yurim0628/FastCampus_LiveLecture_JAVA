package org.example;

import org.example.model.Book;
import org.example.model.BookDAO;

// DAO(Data Access Object)
public class JDBC06 {
    public static void main(String[] args) {
        // 키보드로부터 책 데이터를 받아서 DB에 저장하시오.
        // 예시 데이터 설정
        // String title = "C언어";
        // String company = "이지스퍼블리싱";
        // String name = "김길동";
        // int price = 2100;

        // 새로운 Book 객체 생성 및 데이터 설정
        Book book = new Book();
        book.setTitle("인공지능");
        book.setCompany("영진출판사");
        book.setName("이길동");
        book.setPrice(31000);

        // DAO : DB 비지니스 로직 처리
        BookDAO dao = new BookDAO();

        // 책 정보 등록 시도
        int cnt = dao.bookRegister(book);

        // 등록 결과에 따른 출력
        if (cnt > 0) {
            System.out.println("저장성공");
        } else {
            System.out.println("저장실패");
        }
    }
}
