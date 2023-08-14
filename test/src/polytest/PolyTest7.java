/* 8. Book클래스를 이용하여 아래 예시된 책 3권을 Book[ ] 객체배열 에 저장 한 후 책제목을 기준으로 오름차순 정렬하여 출력하는 프로그램을 작성하시오.
      (단, 출력결과를 참고하고 toString()으로 출력하여도 된다.) */

public class PolyTest7 {
    public static void main(String[] args) {
        Book[] b = new Book[3];
        b[0] = new Book("자바", "한빛미디어", "홍길동", 30000);
        b[1] = new Book("JSP", "영진출판사", "이길동", 35000);
        b[2] = new Book("C언어", "제이펍", "조길동", 20000);

        Book temp;

        // 선택 정렬을 활용하여 Book 객체 배열을 정렬한다.
        for (int i = 0; i < b.length - 1; i++) {
            for (int j = i + 1; j < b.length; j++) {
                if (b[i].getTitle().compareTo(b[j].getTitle()) > 0) {
                    // 두 Book 객체를 비교하여 정렬한다.
                    temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                }
            }
        }

        System.out.println("[출력결과]");

        for (Book book : b) {
            System.out.println(book);
        }
    }
}
