package kr.fc.java;
import kr.fc.model.BookVO;

public class FC10 {
    public static void main(String[] args){
        // 책 3 권을 저장할 배열을 생성하세요.
        // 객체배열
        BookVO[] books=new BookVO[3];
        books[0]=new BookVO("자바",20000);
        books[1]=new BookVO("자바",20000);
        books[2]=new BookVO("자바",20000);
        // 문자열을 오름차순으로 정렬
        for(BookVO vo : books){
            System.out.println(vo);
        }
    }
}
