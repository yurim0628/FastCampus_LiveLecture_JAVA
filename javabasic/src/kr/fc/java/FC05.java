package kr.fc.java;
import kr.fc.model.BookVO;

public class FC05 {
    public static void main(String[] args) {
        // 책 3권을 저장할 배열을 선언하세요.
        BookVO[] books = new BookVO[3]; // BookVO 클래스 타입의 배열 'books'를 선언하고 크기를 3으로 지정한다.

        // 책 3권을 저장할 객체 배열을 생성하세요.
        // books 배열의 각 요소에 BookVO 클래스의 인스턴스를 생성하여 저장한다.
        books[0] = new BookVO(); // 첫 번째 책 인스턴스를 생성하고 books 배열의 0번 인덱스에 저장한다.
        books[0].title = "자바의 정석"; // 첫 번째 책의 제목을 "자바의 정석"으로 설정한다.
        books[0].price = 35000; // 첫 번째 책의 가격을 35000으로 설정한다.

        books[1] = new BookVO(); // 두 번째 책 인스턴스를 생성하고 books 배열의 1번 인덱스에 저장한다.
        books[1].title = "Effective Java"; // 두 번째 책의 제목을 "Effective Java"로 설정한다.
        books[1].price = 25000; // 두 번째 책의 가격을 25000으로 설정한다.

        books[2] = new BookVO(); // 세 번째 책 인스턴스를 생성하고 books 배열의 2번 인덱스에 저장한다.
        books[2].title = "Clean Code"; // 세 번째 책의 제목을 "Clean Code"로 설정한다.
        books[2].price = 30000; // 세 번째 책의 가격을 30000으로 설정한다.
    }
}
