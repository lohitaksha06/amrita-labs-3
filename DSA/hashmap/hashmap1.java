//you are given a map <string containing student names as keys and their marks as values. determine the student who has scored the highest marks and display both the student's name and the corresponding mark
package hashmap;

import java.util.HashMap;
import java.util.Map;

public class hashmap1 {
	public static Map.Entry<String, Integer> findTopper(Map<String, Integer> marks) {
		Map.Entry<String, Integer> best = null;
		for (Map.Entry<String, Integer> entry : marks.entrySet()) {
			if (best == null || entry.getValue() > best.getValue()) {
				best = entry;
			}
		}
		return best;
	}

	public static void main(String[] args) {
		Map<String, Integer> marks = new HashMap<>();
		marks.put("riya", 78);
		marks.put("siya", 92);
		marks.put("miya", 85);
		marks.put("priya", 88);

		Map.Entry<String, Integer> topper = findTopper(marks);
		if (topper != null) {
			System.out.println("top student: " + topper.getKey());
			System.out.println("marks: " + topper.getValue());
		} else {
			System.out.println("no data available");
		}
	}
}
