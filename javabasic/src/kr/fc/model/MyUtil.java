package kr.fc.model;

public class MyUtil {
    //1~10까지 총합을 구하여 출력하시오
    private MyUtil() {

    }
    public static int hap(){
        int sum = 0;
        for(int i=1; i<=10; i++){
            sum +=i;
        }
        return sum;
    }
    public static int hap(int a, int b){
        int sum = 0;
        for(int i=a; i<=b; i++){
            sum +=i;
        }
        return sum;
    }

}
