import java.util.Random;

public class skiplist {
	static class Node {
		int value;
		Node[] forward; // pointers at each level

		Node(int value, int level) {
			this.value = value;
			this.forward = new Node[level + 1]; // 0-based levels
		}
	}

	private final int maxLevel;
	private int level;
	private final Node head;
	private final Random random;

	public skiplist() {
		this(16);
	}

	public skiplist(int maxLevel) {
		this.maxLevel = maxLevel;
		this.level = 0;
		this.head = new Node(Integer.MIN_VALUE, maxLevel);
		this.random = new Random();
	}

	// simple random level (coin flips)
	private int randomLevel() {
		int lvl = 0;
		while (random.nextBoolean() && lvl < maxLevel) lvl++;
		return lvl;
	}

	public boolean search(int target) {
		Node cur = head;
		for (int i = level; i >= 0; i--) {
			while (cur.forward[i] != null && cur.forward[i].value < target) {
				cur = cur.forward[i];
			}
		}
		cur = cur.forward[0];
		return cur != null && cur.value == target;
	}

	public void insert(int value) {
		Node[] update = new Node[maxLevel + 1];
		Node cur = head;
		for (int i = level; i >= 0; i--) {
			while (cur.forward[i] != null && cur.forward[i].value < value) {
				cur = cur.forward[i];
			}
			update[i] = cur;
		}

		cur = cur.forward[0];
		if (cur != null && cur.value == value) return; // no dups

		int lvl = randomLevel();
		if (lvl > level) {
			for (int i = level + 1; i <= lvl; i++) update[i] = head;
			level = lvl;
		}

		Node newNode = new Node(value, lvl);
		for (int i = 0; i <= lvl; i++) {
			newNode.forward[i] = update[i].forward[i];
			update[i].forward[i] = newNode;
		}
	}

	public boolean erase(int value) {
		Node[] update = new Node[maxLevel + 1];
		Node cur = head;
		for (int i = level; i >= 0; i--) {
			while (cur.forward[i] != null && cur.forward[i].value < value) {
				cur = cur.forward[i];
			}
			update[i] = cur;
		}

		cur = cur.forward[0];
		if (cur == null || cur.value != value) return false;

		for (int i = 0; i <= level; i++) {
			if (update[i].forward[i] != cur) break;
			update[i].forward[i] = cur.forward[i];
		}
		while (level > 0 && head.forward[level] == null) level--;
		return true;
	}

	public void display() {
		Node cur = head.forward[0];
		System.out.print("List: ");
		while (cur != null) {
			System.out.print(cur.value + " ");
			cur = cur.forward[0];
		}
		System.out.println();
	}

	public static void main(String[] args) {
		skiplist sl = new skiplist();
		sl.insert(3);
		sl.insert(1);
		sl.insert(5);
		sl.insert(2);
		sl.display();
		System.out.println("find 5: " + sl.search(5));
		System.out.println("find 7: " + sl.search(7));
		sl.erase(3);
		sl.display();
	}
}
