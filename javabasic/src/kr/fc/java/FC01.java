package kr.fc.java;
import kr.fc.model.BookVO;

public class FC01 {
    public static void main(String[] args) {
        // 책 1권을 저장할 변수를 선언하세요.
        BookVO book; // BookVO 클래스 타입의 변수 book을 선언한다.

        book = new BookVO(); // book 변수에 BookVO 클래스의 새로운 인스턴스를 생성하여 저장한다.

        // book 에 [자바의 정석, 35000] 을 저장하세요.
        book.title = "자바의 정석"; // book 객체의 title 멤버 변수에 "자바의 정석"을 저장한다.
        book.price = 35000; // book 객체의 price 멤버 변수에 35000을 저장한다.
    }
}
