package 컬렉션;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;

public class 시험일정컬렉션 {
	public static void main(String[] args) {
		LinkedList li = new LinkedList();
		li.add("국어");
		li.add("수학");
		li.add("영어");
		li.add("컴퓨터");
		
		li.remove();
		System.out.println("1일차" + li);
		li.remove();
		System.out.println("2일차" + li);
		li.remove();
		System.out.println("3일차" + li);
		
		
	}
}
