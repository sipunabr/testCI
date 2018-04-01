package selfLearning.testMavenProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> li = new HashSet<>();
		Set<String> lilitobeCopied = new HashSet<>();
		
		li.add("Abinash");
		li.add("Asish");
		
		lilitobeCopied.add("Asish");
		lilitobeCopied.add("Asakti");
		
		li.addAll(lilitobeCopied);
		
		for (String st : li) {
			
			System.out.println(st);
		}
		
		li.remove(3);
		li.remove(new ArrayList<>());
		
		//Collections.sort(li);
		
		Iterator it = li.iterator();
		while(it.hasNext()) {
			
			Object obj = it.next();
			System.out.println(obj);
		}
	
		

	}

}
