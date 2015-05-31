
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 42;
		char gender = 'M';
		int heartRate = 73;
		int sleepHours = 6;
		int weight = 95;
		int height = 179;
		
		HealthAge ha = new HealthAge(age, gender, heartRate, sleepHours, weight, height);
		ha.test();
	}

}
