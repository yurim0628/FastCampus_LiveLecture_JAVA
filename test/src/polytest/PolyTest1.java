/* 1. 다음 문자열 변수 s가 선언되었다고 가정하고 이를 거꾸로(반전)하여 출력하는 프로그램을 작성하시오.
      (단, 다른 API를 사용하지 않고 String API 만을 사용한다.) */

public class PolyTest1 {
    public static void main(String[] args) {
        String s = "Hello Java";
        System.out.println("[출력화면]");
        System.out.println("원래문자열: " + s);
        System.out.print("반전문자열: ");

        // 문자열을 역순으로 출력하는 루프
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
    }
}
