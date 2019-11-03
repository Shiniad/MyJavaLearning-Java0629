package javase;

public class SeqList<T> extends Object {
	
	//��������洢˳��������Ԫ��
	protected Object[] element;
	//˳����Ԫ�ظ���
	protected int n;
	//��������Ϊlength�Ŀձ�
	
	public SeqList(int length) {
		//��������Ĵ洢�ռ䣬Ԫ��Ϊnull
		this.element = new Object[length];
		this.n = 0;
	}
	
	public SeqList() {
		//����Ĭ�������Ŀձ����췽������
		this(64);
	}
	
	public SeqList(T[] values) {
		//��������Ϊvalues.length�Ŀձ�
		//��values==null�����ÿն�����÷���,Java�׳�NullPointerException��ָ���쳣
		this(values.length);
		//��������Ԫ��
		for(int i=0;i<values.length;i++) {
			//�������ø�ֵ
			this.element[i] = values[i];
			this.n= element.length;
		}
	}
	
	public boolean isEmpty() {
		//�ж�˳����Ƿ�Ϊ�գ�Ϊ���򷵻�true
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
			throw new NullPointerException("��ָ���쳣���������뷺���Ƿ�������");
		}
		if(i>=0 && i<this.n) {
			this.element[i] = x;
		} else {
			throw new java.lang.IndexOutOfBoundsException("���Խ���쳣:[" + i +"]");
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

