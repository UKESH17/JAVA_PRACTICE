package BinaryTree;

import BinaryTree.BinarySearchTree.Node;

public class Bstmain {
public static void main(String[] args) {
	BinarySearchTree Bst = new BinarySearchTree(50);
	System.out.println(Bst.Root.data);
	Bst.insert(Bst.Root,20 );
	Bst.insert(Bst.Root, 70);
	Bst.insert(Bst.Root, 10);
	Bst.insert(Bst.Root, 25);
	Bst.insert(Bst.Root, 60);
	Bst.insert(Bst.Root, 90);
	Bst.PostOrderTransverse(Bst.Root);
	System.out.println();
	if (Bst.Search(Bst.Root,10)==false) {
		System.out.println("Doesnt Contains ");
	}else {
		System.out.println("CONTAINS");
	}
	System.out.println();
	System.out.println(Bst.Delete(Bst.Root,50));
	System.out.println();
	Bst.PostOrderTransverse(Bst.Root);
}


}
