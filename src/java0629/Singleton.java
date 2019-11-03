package java0629;
/**
 * 单例模式
 * @author Administrator
 *
 */
public class Singleton {
	// 饿汉模式
	public static TargetSingle target = new TargetSingle();
	
//	public static TargetSingle target2;
//	static {
//		target2 = new TargetSingle();
//		// 继续在静态代码块中进行下一步操作，比如访问文件
//	}
	
	public static TargetSingle getTarget() {
		return target;
	}
}
