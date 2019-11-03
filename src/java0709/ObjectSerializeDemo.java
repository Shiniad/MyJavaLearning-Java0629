package java0709;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 演示对象的序列化
 * @author Administrator
 *
 */
public class ObjectSerializeDemo {
	public static void main(String[] args) throws IOException {
		OutputStream fos = new FileOutputStream("e:\\25.bin");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Student s1 = new Student("molika", "s001");
		
		List<Student> list = new ArrayList<Student>();
		list.add(s1);

		oos.writeObject(list);;
		oos.close();
		fos.close();
	}
}
