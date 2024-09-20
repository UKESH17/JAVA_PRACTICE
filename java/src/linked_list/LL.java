package linked_list;

public class LL extends Object {

	private class Node{  
		private int value;
		private Node next;

		public Node (int value) {
			this.value = value;
		}

		public Node (int value,Node next) {
			this.value = value;
			this.next = null;
		}
	}
		private Node head;
		private Node tail;

		private int size;

	
        public int size() {
        	return size;
        }
		public void insertFirst(int val) {
			Node newnode = new Node (val); 
			if (head==null) {
				tail = newnode;
				head = newnode;
			}	 
			newnode.next = head;
			head = newnode;
			size++;
		}

		public void insertlast (int val) {
			Node newnode = new Node (val);

			if (tail == null) {
				insertFirst(val);
			}

			tail.next = newnode;
			tail = newnode;
			size++;


		}

		public void insertatIndex(int val, int index) {
			if (index ==0) {
				insertFirst(val);
				return;
			}
			if (index == size) {
				insertlast(val);
				return;
			}	


			Node temp = head;
			for(int i=1; i<index-1;i++) {
				temp = temp.next;
			}

			Node node = new Node(val,temp.next);
			temp.next =  node;

		}



		public void display() {

			if(head == null) {
				System.out.print("The List is empty");
				return;
			}
			Node temp = head;
			while (temp!=null) {
				System.out.print(temp.value+" -> ");
				temp = temp.next;
			}
			System.out.print("Null");
		}


	
}  
