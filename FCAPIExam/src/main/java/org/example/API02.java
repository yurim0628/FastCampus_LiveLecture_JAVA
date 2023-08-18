package org.example;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.FileReader;

public class API02 {
    public static void main(String[] args) {
        try {
            // "books.json" 파일을 읽기 위한 FileReader 객체 생성
            FileReader reader = new FileReader("books.json");
            // JSON 데이터를 읽어와 저장할 StringBuilder 생성
            StringBuilder jsonString = new StringBuilder();
            int character;
            // 파일을 끝까지 읽어올 때까지 반복하여 문자열에 추가
            while ((character = reader.read()) != -1) {
                jsonString.append((char) character);
            }
            // 리더 객체를 닫아 리소스를 해제
            reader.close();

            // 문자열로 된 JSON 데이터를 JSONObject로 파싱
            JSONObject jsonObject = new JSONObject(jsonString.toString());
            // JSONObject에서 "books" 배열을 가져옴
            JSONArray booksArray = jsonObject.getJSONArray("books");

            // "books" 배열을 순회하면서 각 책 정보를 출력
            for (int i = 0; i < booksArray.length(); i++) {
                JSONObject bookObject = booksArray.getJSONObject(i);
                String title = bookObject.getString("title");
                String company = bookObject.getString("company");
                String name = bookObject.getString("name");
                int price = bookObject.getInt("price");

                // 책 정보 출력
                System.out.println("Title: " + title);
                System.out.println("Company: " + company);
                System.out.println("Name: " + name);
                System.out.println("Price: " + price);
                System.out.println();
            }
        } catch (Exception e) {
            // 예외 발생 시 에러 메시지와 스택 트레이스 출력
            e.printStackTrace();
        }
    }
}
