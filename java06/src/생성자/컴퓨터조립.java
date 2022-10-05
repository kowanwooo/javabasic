package 생성자;

public class 컴퓨터조립 {
	public static void main(String[] args) {
		컴퓨터 com1 = new 컴퓨터(17000, "삼성", 1920);
			
		System.out.println(com1);
	
		
		컴퓨터 com2 = new 컴퓨터(20000, "애플", 1440);
		
		System.out.println(com2);
	
	}
	
	
}
