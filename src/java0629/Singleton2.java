package java0629;
/**
 * ����ģʽ
 * @author Administrator
 *
 */
public class Singleton2 {
	// ����ģʽ
	public static TargetSingle target;
	
	public synchronized static TargetSingle getTarget() {
		if(target == null) {// ֻ����Ҫ��ʱ��Ŵ���
			target = new TargetSingle();
		}
		return target;
	}
}
