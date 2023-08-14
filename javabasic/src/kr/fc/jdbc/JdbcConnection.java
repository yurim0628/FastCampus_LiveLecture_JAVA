package kr.fc.jdbc;

public interface JdbcConnection {
    public void getConnection(String URL, String usernme, String password); // 데이터베이스 연결 동작
}
