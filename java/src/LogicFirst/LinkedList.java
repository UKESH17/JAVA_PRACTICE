/package LogicFirst;

public class LinkedList <T> {
	Node head;
	Node tail;
	int size;
	private class Node{
		private Node next;
		private T value;

		Node (T value){
			this.value=value;
			this.next = null;
		}
	}

	LinkedList(){ 
		Node head=null;
	}

	public void InsertAtBeginning(T value) {
		Node newNode = new Node (value);
		if (head == null) {
			head = newNode;
			tail = newNode;
		}else {
			newNode.next= head;
			head = newNode;
		}
		size++;
	}

	public void InsertAtLast(T value) {
		Node newNode = new Node (value);
		if (tail == null) {
			head = newNode;
			tail = newNode;
		}else {
			tail.next= newNode;
			tail=newNode;

		}
		size++;
	}



	public void InsertAtIndex(int index,T value) {
		Node newNode = new Node(value);
		if (index == 0) {
			InsertAtBeginning(value);
		}
		else {

			Node temp = head;
			for (int i =1;i<index-1;i++) {
				temp = temp.next;
				if(temp==null) {
					throw new IllegalArgumentException("Please enter the correct position :-)");
				}
			}

			newNode.next = temp.next;
			temp.next = newNode;
			size++;
		}


	}

	public void DeleteValue(T value) {
		Node temp = head;
		if (head == null) {
			throw new IndexOutOfBoundsException ("Deletion in empty Linked list :-{");
		}

		else if (head.value==value) {
			head = temp.next;

		}
		else {
			int i;
			for ( i =0; i<size;i++) {

				if (temp.next.value == value) {
					temp.next = temp.next.next;	
					break;
				}
				else {
					if (temp.next.next != null){
						temp = temp.next;}
					else {
						throw new NullPointerException("Value not found");
					}
				}

			}
		}
		size--;
	}


	public void DeleteAtPos(int pos) {
		if (head == null) {
			throw new IndexOutOfBoundsException ("Deletion in empty Linked list :-{");
		}
		else if (pos > size){
			throw new IndexOutOfBoundsException ("Limit exceeds :-{");
		}
		else if (pos == 1) {
			head = head.next;

		}else if (pos ==0) {

			size++;
		}
		else  {
			Node temp = head;
			Node prev = null;

			for (int i =1; i<pos;i++) {
				prev = temp;
				temp = temp.next;
			}

			prev.next = temp.next;

		}
		size--;
	}
	
	public void reverse() {
		Node Prev = null;
		Node Current = head;
		Node Next = head.next;
		
		while (Current != null) {
			Next = Current.next;
			Current.next = Prev;
			Prev = Current;
			Current = Next;
		}
	     head = Prev;
	}


	public void display() {

		Node temp =head;
		while(temp!=null) {

			System.out.print(temp.value + " --> ");
			temp = temp.next;

		}System.out.print("Null");
	}

}
