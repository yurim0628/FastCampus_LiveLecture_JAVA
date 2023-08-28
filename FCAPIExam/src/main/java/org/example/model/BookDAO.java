package org.example.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

// DAO(class) : JDBC -> Mapper(interface) : Mybatis -> Repository(interface) : JPA
//                      Connection POOL -> HikariCP
public class BookDAO { // CRUD
    private Connection conn;
    private Statement st; // x
    private PreparedStatement ps; // SQL 문장에 파라메터가 있는 경우에 사용한다.
    private ResultSet rs;

    public void getConnection() {
        String url = "jdbc:mysql://localhost:3306/fcampus";
        String username = "root";
        String password = "root1234!!";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 저장 기능
    public int bookRegister(Book book) {
        int cnt = 0;
        // SQL 문장에 들어있는 ?는 파라메터를 의미한다.
        // 미완성 SQL                                                    // 1 2 3 4 -->
        String SQL = "insert into tblbook(title, company, name, price) values(?,?,?,?)";
        getConnection();
        try {
            // st = conn.createStatement();
            ps = conn.prepareStatement(SQL); // SQL을 미리 컴파일 시켜서 받는다.
            ps.setString(1, book.getTitle());
            ps.setString(2, book.getCompany());
            ps.setString(3, book.getName());
            ps.setInt(4, book.getPrice());
            cnt = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            dbClose();
        }
        return cnt;
    }
    // 전체 리스트를 가져오는 메서드를 정의
    public List<Book> bookList() {
        String SQL = "select * from tblbook";
        getConnection();
        List<Book> blist = new ArrayList<Book>();
        try{
            ps = conn.prepareStatement(SQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                int num = rs.getInt("num");
                String title = rs.getString("title");
                String company = rs.getString("company");
                String name = rs.getString("name");
                int price =  rs.getInt("price");
                // 묶고(VO) -> 담고(List)
                Book book = new Book(num, title, company, name, price);
                blist.add(book);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            dbClose();
        }
        return blist;
    }
    public void dbClose() {
        try {
            if(rs != null) rs.close();
            if(ps != null) ps.close();
            if(conn != null) conn.close();
        } catch (Exception e) {
                e.printStackTrace();
            }
    }
}
