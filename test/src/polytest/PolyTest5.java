/* 5. 아래 str변수에 저장된 "1#2#3#4#5" 문자열에서 #을 기준으로 문자열을 분리한 후 모두 더하여 15를 출력하도록 코드를 작성하시오. */

public class PolyTest5 {
    public static void main(String[] args) {
        String str = "1#2#3#4#5";

        int sum = 0;
        String[] sp = str.split("#"); // '#'를 기준으로 문자열을 분리하여 배열에 저장한다.

        // 분리된 문자열을 정수로 변환하여 합을 계산한다.
        for (int i = 0; i < sp.length; i++) {
            sum += Integer.parseInt(sp[i]);
        }

        System.out.println("[출력형식]");

        for (int i = 0; i < sp.length; i++) {
            System.out.print(sp[i]);
            if (i == (sp.length - 1)) {
                break;
            }
            System.out.print("+");
        }

        System.out.println("=" + sum);
    }
}
