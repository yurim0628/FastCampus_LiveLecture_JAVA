package kr.fc.java;

public class FC03 {
    public static void main(String[] args) {
        // 변수는 데이터를 1개의 형태로 저장을 한다.
        // 정수 3개를 저장할 변수를 선언하세요.
        int[] a = new int[3]; // 정수형 배열 a를 선언하고 크기를 3으로 지정한다.

        total(a); // total 메서드를 호출하고 배열 a를 매개변수로 전달한다.
    }

    // 정수형 배열 array를 받아서 배열 요소의 합을 계산하여 출력하는 total 메서드이다.
    public static void total(int[] array) {
        int sum = 0; 
        for (int i = 0; i < array.length; i++) {
            sum += array[i]; 
        }

        System.out.println(sum); 
    }
}
