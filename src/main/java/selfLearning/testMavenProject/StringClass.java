package selfLearning.testMavenProject;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "This is ,String ,literal";
		String s2 = new String("This is String object");
		String s3 = new String(s1);
		
		System.out.println(s1.length());
		System.out.println(s2.charAt(5));
		System.out.println(s2.substring(6));
		System.out.println(s2.substring(6, 9));
		System.out.println(s1.concat(s3));
		System.out.println(s1.indexOf("literal"));
		System.out.println(s1.equals(s2));
		 String [] st = s1.split(",");
		 String [] st1= s1.split(",", 2);
		 
		

	}

}
