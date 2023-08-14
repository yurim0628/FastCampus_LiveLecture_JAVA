package kr.fc.java;

import kr.fc.model.Movie;

public class FC14 {
    public static void main(String[] args) {
        // 영화 3편을 저장할 배열을 생성하시오.
        Movie[] mv = new Movie[3];
        mv[0] = new Movie("범죄도시", "마동석", "롯데시네마", 18000, 15);
        mv[1] = new Movie("아바타", "홍길동", "삼성시네마", 15000, 12);
        mv[0] = new Movie("친구", "이길동", "엘지시네마", 16000, 19);

        // 검색(search): 순차검색, 블럭검색, 이진검색, ...
        // Q 친구라는 영화의 가격을 출력하시오.
        String mtitle="친구";

        // 순차검색
        /* for(int i=0; i<mv.length; i++) {
            if(mv[i].getMtitle().equals(mtitle)){
                index = i;
            }
        } */

        selectionSort(mv); // 오름차순
        int index = binarySearch(mv, mtitle); // 이진검색

        if(index!=-1) {
            System.out.println(mv[index].getMprice());
        } else {
            System.out.println("검색 실패");
        }
    }

    // 이진검색 메서드
    public static int binarySearch(Movie[] mv, String mtitle){
        int index = -1; // -1(실패)
        int low = 0;
        int high = mv.length-1;
        int middle;
        while (low<=high) {
            middle = (low+high)/2;
            if (mv[middle].getMtitle().compareTo(mtitle)==0) {
                index = middle; // 검색성공
                break;
            } else if(mv[middle].getMtitle().compareTo(mtitle)<0) {
                low = middle + 1; // RIGHT
            } else {
                high = middle - 1; // LEFT
            }
        } // while_end
        return index;
    }

    // 오름차순 정렬 메서드
    public static void selectionSort(Movie[] mv){
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
    }
}