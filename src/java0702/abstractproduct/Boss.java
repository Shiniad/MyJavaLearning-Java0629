package java0702.abstractproduct;
/**
 * ÿһ���ؿ���Boss
 * @author Administrator
 *
 */
public interface Boss {
	/**
	 * ��ȡ��������ֵ
	 * @return ��������ֵ
	 */
	public int getLife();
	
	/**
	 * ��ȡ���˵Ĺ�����
	 * @return ���˵Ĺ�����
	 */
	public int getPower();
	
	/**
	 * @return ���еĸ���
	 */
	public double getMissPossible();
}
