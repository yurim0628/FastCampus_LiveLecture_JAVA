/* 3. OX 채점 프로그램을 작성하시오.
      홍길동 학생이 5문항의 Java언어 객관식 시험을 보았다.
      홍길동 학생이 작성한 5문항의 답안이 1,3,2,4,4 라고 할 때 모범답안에 따라 O, X와 득점(SCORE))을 출력하는 프로그램을 작성하시오.
      (단, 홍길동 이름은 자신의 이름으로 하고, 모범답안은 2 3 2 4 1 이라고 가정한다. 한문제당 20점이다.) */

public class PolyTest3 {
    public static void main(String[] args) {
        int[] dab = {2, 3, 2, 4, 1};
        String mydab = "1,3,2,4,4";
        String[] sp = mydab.split(",");
        int[] mydata = new int[sp.length];

        // 학생 답안 배열을 문자열에서 추출하여 저장한다.
        for (int i = 0; i < sp.length; i++) {
            mydata[i] = sp[i].charAt(0) - '0';
        }

        int count = 0;
        String[] OX = new String[dab.length];

        // 정답과 학생 답안을 비교하여 정답 여부를 판단하고 점수를 계산한다.
        for (int i = 0; i < dab.length; i++) {
            if (dab[i] == mydata[i]) {
                OX[i] = "O";
                count += 20; // 정답인 경우 20점씩 증가한다.
            } else {
                OX[i] = "X";
            }
        }

        System.out.println("[전유림 성적]");
        System.out.println("----------------------");

        for (int i = 0; i < dab.length; i++) {
            System.out.print((i + 1) + " ");
        }

        System.out.println("SCORE");
        System.out.println("----------------------");

        for (int i = 0; i < OX.length; i++) {
            System.out.print(OX[i] + " ");
        }

        System.out.println(count);
    }
}
