package java0629;
/**
 * ����ģʽ
 * @author Administrator
 *
 */
public class Singleton {
	// ����ģʽ
	public static TargetSingle target = new TargetSingle();
	
//	public static TargetSingle target2;
//	static {
//		target2 = new TargetSingle();
//		// �����ھ�̬������н�����һ����������������ļ�
//	}
	
	public static TargetSingle getTarget() {
		return target;
	}
}
