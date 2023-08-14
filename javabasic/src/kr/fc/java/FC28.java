package kr.fc.java;

import java.util.List;
import java.util.ArrayList;

import kr.fc.model.BookVO;

public class FC28 {
    public static void main(String[] args) {
        // ArrayList를 이용해서 책 3권을 저장하고 출력하세요.
        List<BookVO> list = new ArrayList<BookVO>(); // BookVO[]
        // <> (다이아몬드 연산자)는 제네릭 타입을 표시하는데 사용된다.
        // 제네릭 타입은 컬렉션(자료구조) 클래스에서 사용되며, 타입 안정성을 제공한다.
        // 이는 컴파일러에게 컬렉션 내부에서 사용되는 객체의 타입을 컴파일 시점에 검사하도록 알려주는 역할을 한다.

        // 위 코드에서는 ArrayList의 제네릭 타입으로 BookVO 클래스를 사용하고 있다.
        // 즉, ArrayList가 BookVO 객체만을 저장하도록 타입을 제한하고 있다.
        // 이렇게 하면 ArrayList에서 객체를 꺼내올 때 별도의 형 변환(casting)을 할 필요가 없다.

        // 또한 제네릭을 사용하면 컴파일러가 타입 안정성을 검사해줌으로써 프로그램의 안정성을 높여준다.
        // 예를 들어, 다른 타입의 객체를 추가하려고 하면 컴파일 시에 오류가 발생하여 미리 방지할 수 있다.
        list.add(new BookVO("자바",30000));
        list.add(new BookVO("C",20000));
        list.add(new BookVO("오라클",40000));

        // list.add(new Dog());
        // list.remove(1);
        // list.add(2, new BookVO("Python",41000));

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
// 키보드로 부터 데이터를 입력받는 방법 : I/O - Scanner API
// 파일, 네트워킹 -> 입출력하는 방법: Stream(스트림) - 크롤링(?), Open API
