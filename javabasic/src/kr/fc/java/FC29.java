package kr.fc.java;

import kr.fc.model.BookVO;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class FC29 {
    public static void main(String[] args) {
        // 키보드로 부터 데이터를 입력
        // 키보드(외부장치) : System.in / 모니터 장치(콘솔) : System.out
        // Scanner scan = new Scanner(); // default 생성자가 존재하지 않는다.
        Scanner scan = new Scanner(System.in);
        List<BookVO> list = new ArrayList<BookVO>();

        while(true) {
            System.out.print("종료(exit):");
            String isEnd = scan.nextLine();
            if (isEnd.equals("exit")) break;

            System.out.print("책제목:");
            String title = scan.nextLine();
            System.out.print("책가격:");
            int price = Integer.parseInt(scan.nextLine()); // "30000" --- Integer.parseInt("30000") ---> 30000

            // title, price를 하나의 구조로 묶어주는 것
            BookVO vo = new BookVO(title, price);
            list.add(vo);
        }

        bookPrint(list);

    }
    public static void bookPrint(List<BookVO> list){
        for(BookVO vo : list) {
            System.out.println(vo);
        }
    }
}
