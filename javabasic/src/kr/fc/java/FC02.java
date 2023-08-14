package kr.fc.java;
import kr.fc.model.BookVO;

public class FC02 {
    public static void main(String[] args) {
        BookVO book = new BookVO(); // BookVO 클래스 타입의 변수 book을 선언하고 새로운 인스턴스를 생성하여 저장한다.

        book.title = "자바의 정석"; // book 객체의 title 멤버 변수에 "자바의 정석"을 저장한다.
        book.price = 35000; // book 객체의 price 멤버 변수에 35000을 저장한다.

        print(book); // print 메서드를 호출하고 book을 매개변수로 전달한다.
    }

    // BookVO 객체를 받아서 title과 price 정보를 출력하는 print 메서드이다.
    public static void print(BookVO book) {
          System.out.println("title = " + book.title + ", price = " + book.price); // book 객체의 title 멤버 변수와 price 멤버 변수를 사용하여 정보를 출력한다.
    }
}
