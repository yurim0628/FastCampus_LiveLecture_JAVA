/* 10. 실수(float) 데이터를 배열에 저장하고 내림차순 정렬하여 출력하는 동작을 가지고 있는 MyFloatArray 클래스를 설계하시오.
       (단, MyFloatArray에는 기본생성자, add(), size(), get(), descSort() 동작은 반드시 만든다.
       다른 변수는 임의로 만들고 기본생성자에서는 10개의 크기를 갖는 배열을 만들고, 사용자가 크기를 지정하여 배열을 생성 할 수 있도록 한다.) */
public class MyFloatArray {
    private float[] arr; // 실수 데이터를 저장하는 배열
    private int cnt;     // 배열에 추가된 데이터 개수를 추적하는 변수

    public MyFloatArray() {
        this(10); // 기본 생성자에서 초기 크기 10인 배열 생성
    }

    public MyFloatArray(int initialSize) {
        arr = new float[initialSize]; // 초기 크기를 가진 배열 생성
    }

    public void add(float data) {
        arr[cnt++] = data; // 배열에 데이터 추가 및 카운트 증가
    }

    public int size() {
        return this.cnt; // 배열에 추가된 데이터 개수 반환
    }

    public float get(int index) {
        return arr[index]; // 지정된 인덱스의 데이터 반환
    }

    public void descSort() {
        float temp;

        // 내림차순으로 배열 정렬 (버블 소트 알고리즘 활용)
        for (int i = 0; i < cnt - 1; i++) {
            for (int j = i + 1; j < cnt; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        MyFloatArray array = new MyFloatArray(10);
        array.add(27.5f);
        array.add(49.5f);
        array.add(79.2f);
        array.add(63.7f);
        array.add(82.4f);

        array.descSort(); // 내림차순 정렬 메서드 호출

        System.out.println("[출력결과]");
        for(int i=0; i<array.size(); i++){
            System.out.println(array.get(i));
        }
    }
}

