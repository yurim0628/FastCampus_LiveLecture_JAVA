package kr.fc.java;

import kr.fc.poly1.Animal;
import kr.fc.poly1.Cat;
import kr.fc.poly1.Dog;

public class FC19 { 
    public static void main(String[] args) { 
        // 2. 다형성 인수

        Dog d = new Dog(); // Dog 객체 생성
        Cat c = new Cat(); // Cat 객체 생성

        // Animal[], Object[]
        // 다형성 인수를 이용하여 display 메서드에 Dog 객체와 Cat 객체를 전달
        display(d); // Dog
        display(c); // Cat
    }

    // display 메서드 선언, Animal 타입의 매개변수를 받음
    // 매개변수가 Animal 타입이므로 다양한 동물 객체를 받을 수 있으며, 다형성이 보장됨
    private static void display(Animal anis) {
        anis.eat(); // 다형성: Animal 클래스의 eat() 메서드가 호출됨 (동적 바인딩, 상속, 재정의, UpCasting)

        // 현재 객체가 Cat 클래스의 인스턴스인지 확인
        // instanceof 연산자를 사용하여 현재 객체가 Cat 클래스의 인스턴스인지 확인
        // 만약 현재 객체가 Cat 클래스의 인스턴스라면 아래 블록이 실행
        if (anis instanceof Cat) {
            // 현재 anis 객체를 Cat 타입으로 명시적으로 형변환하여 night() 메서드를 호출
            ((Cat) anis).night();
        }
    }
}
