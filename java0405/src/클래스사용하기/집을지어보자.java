package 클래스사용하기;

import 클래스만들기.벽돌틀;

public class 집을지어보자 {
	public static void main(String[] args) {
		벽돌틀 벽돌1 = new 벽돌틀();

		벽돌1.x = 50;
		벽돌1.y = 50;

		벽돌1.쌓다();

		벽돌틀 벽돌2 = new 벽돌틀();

		벽돌2.x = 150;
		벽돌2.y = 150;

		벽돌2.쌓다();
	}
}
