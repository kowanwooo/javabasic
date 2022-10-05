package 정적스태틱;

public class Day {
	String doing;
	int time;
	String location;
	static int count;
	static int work;
	
	public Day(String doing, int time, String location) {
		this.doing = doing;
		this.time = time;
		this.location = location;
		count++;
		work = work + this.time;
		
	}

	@Override
	public String toString() {
		return "나의 하루 [하는 일=" + doing + ", 한 시간=" + time + ", 위치=" + location + "]";
	}
	
}
