package kr.fc.poly2;

import kr.fc.poly2.Animal;

// Animal 클래스를 상속받고 Pet 인터페이스를 구현한 Dog 클래스 정의
public class Dog extends Animal implements Pet {

    // Animal 클래스에서 상속받은 eat 메서드를 재정의함
    @Override
    public void eat(){
        System.out.println("개 처럼 먹다");
    }

    // Pet 인터페이스에서 요구하는 play 메서드를 구현함
    @Override
    public void play() {
        System.out.println("집에서 함께 생활한다.");
    }
}
