package java0929_����_ע��;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionDemo2 {
	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> empRe = Class.forName("java0929.Employee");
		Object ee = new Employee();
		
		
		try {
			// ��ȡ���Է�������
			// ����1����ȡ���еĹ�������
//			Field fName = empRe.getField("name");// �����ܵõ�public����
			Field fName = empRe.getDeclaredField("name");
			
			System.out.println("�ɹ���ȡ��name���ԣ�����Ϊ:" + fName.getType());
			// ����
			// �����˽������Ҫ���ƣ��������setAccessible����
			fName.setAccessible(true);
			fName.set(ee, "Ա������");
			System.out.println("������ֵΪ��" + ee);
			String value = (String) fName.get(ee);
			System.out.println(value);
			
			// ��ȡ����
			Method m = empRe.getMethod("setName", String.class);
			m.invoke(ee, "1��Ա��");
			// �������������ķ���
			Method m2 = empRe.getMethod("setData", Integer.class,String.class);
			m2.invoke(ee, 2,"2��Ա��");
			m = empRe.getMethod("setAge", Integer.TYPE);
			m.invoke(ee, 15);
			
			// ��ȡ������нӿ�
			Class<?>[] interfaces = empRe.getInterfaces();
			for (Class<?> class1 : interfaces) {
				System.out.println(class1);
			}
			
			// ��ȡ�丸��
			System.out.println(empRe.getSuperclass().getName());
			
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {// û����Ӧ�ı���|��ȫ|�Ƿ�����|�Ƿ�����
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {// Ŀ��������
			e.printStackTrace();
		} 
		
	}
}
