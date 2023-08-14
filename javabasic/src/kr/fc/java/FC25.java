package kr.fc.java;

import kr.fc.api.MyIntArray;
public class FC25 { // MyIntArray API를 활용하여 정수형 배열에 정수를 저장하고 출력한다.
    public static void main(String[] args) {
        // 정수형 [배열]에 3개의 정수를 저장하고 크기와 요소를 출력하세요.
        MyIntArray arr=new MyIntArray(5);
        arr.add(10);
        arr.add(20);
        arr.add(30);

        int size = arr.size();
        System.out.println("배열의 크기: " + size); // 3

        for(int i=0; i<arr.size(); i++){
            System.out.println(arr.get(i)); // 10, 20, 30
        }
    }
}
