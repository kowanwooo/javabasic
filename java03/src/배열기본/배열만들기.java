
package 배열기본;

public class 배열만들기 {
	public static void main(String[] args) {
		int[] s = {1, 2, 3, 4, 5, 6, 7};
		System.out.println("s에 저장된 주소>> " + s);
		System.out.println(s[0]);
		
		int[]s2 = new int[5];
		System.out.println("s2에 저장된 주소>> " + s2);
		System.out.println(s2.length);
		System.out.println(s2[0]);
		
		s2[0] = 100;
		s2[1] = 200;
		s2[2] = 300;
		s2[s2.length-1] = 500;
		System.out.println(s2[0]);
		System.out.println(s2[s2.length-1]);
	
	}
}
