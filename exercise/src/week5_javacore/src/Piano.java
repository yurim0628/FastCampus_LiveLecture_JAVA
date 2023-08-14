/* 4. 위에서 설계된 클래스에 Piano 클래스를 추가하고 동작시키시오.
      Piano 클래스를 추가하였으며, 이 클래스는 Instrument 인터페이스를 구현합니다.
      Piano 클래스는 playSound() 메서드에 대한 자체적인 구현을 제공하며, 콘솔에 "피아노 연주 중!"을 출력합니다. */
class Piano implements Instrument {
    @Override
    public void playSound() {
        System.out.println("피아노 연주 중!");
    }
}
