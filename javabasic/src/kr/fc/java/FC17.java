package kr.fc.java;

import kr.fc.poly1.Animal;
import kr.fc.poly1.Cat;
import kr.fc.poly1.Dog;

public class FC17 {
    public static void main(String[] args) {
        // 1. 다형성 배열
        // Dog, Cat을 저장할 [배열을 생성] 하세요.
        Animal[] anis = new Animal[2]; // Animal 타입의 배열 anis를 생성하여 Dog와 Cat 객체를 저장할 준비

        anis[0] = new Dog(); // Dog 객체 생성 후 배열 첫 번째 요소에 할당 (eat() 메서드 사용 가능)
        anis[1] = new Cat(); // Cat 객체 생성 후 배열 두 번째 요소에 할당 (eat()와 night() 메서드 사용 가능)

        // for-each 루프를 사용하여 배열의 모든 요소에 접근
        for(Animal ani : anis){
            ani.eat(); // Animal 클래스의 eat() 메서드 호출

            // 현재 객체가 Cat 클래스의 인스턴스인지 확인
            // instanceof 연산자는 왼쪽 피연산자(객체)가 오른쪽 피연산자(클래스)의 인스턴스인지 판별하는 데 사용
            // 만약 현재 객체가 Cat 클래스의 인스턴스라면 아래 블록이 실행
            if (ani instanceof Cat){
                // 현재 ani 객체를 Cat 타입으로 명시적으로 형변환하여 night() 메서드를 호출
                ((Cat) ani).night();
            }
        }
    }
}
