package kr.fc.java;

import kr.fc.poly3.RemoCon;
import kr.fc.poly3.TV;
import kr.fc.poly3.Radio;

public class FC21 {
    public static void main(String[] args) {
        // TV tv = new TV();
        // 위의 코드는 TV 클래스를 직접 인스턴스화하는 코드이다. 아래에서 리모콘을 사용한 다형성을 보여준다.

        // 리모콘으로 TV 클래스를 동작시켜보세요.

        // 다형성? -> 클래스, 상속, 재정의, Upcasting, 동적바인딩
        // 다형성을 이해하는데 필요한 개념들을 언급하며, 아래에서 TV와 Radio를 동작시키면서 설명한다.

        // TV 클래스를 Upcasting하여 RemoCon 타입의 변수에 할당한다.
        RemoCon tv = new TV();
        tv.chUp();      // TV 채널을 올리는 동작을 수행한다.
        tv.chDown();    // TV 채널을 내리는 동작을 수행한다.
        tv.volUP();     // TV 볼륨을 올리는 동작을 수행한다.
        tv.volDown();   // TV 볼륨을 내리는 동작을 수행한다.

        // Radio 클래스를 Upcasting하여 RemoCon 타입의 변수에 할당한다.
        tv = new Radio();
        tv.chUp();      // 라디오 채널을 올리는 동작을 수행한다.
        tv.chDown();    // 라디오 채널을 내리는 동작을 수행한다.
        tv.volUP();     // 라디오 볼륨을 올리는 동작을 수행한다.
        tv.volDown();   // 라디오 볼륨을 내리는 동작을 수행한다.
    }
}
