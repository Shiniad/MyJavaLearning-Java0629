package java0622_������;

/**
 * �������Ľڵ�
 * @author Administrator
 *
 */
public class BTreeNode<T> {
	public T data;
	//��������ǰ�ڵ�ͺ�ڵ㣬ʵ���Ͼ���˫������
	public BTreeNode<T> left; // ��ڵ�
	public BTreeNode<T> right;// �ҽڵ�
	
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
