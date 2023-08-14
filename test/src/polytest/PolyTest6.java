/* 6. 다음과 같이 String으로 선언된 s에는 1부터 5까지의 숫자 15개가 ‘,’를 기준으로 초기화되어 있다.
      각 숫자의 개수를 세어 별 모양으로 출력하는 프로그램을 작성하시오.
      (String 클래스 API를 사용한다.) */
public class PolyTest6 {
    public static void main(String[] args) {
        String s = "3,2,5,4,4,1,5,5,4,1,2,4,5,5,1";

        // 입력 문자열을 ','를 기준으로 분리하여 배열에 저장한다.
        String[] sp = s.split(",");
        int[] data = new int[sp.length];

        // 분리된 문자열을 정수 배열로 변환한다.
        for (int i = 0; i < sp.length; i++) {
            data[i] = sp[i].charAt(0) - '0';
        }

        int[] count = new int[5];

        // 각 숫자의 개수를 카운트한다.
        for (int i = 0; i < data.length; i++) {
            count[data[i] - 1]++;
        }

        System.out.println("[출력형식]");

        for (int i = 0; i < count.length; i++) {
            System.out.print((i + 1) + "(" + count[i] + "개):");

            for (int j = 0; j < count[i]; j++) {
                System.out.print("★");
            }

            System.out.println();
        }
    }
}
