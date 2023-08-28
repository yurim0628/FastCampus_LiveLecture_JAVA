package org.example;

import org.example.model.Book;
import org.example.model.BookDAO;

import java.util.List;

public class JDBC07 {
    public static void main(String[] args) {
        // BookDAO 인스턴스 생성
        BookDAO dao = new BookDAO();
        // 모든 책 정보를 가져와서 리스트에 저장
        List<Book> blist = dao.bookList();
        // 가져온 책 정보가 존재하는지 확인하고 출력
        if (blist.size() != 0) {
            // 책 목록 출력
            for (Book book : blist) {
                System.out.println(book);
            }
        } else {
            System.out.println("데이터가 없습니다.");
        }
    }
}
