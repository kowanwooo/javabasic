package 크롤링;

import java.io.IOException;



import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 크롤링연습3 {

   public static void main(String[] args) {
      try {
         Document doc = Jsoup.connect("https://news.naver.com/").get();
         Elements list = doc.select(".Nitem_link_menu");
//         System.out.println(list.size());
//         System.out.println(list.get(0));
         for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
			Element tag = list.get(i);
			System.out.println(i + " : " + tag.text());
		}
         
         
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

}