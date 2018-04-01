package selfLearning.testMavenProject;

public class Static {
	
	static int num = 10;
	int age;
	

	public static void displayNum() {
		System.out.println(num);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Static stat1 = new Static();
		Static stat2 = new Static();
		stat1.num = 12;
		stat1.age= 23;
		
		stat2.num = 14;
		stat2.age= 23;
				
		displayNum();

	}

}
