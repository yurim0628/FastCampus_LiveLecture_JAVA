package kr.fc.api;

public class MyObjectArray { // 용량체크, 늘리기, 삭제, 클리어 ... -> List(ArrayList), Map, Set ~~~
    // 정수를 여러개 저장하는 변수
    private Object[] arr; // float[], char[], String[]
    private int cnt; // 2(2개저장)

    public MyObjectArray(){
        // arr = new int[10];
        this(10); // MyIntArray(10)
    }
    public MyObjectArray(int initalSize){ // new MyIntArray(10);
        arr = new Object[initalSize];
    }
    // 정수를 받아서 데이터를 저장하는 동작 : add()
    public void add(Object data){
        arr[cnt++] = data; // arr[0]=10, arr[1]=20....
    }
    public int size(){
        return this.cnt;
    }
    public int get(int index){ return arr[index]; } // arr[1], arr[2]
}
