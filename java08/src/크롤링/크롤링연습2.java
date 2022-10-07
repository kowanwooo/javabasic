package 크롤링;

import java.io.IOException;



import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 크롤링연습2 {

   public static void main(String[] args) {
      try {
         Document doc = Jsoup.connect("https://finance.naver.com/item/main.naver?code=005930").get();
         Elements list = doc.select(".blind");
//         System.out.println(list.size());
//         System.out.println(list.get(0));
         for (int i = 16; i < 21; i++) {
//			System.out.println(list.get(i));
			Element tag = list.get(i);
			System.out.println(i + " : " + tag);
		}
         Element tag = list.get(16);
         System.out.println(16 + " : " + tag.text());
         
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

}