package 배열응용;

import java.util.Random;

import javax.swing.JOptionPane;

public class 랜덤한값배열에넣기 {

	public static void main(String[] args) {
		Random r= new Random(); 
		int[] data = new int[1000];
		for (int i = 0; i < data.length; i++) {
			data[i] = r.nextInt(32) + 1;
		}
		for (int x : data) {
			System.out.print(x + " ");
		}
	}

}
