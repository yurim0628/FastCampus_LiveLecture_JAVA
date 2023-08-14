package kr.fc.java;

import kr.fc.model.Movie;
public class FC13 {
    public static void main(String[] args){
        // 영화 3편을 저장할 배열을 생성하시오.
        Movie[] mv = new Movie[3];
        mv[0] = new Movie("범죄도시", "마동석", "롯데시네마", 18000, 15);
        mv[1] = new Movie("아바타", "홍길동", "삼성시네마", 15000, 12);
        mv[0] = new Movie("친구", "이길동", "엘지시네마", 16000, 19);
        // 정렬: 선택정렬, 퀵정렬, 버블정렬, 힙정렬, ...
        for(int i=0; i<mv.length-1; i++){
            for(int j=i+1; j<mv.length; j++) {
                if(mv[i].getMtitle().compareTo(mv[j].getMtitle())<0) { // mv[i].getMprice()<mv[j].getMprice()
                    Movie temp;
                    temp=mv[i];
                    mv[i]=mv[j];
                    mv[j]=temp;
                }
            }
        }
        // 출력
        for (Movie m : mv){
            System.out.println(m);
        }
    }
}
