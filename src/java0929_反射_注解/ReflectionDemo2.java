package java0929_反射_注解;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionDemo2 {
	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> empRe = Class.forName("java0929.Employee");
		Object ee = new Employee();
		
		
		try {
			// 获取属性访问类型
			// 方法1：获取所有的公共属性
//			Field fName = empRe.getField("name");// 仅仅能得到public属性
			Field fName = empRe.getDeclaredField("name");
			
			System.out.println("成功获取到name属性，类型为:" + fName.getType());
			// 操作
			// 如果是私有属性要复制，必须调用setAccessible方法
			fName.setAccessible(true);
			fName.set(ee, "员工姓名");
			System.out.println("反射后的值为：" + ee);
			String value = (String) fName.get(ee);
			System.out.println(value);
			
			// 获取方法
			Method m = empRe.getMethod("setName", String.class);
			m.invoke(ee, "1号员工");
			// 调用两个参数的方法
			Method m2 = empRe.getMethod("setData", Integer.class,String.class);
			m2.invoke(ee, 2,"2号员工");
			m = empRe.getMethod("setAge", Integer.TYPE);
			m.invoke(ee, 15);
			
			// 获取类的所有接口
			Class<?>[] interfaces = empRe.getInterfaces();
			for (Class<?> class1 : interfaces) {
				System.out.println(class1);
			}
			
			// 获取其父类
			System.out.println(empRe.getSuperclass().getName());
			
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {// 没有相应的变量|安全|非法参数|非法访问
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {// 目标有问题
			e.printStackTrace();
		} 
		
	}
}
