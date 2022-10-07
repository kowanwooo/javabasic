package 크롤링;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 크롤링연습4 {

	public static void main(String[] args) {
		String[] code = { "005360", "005930", "068270" };
		String[] company = { "모나미", "삼성전자", "셀트리온" };
		for (int i = 0; i < company.length; i++) {
			try {
				Document doc = Jsoup.connect("https://finance.naver.com/item/main.naver?code=" + code[i]).get();
				Elements list = doc.select("td.first").select(".blind");
				System.out.println("----------------------------");
				System.out.println("회사명 : " + company[i]);
				Element tag = list.get(0);
				System.out.println("전일가 : " + tag.text());
				String yesterday = tag.text();

				Elements list2 = doc.select("div.today").select(".blind");
				Element tag2 = list2.get(0);
				System.out.println("현재가 : " + tag2.text());
				String today = tag.text();

				Elements list3 = doc.select("td.first").select(".blind");
				Element tag3 = list3.get(1);
				System.out.println("싯가 : " + tag3.text());
				String today2 = tag.text();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}