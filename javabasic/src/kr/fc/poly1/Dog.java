package kr.fc.poly1;

// Animal 클래스를 상속받은 Dog 클래스 정의
public class Dog extends Animal {

    // Dog 클래스의 생성자 (기본 생성자)
    public Dog() {
        super(); // new Animal();
        // Animal 클래스의 기본 생성자를 호출 (부모 클래스의 생성자 호출)
        // super 키워드를 사용하여 부모 클래스인 Animal의 기본 생성자를 호출
        // super()를 사용하지 않고 단순히 new Animal()로 생성자를 호출할 수도 있지만,
        // super()를 사용하는 것이 더 명확하고 일반적인 방법
    }

    // 부모의 상태정보에 초기화를 자식이 하고 있다.
    // 객체의 초기화는 자기 자신이 하는 것이 이상적이다.
    public Dog(String name, int age){
       super(name, age); // new Animal(String name, int age);
    }
    // Dog 클래스의 eat() 메서드 정의
    public void eat() {
        System.out.println("개처럼 먹다.");
        // 개에 특화된 eat() 메서드를 정의한다. Animal 클래스에는 eat() 메서드의 구현부가 없으므로,
        // Dog 클래스에서 eat() 메서드를 새로 정의하여 개에 맞게 동작하도록 함
        // 이렇게 메서드를 재정의하는 것을 메서드 오버라이딩(Method Overriding)이라고 함
        // 만약 Dog 클래스가 Animal 클래스에 이미 정의된 eat() 메서드를 그대로 사용하고 싶지 않다면,
        // 메서드 오버라이딩을 통해 자신만의 동작을 정의할 수 있음
    }
}
