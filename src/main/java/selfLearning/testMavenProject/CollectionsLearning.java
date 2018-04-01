package selfLearning.testMavenProject;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CollectionsLearning {
	
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String,String>();
		map.put("Name", "Abinash");
		map.put("Job", "Private Sector");
		
		Set<Map.Entry<String, String>> st = map.entrySet();
		for (Map.Entry<String, String> entry : st) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			
		}
	}

}
