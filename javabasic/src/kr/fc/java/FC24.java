package kr.fc.java;

public class FC24 {
    public static void main(String[] args){
        // 배열처럼 동작하는 API 설계를 해보세요.
        // 정수형 [배열]에 3개의 정수를 저장하고 크기와 요소를 출력하세요.
        // 1. 배열을 생성하는 동작 : 생성자
        int[] a = new int[3];
        // 2. 배열에 데이터를 저장하는 동작 : add()
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        // 3. 배열의 크기를 얻어오는 동작 : size()
        int length = a.length;
        // 4. 배열의 원소의 데이터를 가져오는 동작 : get()
        int data = a[1];

        System.out.println(data); // 20
    }
}
