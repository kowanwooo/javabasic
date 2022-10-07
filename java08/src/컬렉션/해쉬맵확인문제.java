package 컬렉션;

import java.util.HashMap;

public class 해쉬맵확인문제 {
	public static void main(String[] args) {
		HashMap pe = new HashMap<>();
		pe.put(100, "김데이");
		pe.put(200, "김사전");
		pe.put(300, "김구조");
		pe.put(400, "김자료");
		System.out.println(pe);
		
		pe.remove(200);
		pe.put(300, "김충성");
		System.out.println(pe);
	}
}
