package kr.fc.poly1;

public class Animal {
    // name, age -> 상태정보 (정보은닉)
    private String name;
    private int age;

    public Animal() { }

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // eat() 메서드 정의
    public void eat() {
        System.out.print("?");
        // Animal 클래스에는 특정 동작이 정의되어 있지 않고, 간단히 '?'를 출력하는 기본 eat() 메서드가 정의되어 있음
        // 이 메서드는 Animal 클래스를 상속받는 하위 클래스(Dog, Cat 등)에서 오버라이딩하여 동물들의 특성에 맞게 동작하도록 할 수 있음
        // 오버라이딩은 상속된 메서드를 하위 클래스에서 재정의하는 것으로, 다형성을 구현하는데 중요한 역할을 함
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
