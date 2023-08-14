package kr.fc.java;

import kr.fc.poly4.A;
import kr.fc.poly4.B;
public class FC23 {
    public static void main(String[] args) {
        // A객체를 생성하는데 Upcasting으로 생성하세요.
        // A a = new A();
        // Object Casting(객체형변환) : Upcasting, Downcasting
        // int <----> float : 형변환 : (int)
        Object a = new A(); // Upcasting -> 자동
        ((A) a).display(); // Downcasting

        Object b = new B(); // Upcasting -> 자동
        ((B) b).display(); // Downcasting

        A a1 = new A();
        B b1 = new B();
        ptr(a1);
        ptr(b1);

        Object[] obj = new Object[2]; // 다형성 배열 // 모든 객체를 저장할 수 있다.
        obj[0] = new A();
        obj[1] = new B();
    }
    public static void ptr(Object obj){ // 다형성 인수
        if (obj instanceof A){
            ((A) obj).display();
        }
        if (obj instanceof B){
            ((B) obj).display();
        }
    }
}
