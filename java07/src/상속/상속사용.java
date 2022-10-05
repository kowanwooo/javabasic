package 상속;

public class 상속사용 {

	public static void main(String[] args) {
		사람 p = new 사람();
		p.gender = "남자";
		p.name = "클라크";
		System.out.println(p);
		
		맨 m = new 맨();
		m.gender = "남자";
		m.name = "데이비드";
		m.size = 100;
		System.out.println(m);
		
		수퍼맨 sMan = new 수퍼맨();
		sMan.gender = "남자";
		sMan.name = "윌리엄";
		sMan.size = 200;
		System.out.println(sMan);
		sMan.날아다니다();
		sMan.달리다();
		sMan.먹다();
		sMan.잠자다();
		
		원더우먼 sWon = new 원더우먼();
		sWon.gender = "여자";
		sWon.name = "원더원더";
		sWon.size = 50;
		System.out.println(sWon);
		sWon.날아다니다();
		sWon.달리다();
		sWon.먹다();
		sWon.잠자다();
	}
}
