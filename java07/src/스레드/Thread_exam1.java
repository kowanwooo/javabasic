package 스레드;

public class Thread_exam1 extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("Thread_exam1 : $" + i );
			
		}
	}
}
