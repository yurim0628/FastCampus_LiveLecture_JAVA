package kr.fc.java;

import kr.fc.poly1.Animal;
import kr.fc.poly1.Dog;
import kr.fc.poly1.Cat;

public class FC15 {
    public static void main(String[] args) {
        // 개(Dog), 고양이(Cat) 객체 생성
        Dog d = new Dog();
        Cat c = new Cat();

        // 다형성을 이용하여 printEat() 메서드를 호출
        printEat(d); // 동적 바인딩 발생: Dog 객체의 eat() 메서드가 호출됨
        printEat(c); // 동적 바인딩 발생: Cat 객체의 eat() 메서드가 호출됨
    }

    // Animal 클래스를 상속받은 Dog, Cat 객체를 매개변수로 받아서 eat()를 동작시키는 메서드를 정의
    public static void printEat(Animal ani) { // 다형성 인수 //
        ani.eat(); // 동적 바인딩: Dog, Cat의 eat() 중에서 호출될 메서드가 실행 시점에 결정
        // 컴파일 시점에서는 Animal의 eat()인데
        // 실행시점에서는 자식의 eat()가 실행됨 --> 동적바인딩(재정의)
    }
}
