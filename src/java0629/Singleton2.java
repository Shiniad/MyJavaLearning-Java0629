package java0629;
/**
 * 单例模式
 * @author Administrator
 *
 */
public class Singleton2 {
	// 懒汉模式
	public static TargetSingle target;
	
	public synchronized static TargetSingle getTarget() {
		if(target == null) {// 只在需要的时候才创建
			target = new TargetSingle();
		}
		return target;
	}
}
