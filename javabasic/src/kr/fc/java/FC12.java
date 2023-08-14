package kr.fc.java;

public class FC12 {
    public static void main(String[] args){
        // 자바에서 문자열처리? "APPLE" (객체로 취급)
        int a=10;
        String s = new String("APPLE"); // 힙 메모리에 생성
        System.out.println(s); // s.toString()
        // String 클래스에서 toString 재정의
        String s1 = "APPLE"; // 문자열 상수 // 리터럴 풀 메모리에 생성
        // 1. 길이
        System.out.println(s.length());
        // 2. 모두 소문자 출력
        System.out.println(s.toLowerCase());
        // 3."PL"이라는 부분 문자열만 출력
        System.out.println(s.substring(2,4));

        String s2="바나나#포도#오렌지#귤";
        String[] sp = s1.split("#");
        for (String ss : sp){
            System.out.println(ss);
        }

        String str1="APPLE";
        String str2="BLUE";
        if(str1.equals(str2)) {
            System.out.println("str1=str2");
        } else {
            System.out.println("str1!=str2");
        }
        // 1. 같냐, 다르냐 // 2. 크다, 작다 : 정렬알고리즘
        int cmp=str1.compareTo(str2);
        // 아스키 코드 값의 차로 같은 문자인지 비교를 한다. ( 1. 음수, 2. 양수, 3. zero )
        if(cmp==0){
            System.out.println("str1==str2");
        } else if(cmp>0) {
            System.out.println("str1>str2");
        } else {
            System.out.println("str<str2"); // APPLE < BLUE
        }
    }
} // XML, JSON, EXCEL, PDF, CVS
// 파일입출력
// 네트워킹
// 네트워킹, Thread
// DB, 모델링, JDBC
