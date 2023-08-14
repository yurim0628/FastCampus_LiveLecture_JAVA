package kr.fc.poly2;

import kr.fc.poly2.Animal;

// Animal 클래스를 상속받고 Pet 인터페이스를 구현한 Cat 클래스 정의
public class Cat extends Animal implements Pet {

    // Animal 클래스에서 상속받은 eat 메서드를 재정의함
    @Override
    public void eat() {
        System.out.println("고양이 처럼 먹다");
    }

    // Cat 클래스에 night 메서드를 정의함
    public void night() {
        System.out.println("밤에 눈에서 빛이난다.");
    }

    // Pet 인터페이스에서 요구하는 play 메서드를 구현함
    @Override
    public void play() {
        System.out.println("집에서 함께 생활한다.");
    }
}
