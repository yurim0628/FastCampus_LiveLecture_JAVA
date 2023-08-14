package kr.fc.java;

import kr.fc.model.BookVO;
public class FC09 {
    public static void main(String[] args) {
        // 데이터 : 기본자료 -> 객체자료
        // 책 1권을 저장할 [변수를 선언] 하세요.

        BookVO b1; // b1 : 객체변수
        b1 = new BookVO();
        BookVO b2; // b2 : 객체변수
        b2 = new BookVO();
        // 객체와 인스턴스 변수:
        // 자바에서 객체 변수는 클래스의 객체 또는 인스턴스를 참조하는 데 사용된다.
        // 인스턴스 변수는 객체 변수의 한 종류로, 객체의 데이터 멤버나 속성을 나타낸다.
        // 예를 들어, b1과 b2는 객체 변수이며, new BookVO()를 사용하여 BookVO 클래스의 새 인스턴스를 할당하면 인스턴스 변수가 된다.

        // 객체와 인스턴스:
        // 객체와 인스턴스라는 용어는 종종 상호 교환되어 사용되지만, 상황에 따라 약간 다른 의미를 가질 수 있다.
        // 주어진 문맥에서 객체는 메모리에 있는 클래스의 구체적인 인스턴스를 나타낸다. (b1, b2)
        // 인스턴스"는 프로그램 실행 중에 객체의 단일 발생을 낸다.

        // 메모리 사용:
        // 자바에서 객체는 힙 메모리에 저장된다.
        // 힙 메모리는 동적 메모리 할당에 사용되는 메모리 영역이다.
        // 객체는 힙에 생성되고, 객체 변수(b1, b2)는 이러한 객체에 대한 참조를 저장한다.


        // this 키워드:
        // 객체가 생성되면 객체 내부에 this라는 숨겨진 참조가 생성된다.
        // this는 클래스의 현재 인스턴스를 참조하며 해당 인스턴스의 인스턴스 변수와 메소드에 액세스하는 데 사용될 수 있다.

        // 정보 은닉 (캡슐화):
        // title과 price 변수는 private로 선언되었다.
        // 이는 이 변수들이 클래스 내부에서만 접근 가능하고 외부에서는 직접 접근할 수 없음을 의미한다.
        // 이러한 private 변수의 값을 설정하고 검색하기 위해서는 setter와 getter 메소드가 필요하다.
        // setter 메소드는 private 변수의 값을 설정하는 데 사용되고, getter 메소드는 private 변수의 값을 검색하는 데 사용된다.

        b1.setTitle("자바");
        b1.setPrice(10000);

        System.out.println(b1.getPrice());
        System.out.println(b1.getTitle());

        BookVO b3 = new BookVO("C언어", 13000);

        System.out.println(b1); // b1.toString()
    }
}