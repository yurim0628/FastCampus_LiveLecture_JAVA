package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.example.model.Book;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class API03 {
    public static void main(String args[]) {
        // Gson 라이브러리를 사용하여 JSON 데이터를 생성하는 예제
        List<Book> books = new ArrayList<>();
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
            // 묶고(VO) -> 담아(List)
            // Book b = new Book(title, company, name, price);
            books.add(new Book(1, title, company, name, price));
        }
        scan.close();
        // Gson gson = new Gson();
        // Gson 라이브러리를 이용하여 JSON 데이터를 보기 좋게(들여쓰기) 생성한다.
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        String json = gson.toJson(books);
        // 생성된 JSON 데이터를 출력한다.
        System.out.println(json); // [{  }, {  }, {  }]
        try {
            // books1.json 파일에 JSON 데이터를 쓰기 위한 FileWriter 객체를 생성한다.
            FileWriter fw = new FileWriter("books1.json");
            fw.write(json);
            fw.close();
            System.out.println("books1.json 파일 생성");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
