package selfLearning.testMavenProject;

public class Constructors {
	
	private int var;
	/*public Constructors() {
		var=25;
	}*/
	public Constructors(int num) {
		var=num;
	}
	
	public int returnValue(){
		return var;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Constructors obj1 = new Constructors();
		Constructors obj2 = new Constructors(45);
		System.out.println(obj2.returnValue());

	}

}
