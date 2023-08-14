package kr.fc.poly1;

public class Cat extends Animal {

    // 고양이에 특화된 night() 메서드 정의
    public void night() {
        System.out.println("밤에 눈에서 빛이난다.");
    }

    // Animal 클래스의 eat() 메서드를 오버라이딩
    public void eat() {
        System.out.println("고양이 처럼 먹다.");
        // Animal 클래스에 정의된 eat() 메서드를 오버라이딩하여 고양이에 맞는 동작으로 변경함
        // 이렇게 하위 클래스에서 상위 클래스의 메서드를 재정의하여 다른 동작을 구현하는 것을 오버라이딩이라고 함
        // 이제 Cat 클래스의 인스턴스에서 eat() 메서드를 호출하면, "고양이 처럼 먹다."라는 메시지가 출력됨
    }
}