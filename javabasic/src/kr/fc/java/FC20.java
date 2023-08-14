package kr.fc.java;

import kr.fc.poly2.*;

public class FC20 {
    public static void main(String[] args) {
        // Animal ani = new Animal();
        
        // Animal 타입의 참조 변수 ani를 선언하고, new 연산자를 사용하여 Dog 객체를 생성하여 할당
        // 다형성에 의해 Animal 참조 변수로 Dog 객체를 가리킬 수 있음
        Animal ani = new Dog();

        ani.eat(); // 다형성이 보장. Dog 객체의 eat() 메서드가 호출
        ani.move(); // 다형성이 보장. Animal 클래스의 move() 메서드가 호출

        // ani 변수에 새로운 객체를 할당하여 Cat 객체를 가리킴
        ani = new Cat();

        ani.eat(); // 다형성이 보장. Cat 객체의 eat() 메서드가 호출
        ani.move(); // 다형성이 보장. Animal 클래스의 move() 메서드가 호출

        // ani 변수는 Cat 객체를 가리키고 있으므로 Cat 타입으로 DownCasting 후 night() 메서드를 호출
        ((Cat)ani).night();
    }
}
