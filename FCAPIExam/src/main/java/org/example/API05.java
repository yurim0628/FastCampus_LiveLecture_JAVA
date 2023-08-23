package org.example;

import com.google.gson.Gson;
import org.example.model.Book;
import org.example.model.BookList;

import java.io.FileReader;
import java.util.List;

public class API05 {
    public static void main(String args[]) {
        try {
            // "books2.json" 파일을 읽기 위한 FileReader 객체를 생성한다.
            FileReader fr = new FileReader("books2.json");
            // Gson 라이브러리를 이용하여 JSON 데이터를 객체로 변환한다.
            Gson gson = new Gson();
            BookList bookList = gson.fromJson(fr, BookList.class);
            fr.close();
            // 변환된 BookList 객체로부터 Book 리스트를 얻는다.
            List<Book> books = bookList.getBooks();
            // Book 리스트의 각 요소를 순회하며 정보를 출력한다.
            for (Book book : books) {
                System.out.println(book);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
