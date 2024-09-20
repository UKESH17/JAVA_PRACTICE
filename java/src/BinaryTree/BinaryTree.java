 package BinaryTree;

public class BinaryTree {
	
	Node  root;	
  class Node{
	  int data;
	  Node Left, Right;
	  
	  public Node(int d) {
		  this.data = d;
		  this.Left= null;
		  this.Right=null;
	  }
	  
  }
  public BinaryTree(int data) {
	   root = new Node(data); 
  }
  
  public void InsertLeft(Node r,int data) {
	  Node NewNode = new Node (data);
	  r.Left = NewNode;
  }
  
  public void InsertRight(Node r,int data) {
	  Node NewNode = new Node (data);
	  r.Right = NewNode;
  }
  
  public void PostOrderTransverse(Node root) {
	  if(root!=null) {
		  PostOrderTransverse(root.Left);
		  PostOrderTransverse(root.Right);
		  System.out.print(root.data + " -> ");
	  }
	  
  }
	
	
}
