package kr.fc.poly3;

// RemoCon 인터페이스를 구현하는 TV 클래스이다.
public class TV implements RemoCon {
    // RemoCon 인터페이스에 정의된 메서드들을 구현해야 함

    @Override
    public void chUp() { System.out.println("TV의 채널이 올라간다."); }

    @Override
    public void chDown() {
        System.out.println("TV의 채널이 내려간다.");
    }

    @Override
    public void volUP() { System.out.println("TV의 소리가 올라간다."); }

    @Override
    public void volDown() { System.out.println("TV의 소리가 내려간다."); }
}
