package java0929;

import java.lang.annotation.Annotation;

public class ReflectionDemo3 {
	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> empClass = Class.forName("java0929.Employee");
		
		// ���������ϼӵ�����ע��
		Annotation[] annos = empClass.getAnnotations();
		for (Annotation annotation : annos) {
			System.out.println(annotation.annotationType().getName());
		}
		
		// ����ĳ��ע�Ⲣ��ȡ������ֵ 
		if(empClass.isAnnotationPresent(TestMyAnnotation.class)) {
			TestMyAnnotation anno = empClass.getAnnotation(TestMyAnnotation.class);
			System.out.println(anno.value());
		}
	}
}
