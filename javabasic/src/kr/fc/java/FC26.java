package kr.fc.java;

import kr.fc.api.MyObjectArray;
import kr.fc.poly1.Dog;
import kr.fc.poly1.Cat;

public class FC26 {
    public static void main(String[] args) {
        MyObjectArray objArr = new MyObjectArray(5); // 초기용량: 5
        objArr.add(new Dog()); // Upcasting
        objArr.add(new Cat());

        // 아래 주석은 예시 코드에서 배열의 크기를 초과하여 객체를 추가하려고 할 때의 상황을 설명한다.
        // 초기에 MyObjectArray 객체는 크기 5로 초기화되었고, 이미 2개의 요소(Dog와 Cat)가 추가되었다.
        // 배열의 크기를 초과하여 6번째 객체를 추가하려고 할 때, ArrayIndexOutOfBoundsException 예외가 발생한다.
        // 이는 배열의 인덱스 범위를 벗어난 접근을 시도하기 때문이다.
        // 예외 메시지는 "Index 5 out of bounds for length 5"로, 초기용량은 5이므로 범위를 초과했다는 의미이다.

        for (int i = 0; i < objArr.size(); i++) {
            Object obj = objArr.get(i);
            if (obj instanceof Dog) {
                ((Dog) obj).eat();
            } else {
                ((Cat) obj).eat();
                ((Cat) obj).night();
            }
        }
    }
}
