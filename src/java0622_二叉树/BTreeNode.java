package java0622_二叉树;

/**
 * 二叉树的节点
 * @author Administrator
 *
 */
public class BTreeNode<T> {
	public T data;
	//如果定义成前节点和后节点，实际上就是双向链表
	public BTreeNode<T> left; // 左节点
	public BTreeNode<T> right;// 右节点
	
	public BTreeNode() {
		
	}
	public BTreeNode(T data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	public BTreeNode(T data, BTreeNode<T> left, BTreeNode<T> right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}
	
}
