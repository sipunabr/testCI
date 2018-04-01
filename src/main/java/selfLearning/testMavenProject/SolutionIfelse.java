package selfLearning.testMavenProject;

import java.util.Scanner;

public class SolutionIfelse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		/*if(n<=1 && n>= 100) {
			System.out.println("Please enter a number between 1 to 100");
			n = sc.nextInt();
		}*/
		System.out.println("The number you have entered is : "+ n);
		String ans = "";
		
		if(n%2==0 && n>=2 && n<=5) {
			ans = "Not Weird";
			System.out.println(ans);
		
		}else if (n%2==0 && n>5 && n<=20) {
			ans="Weird";
			System.out.println(ans);
		}
		else if (n%2==0 && n>=20) {
			ans="Not Weird";
			System.out.println(ans);
		}
		else if (n%2!=0) {
			ans="Weird";
			System.out.println(ans);
		}
		
		sc.close();
		

	}

}
