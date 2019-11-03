package myUtil;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * ͨ�����л����ڴ���������ʵ�ֶ������
 * @author Administrator
 *
 */
public class CloneUtils {
	
	// ��ֹʵ����
	private CloneUtils() {
		throw new AssertionError();
	}

	@SuppressWarnings("unchecked")
	public static <T> T clone(T obj) throws Exception {
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bout);
		oos.writeObject(obj);
		
		// ����������ȷ��Դ
		ByteArrayInputStream bis = new ByteArrayInputStream(bout.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		// NOTICE ǿ�ƴ�ObjectתΪ����T,�������Ķ������Ͳ���T���ܻ����
		return (T) ois.readObject();
	}
}

