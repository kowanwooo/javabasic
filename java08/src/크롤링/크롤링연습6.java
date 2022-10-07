package 크롤링;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 크롤링연습6 {
	static String yesterday;
	static String today;
	static String today2;
	public String naver(String code) {
		Element tag = null, tag2 = null, tag3 = null;
		try {
			Document doc = Jsoup.connect("https://finance.naver.com/item/main.naver?code=" + code).get();
			Elements list = doc.select("td.first").select(".blind");
			System.out.println("----------------------------");

			tag = list.get(0);
			System.out.println("전일가 : " + tag.text());
			yesterday = tag.text();

			Elements list2 = doc.select("div.today").select(".blind");
			tag2 = list2.get(0);
			System.out.println("현재가 : " + tag2.text());
			today = tag.text();

			Elements list3 = doc.select("td.first").select(".blind");
			tag3 = list3.get(1);
			System.out.println("싯가 : " + tag3.text());
			today2 = tag.text();

		} catch (IOException e) {
			e.printStackTrace();
		}
		return "전일가 : " + yesterday+ "\n현재가 : " + today+ "\n싯가 : " + today2;

	}

}