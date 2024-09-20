package BinaryTree;

public class BT_main {
 public static void main(String[] args) {
	BinaryTree tree = new BinaryTree(1);
	System.out.println(tree.root);
	tree.InsertLeft(tree.root, 2);
	tree.InsertRight(tree.root, 3);
	tree.InsertLeft(tree.root.Left, 4);
	tree.InsertRight(tree.root.Left, 5);
	tree.InsertRight(tree.root.Right, 6);
	tree.PostOrderTransverse(tree.root);
}
}
