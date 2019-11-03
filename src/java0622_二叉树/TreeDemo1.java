package java0622_二叉树;

/**
 * 构建一棵树，并使用图形化辅助工具显示它
 * @author Administrator
 *
 */
public class TreeDemo1 {
	public static void main(String[] args) {
		BTree<Integer> tree = new BTree<Integer>();
//		BTreeNode<Integer> btn1 = new BTreeNode<Integer>();
//		BTreeNode<Integer> btn2 = new BTreeNode<Integer>();
//		BTreeNode<Integer> btn3 = new BTreeNode<Integer>();
//		BTreeNode<Integer> btn4 = new BTreeNode<Integer>();
//		BTreeNode<Integer> btn01 = new BTreeNode<Integer>();
//		BTreeNode<Integer> btn02 = new BTreeNode<Integer>();
//		tree.root.data = 100;
//		btn01.data = 95;
//		btn02.data = 105;
//		btn1.data = 92;
//		btn2.data = 98;
//		btn3.data = 102;
//		btn4.data = 110;
//		
//		
//		tree.root.left = btn01;
//		tree.root.right = btn02;
//		btn01.left = btn1;
//		btn01.right = btn2;
//		btn02.left = btn3;
//		btn02.right = btn4;
//		tree.preorder();
		
//		tree.root.data = 25;
		for (int i = 0; i < 30; i++) {
			tree.store(i);
		}
		BTreeNode<?> node = tree.find(30);
		System.out.println(node.data);
		System.out.println(tree.toString());
	}
}







