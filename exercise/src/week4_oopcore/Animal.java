package week4_oopcore;

/* 문제 1. Animal 클래스에는 모든 동물들에게 공통적인 move() 메서드를 제공합니다. */
/* 동물에 맞는 소리를 제공하기 위해서 makeSound() 메서드를 제공합니다. */
abstract class Animal {
    public void move() {
        System.out.println("동물이 움직입니다.");
    }

    public abstract void makeSound();
}
