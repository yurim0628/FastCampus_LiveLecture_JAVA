package week4_oopcore;

/* 문제 3. 하위 클래스들의 인스턴스를 생성하고 makeSound()와 move() 메서드를 호출하면, 다음과 같은 출력이 나타납니다. */
public class AnimalTest {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound(); // 개가 짖습니다: 왈! 왈!
        dog.move(); // 동물이 움직입니다.

        Animal cat = new Cat();
        cat.makeSound(); // 고양이가 야옹합니다: 야옹! 야옹!
        cat.move(); // 동물이 움직입니다.

        Animal cow = new Cow();
        cow.makeSound(); // 소가 음메를 합니다: 음메! 음메!
        cow.move(); // 동물이 움직입니다.
    }
}
