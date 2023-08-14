package kr.fc.api;

public class MyIntArray {
    // 정수를 여러개 저장하는 변수
    private int[] arr;
    private int cnt; // 2(2개저장)

    public MyIntArray(){
        // arr = new int[10];
        this(10); // MyIntArray(10)
    }
    public MyIntArray(int initalSize){ // new MyIntArray(10);
        arr = new int[initalSize];
    }
    // 정수를 받아서 데이터를 저장하는 동작 : add()
    public void add(int data){
        arr[cnt++] = data; // arr[0]=10, arr[1]=20....
    }
    public int size(){
        return this.cnt;
    }
    public int get(int index){
        return arr[index]; // arr[1], arr[2]
    }
}
