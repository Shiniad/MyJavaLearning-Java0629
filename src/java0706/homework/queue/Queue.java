package java0706.homework.queue;

/**
 * 队列数据结构，先进先出
 * @author Administrator
 *
 * @param <T> 
 */
public interface Queue<T> {
	/**
	 * 进队列
	 * @param t
	 */
	public void push(T t);
	
	/**
	 * 出队列
	 * @return T
	 */
	public T pop();
}
