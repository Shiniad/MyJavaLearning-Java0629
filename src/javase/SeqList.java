package javase;

public class SeqList<T> extends Object {
	
	//对象数组存储顺序表的数据元素
	protected Object[] element;
	//顺序表的元素个数
	protected int n;
	//构造容量为length的空表
	
	public SeqList(int length) {
		//申请数组的存储空间，元素为null
		this.element = new Object[length];
		this.n = 0;
	}
	
	public SeqList() {
		//创建默认容量的空表，构造方法重载
		this(64);
	}
	
	public SeqList(T[] values) {
		//创建容量为values.length的空表
		//若values==null，则用空对象调用方法,Java抛出NullPointerException空指针异常
		this(values.length);
		//复置数组元素
		for(int i=0;i<values.length;i++) {
			//对象引用赋值
			this.element[i] = values[i];
			this.n= element.length;
		}
	}
	
	public boolean isEmpty() {
		//判断顺序表是否为空，为空则返回true
		return this.n == 0;
	}
	
	public int size() {
		return this.n;
	}
	
	@SuppressWarnings("unchecked")
	public T get(int i) {
		if(i>=0 && i<this.n) {
			return (T)this.element[i];
		}
		return null;
	}
	
	public void set(int i,T x) {
		if(x==null) {
			throw new NullPointerException("空指针异常，请检查输入泛型是否有问题");
		}
		if(i>=0 && i<this.n) {
			this.element[i] = x;
		} else {
			throw new java.lang.IndexOutOfBoundsException("序号越界异常:[" + i +"]");
		}
	}
	
	public String toString() {
		String str = this.getClass().getName() + "(";
		if(this.n>0) {
			str += this.element[0].toString();
		}
		for(int i=1;i<this.n;i++) {
			str += "," + this.element[i].toString();
		}
		return str + ")";
	}
	
	public static void main(String[] args) {
		SeqList<String> seq = new SeqList<String>();
		seq.set(1, "hello world");
		System.out.println(seq.get(1));
	}

}

