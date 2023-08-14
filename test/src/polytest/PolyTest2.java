/* 2. 다음 문자열 변수 str을 4개의 문자열로 분리하여 오름차순 정렬하여 출력하는 프로그램을 작성하시오.
      (단, 다른 API를 사용하지 않고 String API 만을 사용한다.) */

public class PolyTest2 {
    public static void main(String[] args) {
        String str = "once upon a time";

        // 공백을 기준으로 문자열을 분리하여 배열에 저장한다.
        String[] sp = str.split(" ");
        String temp;

        // 선택 정렬을 활용하여 분리된 문자열을 정렬한다.
        for (int i = 0; i < sp.length - 1; i++) {
            for (int j = i + 1; j < sp.length; j++) {
                if (sp[i].compareTo(sp[j]) > 0) {
                    // 두 문자열을 비교하여 정렬한다.
                    temp = sp[i];
                    sp[i] = sp[j];
                    sp[j] = temp;
                }
            }
        }

        System.out.println("[출력화면]");
        System.out.println("원래문자열: " + str);
        System.out.print("정렬된 문자열: ");

        for (int i = 0; i < sp.length; i++) {
            System.out.print(sp[i] + " ");
        }
    }
}
