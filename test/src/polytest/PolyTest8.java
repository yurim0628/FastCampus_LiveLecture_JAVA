/* 9. 책제목을 기준으로 오름차순 정렬되어 있을 때 자바 책을 이진검색 알 고리즘을 이용하여 검색하여 출력하는 프로그램을 작성하시오.
      (출력결과를 참고하시오, toString()으로 출력하여도 된다.) */

public class PolyTest8 {
    public static void main(String[] args) {
        Book[] b = new Book[3];
        b[0] = new Book("자바", "한빛미디어", "홍길동", 30000);
        b[1] = new Book("JSP", "영진출판사", "이길동", 35000);
        b[2] = new Book("C언어", "제이펍", "조길동", 20000);

        Book temp;

        for (int i = 0; i < b.length - 1; i++) {
            for (int j = i + 1; j < b.length; j++) {
                if (b[i].getTitle().compareTo(b[j].getTitle()) > 0) {
                    temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                }
            }
        }

        String search = "자바";
        int high = b.length - 1;
        int low = 0;
        int middle;
        int index = -1;

        // 이진 탐색을 활용하여 검색한다.
        while (low <= high) {
            middle = (low + high) / 2;

            if (b[middle].getTitle().equals(search)) {
                index = middle;
                break;
            } else if (b[middle].getTitle().compareTo(search) < 0) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }

        if (index != -1) {
            System.out.println("[" + search + " 책 정보]");
            System.out.println(b[index]);
        } else {
            System.out.println("검색실패");
        }
    }
}

