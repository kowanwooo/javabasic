package 정적스태틱;

public class 직원 {
	String name;
	int age;
	String gender;
	static int count;
	static int sumAge;
	
	
	public 직원(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		count++;
		sumAge += this.age;		
	}
	
	public static double avg() {
		return (double)sumAge/3;
	}
	@Override
	public String toString() {
		return "직원 [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
}
