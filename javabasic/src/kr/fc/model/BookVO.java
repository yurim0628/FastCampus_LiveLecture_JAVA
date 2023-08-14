package kr.fc.model;

public class BookVO extends Object{
    // 1. private(정보은닉)
    public String title;
    public int price;
    // 생략된 생성자 메서드:디폴트생성자
    // 2. 디폴트생성자 메서드를 명시적으로 만들것
    public BookVO(){
        // 자신의 모든 멤버들을 메모리에 로딩한다.
    }
    // 생성자메서드의 오버로딩(Overloading)
    public BookVO(String title, int price){
        this.title=title;
        this.price=price;
    }
    // 2. setter, getter method
    public void setTitle(String title){
        this.title=title;
    }
    public String getTitle(){
        return this.title;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public int getPrice(){
        return this.price;
    }
    // 객체가 가지고있는 모든 값의 확인용도(디버깅)
    // 재정의(Override)
    public String toString(){
        return this.title+"\t"+this.price;
    }
    // Object에서는 객체의 번지값을 문자열 형태로 출력하는 기능을 수행
}
