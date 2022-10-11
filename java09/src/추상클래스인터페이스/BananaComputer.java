package 추상클래스인터페이스;

public class BananaComputer implements Computer{
	
	@Override
	public void 켜기() {
		// TODO Auto-generated method stub
		System.out.println("바나나켜짐");
	}

	@Override
	public void 끄기() {
		// TODO Auto-generated method stub
		System.out.println("바나나꺼짐");
		
	}

	@Override
	public void 재시작() {
		// TODO Auto-generated method stub
		System.out.println("바나나재시작중");
	}
}
