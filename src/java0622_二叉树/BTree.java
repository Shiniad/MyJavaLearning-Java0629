package java0622_������;


public class BTree<T> {
	public BTreeNode<T> root;// ���ڵ�
	
	public BTree() {
		this.root = new BTreeNode<T>();
	}
	/**
	 * �ڱ�֤�������������²�������
	 * �����ǲ��ң����ĸ��ڵ�����ݱ�����Ҫ���������С�������Ǵ󣩣�Ȼ���ҵ�һ���յ���(��)�ڵ��������
	 */
	public void store(T data) { // ��ʼ������
		store(data,this.root);
	}
	private void store(T data, BTreeNode<T> startNode) {
		if(startNode.data == null) {
			startNode.data = data;
		} else {
			int number1 = (Integer)data; // ���Զ����������ֹ����װ�����Ч��
			int number2 = (Integer)startNode.data;
			if(number1 < number2) {
				if(startNode.left!=null) {
					store(data,startNode.left);
				} else {
					startNode.left = new BTreeNode<T>(data);
				}
				
			} else {
				if(startNode.right!=null) {
					store(data,startNode.right);
				} else {
					startNode.right = new BTreeNode<T>(data);
				}
			}
		}
	}
	
	/**
	 * ����Ԫ��
	 */
	public BTreeNode<T> find(T data) {// ��ʼ������
		return find(data,this.root);
	}

	private BTreeNode<T> find(T data, BTreeNode<T> startNode){
		int number = (Integer)data;
		int currentNum = (Integer)startNode.data;
		
		BTreeNode<T> node = null; // ��ʾ���ղ��ҵ�Ԫ��,Ĭ��δ���ҵ�
		
		if(number == currentNum) {
			node = startNode;
			return node;
		} else {
			if(number < currentNum) {
				if(startNode.left!=null) {// �ǿ��ж�,��д����ض������
					node = find(data,startNode.left);
				}
				
			} else {
				if(startNode.right!=null) {
					node = find(data,startNode.right);
				}
			}
		}
		return node;
	}
	
	/**
	 * ��ȡ������������
	 * һ�����ڵ�������ֿ����ң����ıߵ��������ۼ��ı�
	 */
	public int depath() {
		return 1;
	}
	
	public void preorder() {
		preorder(this.root);
		System.out.println();
	}
	public void preorder(BTreeNode<T> p) {
		if(p!=null) {
			preorder(p.left);
			System.out.print(p.data.toString() + " ");
			preorder(p.right);
		}
	}
	
	public String toString() {
		return toString(this.root);
	}
	private String toString(BTreeNode<T> p) {
		if(p==null) {
			return "^";
		}
		return toString(p.left) + p.data.toString() + " " + toString(p.right);
	}
}
