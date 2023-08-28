package org.example;

import org.example.model.Book;

import java.sql.*;

public class JDBC05 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/fcampus";
        String username = "root";
        String password="root1234!!";
        // num = 1인 책 한권(VO)를 출력하시오.
        String SQL="select * from tblbook where num=1";
        // List<Book> blist = new ArrayList<Book>();
        Book book = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement st = conn.createStatement();
            // cnt = st.executeUpdate(SQL) : insert, update, delete
            ResultSet rs = st.executeQuery(SQL); // select
            if (rs.next()) {
                int num = rs.getInt("num");
                String title = rs.getString("title");
                String company = rs.getString("company");
                String name = rs.getString("name");
                int price =  rs.getInt("price");
                // 묶고(VO) -> 담고(List)
                book = new Book(num, title, company, name, price);
            }
            if (book != null) {
                System.out.println(book);
            } else {
                System.out.println("데이터가 없습니다.");
            }
        }  catch (Exception e) {
            e.printStackTrace();
        }
    }
}
