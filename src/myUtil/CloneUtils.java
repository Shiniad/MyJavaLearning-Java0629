package myUtil;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 通过序列化和内存流对象流实现对象深拷贝
 * @author Administrator
 *
 */
public class CloneUtils {
	
	// 禁止实例化
	private CloneUtils() {
		throw new AssertionError();
	}

	@SuppressWarnings("unchecked")
	public static <T> T clone(T obj) throws Exception {
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bout);
		oos.writeObject(obj);
		
		// 输入流必须确定源
		ByteArrayInputStream bis = new ByteArrayInputStream(bout.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		// NOTICE 强制从Object转为泛型T,如果传入的对象类型不是T可能会出错
		return (T) ois.readObject();
	}
}

