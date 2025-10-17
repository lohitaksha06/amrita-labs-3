// write a java program to merge two hashmap<string integer> objects. if a key exists in both maps, the program should add their corresponding values and store the result in the merged map. finally display the merged map
package hashmap;

import java.util.Map;

public class hashmap2 {
 public static Map.Entry<String, Integer> (Map<String, Integer> marks) {
		Map.Entry<String, Integer> best = null;
		for (Map.Entry<String, Integer> entry : marks.entrySet()) {
			if (best == null || entry.getValue() > best.getValue()) {
				best = entry;
			}
		}
		
	}   
}