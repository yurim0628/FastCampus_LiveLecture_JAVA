package kr.fc.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FC34 {
    public static void main(String[] args) {
        // 키보드로부터 문자열을 계속 입력 받다가 "exit"를 입력하면 종료하는 프로그램

        // 키보드로부터 라인 단위로 문자열을 입력받기 위한 BufferedReader 스트림 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        System.out.print("문자열을 입력하세요: ");
        try {
            // 사용자가 "exit"를 입력할 때까지 반복
            while ((line = br.readLine()) != null) { // 입력 스트림이 열려있는 동안 반복
                if (line.equals("exit")) // 입력된 문자열이 "exit"인 경우
                    break; // 반복문 종료
                System.out.println(line); // 입력된 문자열 출력
                System.out.print("문자열을 입력하세요: "); // 다음 입력 대기
            }
            br.close(); // 입력 스트림 닫기
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
