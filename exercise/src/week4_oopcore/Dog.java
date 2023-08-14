package week4_oopcore;

/* 문제 2. Dog, Cat, Cow와 같은 하위 클래스들은 */
/* makeSound() 메서드를 오버라이딩하여 각각의 동물에 맞는 소리를 제공하지만, */
/* move() 메서드는 Animal 클래스로부터 상속받습니다. */
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("개가 짖습니다: 왈! 왈!");
    }
}
