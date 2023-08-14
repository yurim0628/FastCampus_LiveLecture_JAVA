package kr.fc.poly1;

import kr.fc.poly1.Dog;
public class FC23 {
    public static void main(String[] args) {
        Dog d = new Dog(); // Animal(name, age)
        d.setName("멍멍이");
        d.setAge(2);
        System.out.println(d);

        Dog d1 = new Dog("멍멍순", 2);
        System.out.println(d1);
    }
}
