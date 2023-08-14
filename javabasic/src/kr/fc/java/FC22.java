package kr.fc.java;

import kr.fc.jdbc.JdbcConnection;
import kr.fc.jdbc.OracleConnection;

public class FC22 {
    public static void main(String[] args) {
        // Oracle DBMS접속
        JdbcConnection oracleConn = new OracleConnection();
        oracleConn.getConnection("URL","system","manager");

        // MySQL DBMS접속
        JdbcConnection mysqlConn = new OracleConnection();
        mysqlConn.getConnection("URL", "root", "12345");
    }
}
