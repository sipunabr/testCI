package selfLearning.testMavenProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> li = new ArrayList<>();
		List<String> litobeCopied = new ArrayList<>();
		
		li.add("Abinash");
		li.add(1, "Asish");
		
		litobeCopied.add("Asish");
		litobeCopied.add(1, "Asakti");
		
		li.addAll(litobeCopied);
		
		for (String st : li) {
			
			System.out.println(st);
		}
		
		li.remove(3);
		li.remove(new ArrayList<>());
		
		Collections.sort(li);
		
		Iterator it = li.iterator();
		while(it.hasNext()) {
			
			Object obj = it.next();
			System.out.println(obj);
		}
		
		Collections.sort(li,Collections.reverseOrder());
		System.out.println(li);
		

	}

}
