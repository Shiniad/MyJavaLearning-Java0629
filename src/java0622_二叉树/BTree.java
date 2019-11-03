package java0622_二叉树;


public class BTree<T> {
	public BTreeNode<T> root;// 根节点
	
	public BTree() {
		this.root = new BTreeNode<T>();
	}
	/**
	 * 在保证数据有序的情况下插入数据
	 * 首先是查找，看哪个节点的数据比我们要插入的数据小（或者是大），然后找到一个空的左(右)节点放入数据
	 */
	public void store(T data) { // 初始化调用
		store(data,this.root);
	}
	private void store(T data, BTreeNode<T> startNode) {
		if(startNode.data == null) {
			startNode.data = data;
		} else {
			int number1 = (Integer)data; // 可以定义变量来阻止拆箱装箱提高效率
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
	 * 查找元素
	 */
	public BTreeNode<T> find(T data) {// 初始化调用
		return find(data,this.root);
	}

	private BTreeNode<T> find(T data, BTreeNode<T> startNode){
		int number = (Integer)data;
		int currentNum = (Integer)startNode.data;
		
		BTreeNode<T> node = null; // 表示最终查找到元素,默认未查找到
		
		if(number == currentNum) {
			node = startNode;
			return node;
		} else {
			if(number < currentNum) {
				if(startNode.left!=null) {// 非空判定,不写程序必定会出错
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
	 * 获取该树的最大深度
	 * 一个个节点遍历，分开左右，看哪边的深度深就累加哪边
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
