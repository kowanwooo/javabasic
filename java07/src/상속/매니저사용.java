package 상속;

public class 매니저사용 {
	public static void main(String[] args) {
		
		매니저 he = new 매니저();
		he.address = "버거킹";
		he.name = "철수";
		he.salary = 200;
		he.rrn = 300;
		System.out.println(he);
		he.test();
	}
}
