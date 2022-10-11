package 추상클래스인터페이스;

public class AppleComputer implements Computer{
	
	@Override
	public void 켜기() {
		// TODO Auto-generated method stub
		System.out.println("애플켜짐");
	}

	@Override
	public void 끄기() {
		// TODO Auto-generated method stub
		System.out.println("애플꺼짐");
		
	}

	@Override
	public void 재시작() {
		// TODO Auto-generated method stub
		System.out.println("애플재시작중");
	}
}
