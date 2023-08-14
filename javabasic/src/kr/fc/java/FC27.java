package kr.fc.java;

import java.util.List;
import java.util.ArrayList;

import kr.fc.poly1.Dog;
import kr.fc.poly1.Cat;

public class FC27 {
    public static void main(String[] args) {
        // 1. 내가 직접 만든 API = MyObjectArray
        // 내가 직접 만든 MyObjectArray 클래스를 사용하여 객체를 저장하고 관리할 수 있다.

        // 2. java에서 제공해주는 API = ArrayList
        // ArrayList 클래스는 자바에서 기본적으로 제공하는 동적 배열 자료구조이다.
        List list = new ArrayList(1); // 초기 용량(capacity)을 1로 설정한다. 동적으로 크기가 조절된다.

        // Dog와 Cat 객체를 ArrayList에 추가한다. ArrayList는 크기에 제한이 없다.
        list.add(new Dog()); // UpCasting: Dog 객체를 Object 타입으로 추가한다.
        list.add(new Cat()); // UpCasting: Cat 객체를 Object 타입으로 추가한다.

        // ArrayList에서 객체를 가져와 DownCasting하여 eat() 메서드를 호출한다.
        Dog d = (Dog) list.get(0);
        d.eat();

        // ArrayList에서 객체를 가져와 DownCasting하여 eat()와 night() 메서드를 호출한다.
        Cat c = (Cat) list.get(1);
        c.eat();
        c.night();

        // ArrayList에 저장된 객체들을 반복하여 처리한다.
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            if (obj instanceof Dog) {
                ((Dog) obj).eat();
            } else {
                ((Cat) obj).eat();
                ((Cat) obj).night();
            }
        }

        // 3. 다른 회사가 제공해주는 API
        // 다른 회사나 개인이 만든 라이브러리(API)를 사용하여 기능을 확장할 수 있다.

        // 배열의 단점:
        //  - 크기가 고정적이어서 미리 크기를 정해야 한다. 크기를 초과하면 새로운 배열을 만들어 복사해야 한다.
        //  - 요소를 추가하거나 삭제할 때 임시적으로 다른 배열을 만들어야 하므로 성능에 영향을 줄 수 있다.
        //  - 배열의 중간에 요소를 삽입하거나 삭제하려면 다른 요소들을 이동시켜야 하는 비용이 발생한다.
        //  - 객체의 참조만을 저장하기 때문에 다양한 타입을 함께 저장하는 것이 어렵다.
        //  - 객체를 참조하기 위해 인덱스를 사용하므로 요소를 찾는 데에 O(1)이 아닌 O(n)의 시간이 소요될 수 있다.
    }
}
