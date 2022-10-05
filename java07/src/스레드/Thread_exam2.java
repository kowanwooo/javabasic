package 스레드;

public class Thread_exam2 extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("Thread_exam2 : @" + i );
			
		}
	}
}
