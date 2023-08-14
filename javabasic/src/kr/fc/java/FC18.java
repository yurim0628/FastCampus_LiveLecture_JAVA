package kr.fc.java;

import kr.fc.poly1.Cat;
import kr.fc.poly1.Dog;

public class FC18 {
    public static void main(String[] args) {
        // Dog, Cat -> Object[] : Object -> DownCasting

        Object[] objs = new Object[2]; // Object 타입의 배열 objs를 생성하여 Dog와 Cat 객체를 저장할 준비
        objs[0] = new Dog(); // Dog 객체 생성 후 배열 첫 번째 요소에 할당 (UpCasting)
        objs[1] = new Cat(); // Cat 객체 생성 후 배열 두 번째 요소에 할당 (UpCasting)

        // for 루프를 사용하여 배열의 모든 요소에 접근
        for(int i=0; i<objs.length; i++) {
            if(objs[i] instanceof Dog) { // 현재 객체가 Dog 클래스의 인스턴스인지 확인
                // 현재 객체를 Dog 타입으로 DownCasting하여 eat() 메서드 호출
                ((Dog)objs[i]).eat();
            } else if (objs[i] instanceof Cat) { // 현재 객체가 Cat 클래스의 인스턴스인지 확인
                // 현재 객체를 Cat 타입으로 DownCasting하여 eat()와 night() 메서드 호출
                ((Cat)objs[i]).eat();
                ((Cat)objs[i]).night();
            }
        }
    }
}
