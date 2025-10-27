public class map {
	// Simple Map using singly linked list
	static class Node {
		String key;
		int val;
		Node next;

		Node(String k, int v) {
			key = k;
			val = v;
		}
	}

	Node head;
	int size;

	void put(String key, int val) {
		Node cur = head;
		while (cur != null) {
			if (cur.key.equals(key)) {
				cur.val = val;
				return;
			}
			cur = cur.next;
		}
		Node n = new Node(key, val);
		n.next = head;
		head = n;
		size++;
	}

	Integer get(String key) {
		Node c = head;
		while (c != null) {
			if (c.key.equals(key)) return c.val;
			c = c.next;
		}
		return null;
	}

	boolean containsKey(String key) {
		return get(key) != null;
	}

	boolean remove(String key) {
		if (head == null) return false;
		if (head.key.equals(key)) {
			head = head.next;
			size--;
			return true;
		}
		Node c = head;
		while (c.next != null && !c.next.key.equals(key)) {
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

	int sum() {
		int s = 0;
		for (Node c = head; c != null; c = c.next) s += c.val;
		return s;
	}

	void print() {
		for (Node c = head; c != null; c = c.next) {
			System.out.println(c.key + " -> " + c.val);
		}
	}

	public static void main(String[] args) {
		map m = new map();
		m.put("a", 10);
		m.put("b", 20);
		m.put("c", 15);

		System.out.println("get b: " + m.get("b"));
		System.out.println("has x: " + m.containsKey("x"));
		System.out.println("size: " + m.size());
		System.out.println("sum: " + m.sum());
		m.print();

		m.remove("b");
		System.out.println("after remove b:");
		m.print();
	}
}
