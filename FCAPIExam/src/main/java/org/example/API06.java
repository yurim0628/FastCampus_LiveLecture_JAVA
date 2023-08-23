package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class API06 {
    public static void main(String[] args) {
        // 특정 서버에 있는 자원(리소스)을 네트워킹을 이용해서 획득하기(크롤링)
        String url = "https://sum.su.or.kr:8888/bible/today";
        // 요청(request) ----> 응답(response)
        // Jsoup API (Connection+Parsing)
        try{
            // Jsoup 라이브러리를 사용하여 웹 페이지에서 데이터를 추출하는 예제

            // 지정한 URL로 연결하여 HTML 문서를 가져온다.
            Document document = Jsoup.connect(url).get();
            System.out.println(document.toString());

            // 웹 페이지에서 선택한 요소들을 추출한다.
            // "div.dailybible_info" 요소 추출
            Element dailybible_info = document.selectFirst("div.dailybible_info");
            // "div.bible_text" 요소 추출
            Element bible_text = document.selectFirst("div.bible_text");
            // "div.bibleinfo_box" 요소 추출
            Element bibleinfo_box = document.selectFirst("div.bibleinfo_box");
            // 추출한 요소들의 텍스트 내용을 출력한다.
            System.out.println(dailybible_info.text());
            System.out.println(bible_text.text());
            System.out.println(bibleinfo_box.text());

            /* if(element != null) {
                String text = element.text();
                System.out.println(text);
            } */

            // "ul.body_list" 아래의 모든 "li" 요소들을 추출한다.
            Elements body_list = document.select("ul.body_list > li");
            // System.out.println(body_list);
            // 추출한 "li" 요소들을 순회하며 내용을 출력한다.
            for (Element list : body_list) {
                // "li" 요소 내부에서 ".num" 클래스를 가진 요소의 텍스트 출력
                System.out.print(list.selectFirst(".num").text() + ":");
                // "li" 요소 내부에서 ".info" 클래스를 가진 요소의 텍스트 출력
                System.out.println(list.selectFirst(".info").text());
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
