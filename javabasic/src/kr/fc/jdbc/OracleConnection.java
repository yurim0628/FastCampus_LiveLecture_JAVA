package kr.fc.jdbc;

// Oracle용 JDBC Driver -> 다운로드(API)
public class OracleConnection implements JdbcConnection {
    public void getConnection(String URL, String username, String password) {
        System.out.println("URL,username,password 경로 연결을 시도한다.");
    }
}
