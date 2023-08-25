package org.example;
// JDBC Programming
import java.sql.*; // interface(규약) ---> Driver
public class JDBC01 {
    public static void main(String[] args) {
        // 1. JDBC 드라이버 설치(API)
        // 2. 접속 URL, username, password
        String url = "jdbc:mysql://localhost:3306/fcampus";
        String username = "root";
        String password="root1234!!";

        String title = "C언어";
        String company = "이지스퍼블리싱";
        String name = "김길동";
        int price = 2100;

        // 3. 드라이버 로딩(mysql 드라이버 클래스를 메모리에 로딩 : 객체 생성
        // 정적로딩 -> 동적로딩
        // DriverManager driver = com.mysql.cj.jdbc.Driver();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 연결객체를 생성
            Connection con = DriverManager.getConnection(url, username, password);
            // System.out.println("연결성공");
            // 2. SQL 문장 만들기 ( 변수 --> "+변수+" )
            String SQL = "insert into tblbook(title,company,name,price) values('"+title+"','"+company+"','"+name+"','"+price+"')";
            // 3. SQL 문장을 전송할 객체를 생성
            Statement st = con.createStatement();
            int cnt = st.executeUpdate(SQL); // 실행
            if (cnt>0) {
                System.out.println("입력성공");
            } else {
                System.out.println("입력실패");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
