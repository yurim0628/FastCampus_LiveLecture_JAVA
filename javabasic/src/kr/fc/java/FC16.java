package kr.fc.java;

import kr.fc.poly1.Animal;
import kr.fc.poly1.Dog;
import kr.fc.poly1.Cat;

public class FC16 {
    public static void main(String[] args) {
        // Dog 객체를 생성하는 방법 3가지

        // 1. 직접 접근: Dog 클래스의 생성자를 호출하여 Dog 객체를 직접 생성
        Dog d1 = new Dog();

        // 2. 간접 접근 (Upcasting): Dog 클래스를 상속받은 Animal 타입으로 선언하고 Dog 객체를 생성
        // 이렇게 상위 클래스 타입으로 하위 클래스의 객체를 참조하는 것을 업캐스팅(Upcasting)이라고 함
        // 업캐스팅은 자식 클래스의 객체를 부모 클래스의 타입으로 참조할 수 있는데, 이를 통해 다형성을 구현함
        // Animal 클래스에 정의된 멤버들만 사용 가능하며, Dog 클래스에 추가로 정의된 멤버는 사용할 수 없음
        Animal d2 = new Dog();
        d2.eat(); // 개
        d2 = new Cat();
        d2.eat(); // 고양이
        // 다형성: 상위클래스가 동일한 메세지로 하위 클래스를 서로 다르게 동작시키는 객체지향 원리
        // Cat c = (Cat)d2; // Downcasting
        ((Cat)d2).night();
        // 3. Object 타입으로 참조: Object 클래스는 모든 클래스의 최상위 클래스이므로 모든 객체를 참조할 수 있음
        // Object 타입으로 선언된 변수에는 어떤 클래스의 객체도 참조할 수 있음
        // 이렇게 Object 타입으로 하위 클래스의 객체를 참조하는 것은 모든 클래스의 공통적인 멤버들만 사용 가능
        // Object 클래스에는 기본적인 멤버들만 정의되어 있으므로, Dog 클래스나 Animal 클래스에 추가로 정의된 멤버는 사용할 수 없음
        Object d3 = new Dog();
    }
}
