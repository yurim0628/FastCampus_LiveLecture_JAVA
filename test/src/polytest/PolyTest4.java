/* 4. 아래 char[] 배열에 저장된 문자에서 대문자의 합과 소문자의 합을 각각 구하여 출력하는 코드를 작성하시오. */

public class PolyTest4 {
    public static void main(String[] args) {
        char[] arr = {'A', 'b', 'C', 'd', 'E', 'f', 'G', 'h'};

        int upper = 0; // 대문자 합을 저장할 변수
        int lower = 0; // 소문자 합을 저장할 변수

        // 배열을 순회하며 대문자와 소문자의 아스키 코드 값을 더한다.
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'A' && arr[i] <= 'Z') {
                upper += arr[i];
            } else if (arr[i] >= 'a' && arr[i] <= 'z') {
                lower += arr[i];
            }
        }

        // 결과 출력
        System.out.println("[출력화면]");
        System.out.println("대문자 합: " + upper);
        System.out.println("소문자 합: " + lower);
    }
}
