package java0929;

import java.lang.annotation.Annotation;

public class ReflectionDemo3 {
	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> empClass = Class.forName("java0929.Employee");
		
		// 遍历类型上加的所有注解
		Annotation[] annos = empClass.getAnnotations();
		for (Annotation annotation : annos) {
			System.out.println(annotation.annotationType().getName());
		}
		
		// 访问某个注解并获取其属性值 
		if(empClass.isAnnotationPresent(TestMyAnnotation.class)) {
			TestMyAnnotation anno = empClass.getAnnotation(TestMyAnnotation.class);
			System.out.println(anno.value());
		}
	}
}
