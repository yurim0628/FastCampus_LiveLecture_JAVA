/* 2. 그리고 두 개의 비관련 클래스인 Guitar과 Flute가 Instrument 인터페이스를 구현하고,
      각자의 구체적인 playSound() 메서드 구현을 제공합니다. */
public class Guitar implements Instrument {
    @Override
    public void playSound() {
        System.out.println("기타 소리 연주 중!");
    }
}
