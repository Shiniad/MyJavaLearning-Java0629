package java0706.homework.queue;

/**
 * �������ݽṹ���Ƚ��ȳ�
 * @author Administrator
 *
 * @param <T> 
 */
public interface Queue<T> {
	/**
	 * ������
	 * @param t
	 */
	public void push(T t);
	
	/**
	 * ������
	 * @return T
	 */
	public T pop();
}
