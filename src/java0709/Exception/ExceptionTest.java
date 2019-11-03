package java0709.Exception;

/**
 * 为了防止整个程序崩溃，需要捕获异常 
 * 即使前面有ruturn finally里的语句也会执行
 * JDK7的语法糖(try-with-resource): try(..//可以自动关闭){}catch{}
 * 
 * # Exception 
 * ## IOException
 * ## RuntimeException(运行时异常，编译器不会去检查，可以通过判断来解决)
 * ## SQLException
 * 
 * e.getMessage() 返回错误描述信息
 * e.printStackTrace() 打印栈跟踪记录
 * 
 * 栈跟踪记录：
 * 1.认准导常信息
 * 2.确定导常发生的代码行，通常是从上到下找我们自己的代码位置
 * 3.顺着调用确定是参数的问题还是逻辑的问题，参数还要继续往上
 * 
 * RuntimeException
 * ArithmeticException 数学计算异常
 * NullPointerException 空指针异常
 * ArrayOutOfBoundsException 数组越界异常
 * ClassNotFoundException 类文件未找到异常
 * ClassCastException 类型强制转换异常
 * SecurityException 违背安全原则异常
 * 
 * 可以去要：异常的plantUML图
 * @author Administrator
 *
 */
public class ExceptionTest {
	public static void main(String[] args) {

	}
}
