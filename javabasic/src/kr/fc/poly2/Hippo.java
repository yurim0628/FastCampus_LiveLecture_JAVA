package kr.fc.poly2;

// Animal 클래스를 상속받은 Hippo 클래스 정의
public class Hippo extends Animal {

    // Animal 클래스에서 상속받은 eat 메서드를 재정의함
    @Override
    public void eat() {
        System.out.println("하마 처럼 먹다.");
    }
}
