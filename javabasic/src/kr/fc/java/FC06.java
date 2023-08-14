package kr.fc.java;

public class FC06 {
    public static void main(String[] args) {
        FC06 fc = new FC06(); // FC06 클래스의 인스턴스 생성
        int a = 10; 
        int b = 20; 

        // fc 인스턴스를 사용하여 정적이지 않은 메서드 hap 메서드를 호출하고 a 변수와 b 변수를 인자로 전달.
        // 이 메서드는 a 변수와 b 변수의 합을 계산하고 결과를 v 변수에 할당한다.
        int v = fc.hap(a, b); // 이 메서드 호출은 값 전달 기법(Call by Value)을 따른다.

        System.out.println(v); 
    }

    // hap 메서드는 두 개의 정수 매개변수 a와 b를 받아서 그 합을 계산하고 결과를 반환한다.
    public int hap(int a, int b) {
        int sum = a + b; 
        return sum; 
    }
}
