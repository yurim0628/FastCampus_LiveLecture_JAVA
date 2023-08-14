public class InstrumentTest {
    public static void main(String[] args) {
        Instrument guitar = new Guitar();
        Instrument flute = new Flute();
        Instrument piano = new Piano();

        playInstrument(guitar);
        playInstrument(flute);
        playInstrument(piano);
    }
    /* 3. 이제 Guitar과 Flute 클래스는 공통된 인터페이스를 가지므로,
          Instrument 객체를 통해 playSound() 메서드를 호출하면,
          각 클래스에 맞는 구현이 호출되며 다음과 같은 출력을 보여줍니다. */
    public static void playInstrument(Instrument instrument) {
        instrument.playSound();
        // 기타 소리 연주 중!
        // 플루트로 멜로디를 연주 중!
        // 피아노 연주 중!

    }
}
