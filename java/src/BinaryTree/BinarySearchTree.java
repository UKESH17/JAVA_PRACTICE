package BinaryTree;



public class BinarySearchTree {
	Node  Root;	
	class Node{
		int data;
		Node Left, Right;

		public Node(int d) {
			this.data = d;
			this.Left= null;
			this.Right=null;
		}

	}
	public BinarySearchTree(int data) {
		Root = new Node(data); }

	public Node insert(Node root,int value) {
		if (root == null) {
			return new Node (value);
		}if (root.data > value) {
			root.Left = insert(root.Left,value);
		}else { 
			root.Right=insert (root.Right,value);
		}
		return root;
	}


	public void PostOrderTransverse(Node root) {
		if(root!=null) {
			PostOrderTransverse(root.Left);
			PostOrderTransverse(root.Right);
			System.out.print(root.data + " -> ");
		}
		if (Root ==null) {
			System.out.println("Tree not found");
		};
	}


	public boolean Search(Node root,int value) {
		if(root!=null ) {
			if (root.data==value) {
				return true;
			}  
			else if(value<root.data) {
				return Search(root.Left,value);}
			else {
				return Search(root.Right,value);
			}

		}
		return false;
	}


	public void Delete(int value) {
		Root = Delete(Root,value);
	}

	public Node Delete(Node root,int value) {

		// Base case
		if (root == null) {
			return root;
		}

		// If key to be searched is in a subtree
		if ( value<root.data ) 
		{
			root.Left = Delete(root.Left, value);      
		} 
		else if (value>root.data )
		{
			root.Right = Delete(root.Right, value);
		} 

		else {

			// only right child
			if (root.Left == null) {
				return root.Right;
			}

			// When root has only left child
			if (root.Right == null) {
				return root.Left;
			}

			// When both children are present
			Node succ = getSuccessor(root);
			root.data = succ.data;
			root.Right = Delete(root.Right, succ.data);
		}
		return root;
	}
	// Note that it is not a generic inorder successor 
	// function. It mainly works when the right child
	// is not empty, which is the case we need in BST
	// delete. 
	Node getSuccessor(Node curr) {
		curr = curr.Right;
		while (curr != null && curr.Left != null) {
			curr = curr.Left;
		}
		return curr;
	}  

}


