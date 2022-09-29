package 배열기본;

import java.util.Iterator;

public class 배열타입연습 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		System.out.println(arr.length);
		arr[0] = 100;
		System.out.println(arr[0]);
		arr[arr.length-1] = 500;
		System.out.println(arr[arr.length-1]);
		arr[2] = 200;
		System.out.println(arr[2]);
		
		for (int x : arr) {
			System.out.println(x);
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + "번쨰 :" + arr[i]);
		}
		
	}
}
