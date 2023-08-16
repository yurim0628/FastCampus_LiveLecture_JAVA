package kr.fc.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class FC35 {
    public static void main(String[] args) {
        // 파일 핸들링 하기
        // 파일에 있는 데이터를 읽기 (이미지 - 카피, 문자) - xml, json(0)
        try {
            // 파일에서 문자 데이터를 읽어 오기 위한 스트림의 연결 (member.txt 파일 읽기)
            // FileReader fr = new FileReader("member.txt");
            BufferedReader br = new BufferedReader(new FileReader("member.txt"));
            String data;
            int cnt = 0;
            // 파일의 끝까지 라인 단위로 읽어오는 반복문
            while ((data = br.readLine()) != null) {
                System.out.print(data);
                cnt++;
            }
            System.out.println(cnt);
            // BufferedReader를 사용하지 않았을 경우에는 한 글자씩 차례대로 읽어옴 : cnt 값이 10이 됨
            // (홍,길,동,A,P,P,L,E,1,0) > 비효율적이다.

            // BufferedReader를 사용했을 경우에는 라인 단위로 읽어옴 : cnt 값이 2가 됨
            // (홍길동, APPLE10)
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
