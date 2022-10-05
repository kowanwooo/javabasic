package 스레드;

public class 스레드exam사용 {
	public static void main(String[] args) {
		Thread_exam1 t1 = new Thread_exam1();
		Thread_exam2 t2 = new Thread_exam2();
		Thread_exam3 t3 = new Thread_exam3();
		
		t1.start();
		t2.start();
		t3.start();
	}
}
