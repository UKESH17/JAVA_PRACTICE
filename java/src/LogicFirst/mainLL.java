package LogicFirst;

public class mainLL {
	public static void main(String[] args) {
		
	
LinkedList<Integer> ll = new LinkedList<Integer>();

ll.InsertAtBeginning(4);
ll.InsertAtBeginning(14);
ll.InsertAtBeginning(24);
ll.InsertAtBeginning(34);
ll.InsertAtLast(0);
ll.InsertAtIndex(1, 100);
ll.display();
System.out.println();
System.out.println("the size : "+  ll.size);


ll.reverse();
ll.display();
//ll.DeleteAtPos(6);
//ll.display();
//System.out.println();
//System.out.println("the size : "+  ll.size);

}
	}
