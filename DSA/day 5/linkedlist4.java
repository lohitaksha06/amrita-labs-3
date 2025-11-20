// Questions:
// 1. display all nodes
// 2. add node at end
// 3. delete node at end
// 4. find index of a node with given data
// 5. count nodes
// Lab 4 (Doubly Linked List):
// a. insert new node after a given node value
// b. insert new node at end
// c. sort DLL ascending using bubble sort
// d. delete all nodes with a given value

public class linkedlist4 {
	// Singly linked list implementation
	static class SNode {
		int data;
		SNode next;
		SNode(int d){ data = d; }
	}

	static class SinglyList {
		SNode head;

		void addEnd(int val){
			SNode n = new SNode(val);
			if(head == null){ head = n; return; }
			SNode cur = head;
			while(cur.next != null) cur = cur.next;
			cur.next = n;
		}

		void deleteEnd(){
			if(head == null) return;
			if(head.next == null){ head = null; return; }
			SNode cur = head;
			while(cur.next.next != null) cur = cur.next;
			cur.next = null;
		}

		int indexOf(int target){
			int idx = 0;
			SNode cur = head;
			while(cur != null){
				if(cur.data == target) return idx;
				cur = cur.next; idx++;
			}
			return -1; // not found
		}

		int count(){
			int c = 0; SNode cur = head;
			while(cur != null){ c++; cur = cur.next; }
			return c;
		}

		void display(){
			SNode cur = head;
			System.out.print("SLL: ");
			while(cur != null){
				System.out.print(cur.data + " ");
				cur = cur.next;
			}
			System.out.println();
		}
	}

	// Doubly linked list for Lab 4 tasks
	static class DNode {
		int data;
		DNode prev, next;
		DNode(int d){ data = d; }
	}

	static class DoublyList {
		DNode head, tail;

		void insertEnd(int val){
			DNode n = new DNode(val);
			if(head == null){ head = tail = n; return; }
			tail.next = n; n.prev = tail; tail = n;
		}

		boolean insertAfter(int target, int val){
			DNode cur = head;
			while(cur != null && cur.data != target) cur = cur.next;
			if(cur == null) return false;
			DNode n = new DNode(val);
			n.next = cur.next; n.prev = cur;
			if(cur.next != null) cur.next.prev = n; else tail = n;
			cur.next = n;
			return true;
		}

		void deleteAll(int target){
			DNode cur = head;
			while(cur != null){
				if(cur.data == target){
					DNode toRemove = cur;
					if(toRemove.prev != null) toRemove.prev.next = toRemove.next; else head = toRemove.next;
					if(toRemove.next != null) toRemove.next.prev = toRemove.prev; else tail = toRemove.prev;
				}
				cur = cur.next;
			}
		}

		void bubbleSortAsc(){
			if(head == null) return;
			boolean swapped;
			do {
				swapped = false;
				DNode cur = head;
				while(cur.next != null){
					if(cur.data > cur.next.data){
						int tmp = cur.data; cur.data = cur.next.data; cur.next.data = tmp;
						swapped = true;
					}
					cur = cur.next;
				}
			} while(swapped);
		}

		void display(){
			System.out.print("DLL: ");
			DNode cur = head;
			while(cur != null){
				System.out.print(cur.data + " ");
				cur = cur.next;
			}
			System.out.println();
		}
	}

	public static void main(String[] args){
		// Singly list demo
		SinglyList sl = new SinglyList();
		sl.addEnd(10); sl.addEnd(20); sl.addEnd(30);
		sl.display();
		System.out.println("indexOf 20: " + sl.indexOf(20));
		System.out.println("count: " + sl.count());
		sl.deleteEnd();
		sl.display();

		// Doubly list demo (Lab 4)
		DoublyList dl = new DoublyList();
		dl.insertEnd(4); dl.insertEnd(2); dl.insertEnd(5); dl.insertEnd(2); dl.insertEnd(3);
		dl.display();
		dl.insertAfter(5, 9); // insert after value 5
		dl.display();
		dl.bubbleSortAsc();
		dl.display();
		dl.deleteAll(2);
		dl.display();
	}
}