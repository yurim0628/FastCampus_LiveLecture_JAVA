package org.example;

import org.example.model.Book;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileWriter;
import java.util.*;

public class API01 {
    public static void main(String[] args) {
        // Book 객체들을 저장할 리스트를 생성
        List<Book> books = new ArrayList<>();
        // 사용자의 입력을 받기 위한 Scanner 객체를 생성
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("책제목(exit):");
            String input = scan.nextLine();
            if (input.equals("exit")) break;
            String title = input;
            System.out.print("출판사:");
            String company = scan.nextLine();
            System.out.print("저자:");
            String name = scan.nextLine();
            System.out.print("가격:");
            int price = Integer.parseInt(scan.nextLine());
            // Book 객체를 생성하고 리스트에 추가
            books.add(new Book(1, title, company, name, price));
        }
        // Scanner를 닫아 리소스를 해제
        scan.close();
        // 책 정보를 담을 JSONArray를 생성
        JSONArray booksArray = new JSONArray();
        // 책 리스트를 순회하면서 JSON 객체를 생성
        for (Book book : books) {
            JSONObject bookObject = new JSONObject();
            bookObject.put("title", book.getTitle());
            bookObject.put("company", book.getCompany());
            bookObject.put("name", book.getName());
            bookObject.put("price", book.getPrice());
            booksArray.put(bookObject);
        }
        // 책 정보 배열을 담을 루트 JSONObject를 생성
        JSONObject root = new JSONObject();
        root.put("books", booksArray);
        try {
            // JSON 데이터를 "books.json" 파일에 씀
            FileWriter fw = new FileWriter("books.json");
            fw.write(root.toString(4)); // JSON을 4칸 들여쓰기하여 저장
            fw.close();
            System.out.println("books.json 파일생성완료");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
/*
    객체(Object)를 문자열의 형태로 표현하는 방법
     = 책 : VO, DTO - class
     = 책 : text, json, xml
     text : C언어, 영진출판사, 나길동, 30000
     xml : ?
     json : API
 */
