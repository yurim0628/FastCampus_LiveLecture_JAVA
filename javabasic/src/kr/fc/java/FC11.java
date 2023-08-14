package kr.fc.java;
import kr.fc.model.MyUtil;

public class FC11 {
    public static void main(String[] args){
        // 1~10 까지의 총합을 구하여 출력하시오.
        // MyUtil my=new MyUtil();
        // int sum=my.hap();
        // System.out.println("sum= " + + sum)
        int sum = MyUtil.hap();
        System.out.println("sum=" + sum);

        int sum1 = MyUtil.hap(10,300);
        System.out.println("sum1 = " + sum1);

        // private 생성자로 된 API
        // System sys = new System();
        // Math math = new Math();
        int max=Math.max(20,10);
        System.out.println("max =" +max);
    }
}
