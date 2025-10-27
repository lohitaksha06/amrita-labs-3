public class dictionary {
	// Dictionary (word -> meaning) using singly linked list
	static class Node {
		String word;
		String meaning;
		Node next;

		Node(String w, String m) {
			word = w;
			meaning = m;
		}
	}

	Node head;
	int size;

	void add(String word, String meaning) {
		Node c = head;
		while (c != null) {
			if (c.word.equals(word)) {
				c.meaning = meaning;
				return;
			}
			c = c.next;
		}
		Node n = new Node(word, meaning);
		n.next = head;
		head = n;
		size++;
	}

	String get(String word) {
		for (Node c = head; c != null; c = c.next) {
			if (c.word.equals(word)) return c.meaning;
		}
		return null;
	}

	boolean has(String word) {
		return get(word) != null;
	}

	boolean remove(String word) {
		if (head == null) return false;
		if (head.word.equals(word)) {
			head = head.next;
			size--;
			return true;
		}
		Node c = head;
		while (c.next != null && !c.next.word.equals(word)) {
			c = c.next;
		}
		if (c.next == null) return false;
		c.next = c.next.next;
		size--;
		return true;
	}

	int size() {
		return size;
	}

	void printAll() {
		for (Node c = head; c != null; c = c.next) {
			System.out.println(c.word + " -> " + c.meaning);
		}
	}

	public static void main(String[] args) {
		dictionary d = new dictionary();
		d.add("apple", "a fruit");
		d.add("java", "a programming language");
		System.out.println("has 'apple': " + d.has("apple"));
		System.out.println("java => " + d.get("java"));
		d.printAll();
		d.remove("apple");
		System.out.println("size: " + d.size());
	}
}
