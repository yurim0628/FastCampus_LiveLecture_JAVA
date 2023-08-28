package org.example;
import java.sql.*;
public class JDBC02 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/fcampus";
        String username = "root";
        String password="root1234!!";
        // DAO(Data Access Object)

        int num = 1;
        String name = "전유림";
        int price = 50000;
        // JDBC -> Mybatis -> ORM(Hibernate) -> JPA(0)
        String SQL = "update tblbook set name = '"+name+"', price="+price+" where num ="+num;
        /* update tblbook
           set name = '전유림', price = 50000
           where num = 1 */

        try {
          Class.forName("com.mysql.cj.jdbc.Driver");
          Connection conn = DriverManager.getConnection(url, username, password);
          // 수정 : num이 1인 책의 저자(전유림)와 가격(50000)을 수정하시오. (SQL)
          Statement st = conn.createStatement();
          int cnt = st.executeUpdate(SQL);
          if (cnt > 0) {
              System.out.println("수정성공:" + cnt);
          } else {
              System.out.println("수정실패");
          }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}