package org.example;

import org.example.model.Book;
import org.example.model.BookDAO;

import java.util.List;

public class JDBC08 {
    public static void main(String[] args) {
        // 수정기능
        // 클라이언트로부터 넘어온 데이터(폼 파라메터)
        int num = 5;
        String company = "대림출판사";
        String name = "나길동";
        int price = 42000;
        // 묶어서(VO, DTO) -> DAO
        // 파라메터수집 -> Spring(자동수집)
        Book book = new Book();
        book.setNum(num);
        book.setCompany(company);
        book.setName(name);
        book.setPrice(price);
        BookDAO dao = new BookDAO();
        int cnt = dao.bookUpdate(book);
        if (cnt>0) {
            System.out.println("수정성공");
            List<Book> blist = dao.bookList();
            for (Book vo : blist) {
                    System.out.println(vo);
            }
        } else {
            System.out.println("수정실패");
        }
    }

}
