package kr.fc.java;

public class FC07 {
    public static void main(String[] args) {
        // JVM은 프로그램 실행을 시작할 때 클래스를 로딩하고 main 메서드를 호출하면서 프로그램이 실행된다.
        // 이때 main 메서드를 찾기 위해서는 해당 클래스의 객체를 생성하지 않고도 접근할 수 있어야 한다.
        
        // static 메서드는 클래스의 인스턴스 없이 호출할 수 있으며, 클래스 로딩 시점에 메모리에 올라간다.
        // static 메서드는 클래스 레벨에서 동작하며 특정 객체의 소속이 아니라 클래스 자체의 소속이다.
        

        // 3개의 정수를 배열에 초기화 하세요.
        int[] arr = {10, 20, 30}; // 1차원 배열 선언 및 초기화. arr 변수는 정수형 배열을 참조한다.
        // int[] arr = new int[]{10, 20, 30}; // 위와 동일한 방법으로 배열을 선언하고 초기화할 수 있다.

        int v = FC07.add(arr); // arr 배열을 매개변수로 전달하여 static 메서드인 add 메서드를 호출한다.
        // 이때 매개변수 전달은 번지(메모리 주소)를 전달하는 "Call By Reference" 방식을 따른다.

        System.out.println(v); 
    }

    // static 메서드인 add 메서드는 arr 배열을 받아서 배열 요소의 합을 계산하고 결과를 반환한다.
    public static int add(int[] arr) {
        int result = 0; 
        for (int a : arr) {
            result += a; 
        }

        return result; 
    }

}
