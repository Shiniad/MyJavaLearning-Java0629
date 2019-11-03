package java0702.abstractproduct;
/**
 * 每一个关卡的Boss
 * @author Administrator
 *
 */
public interface Boss {
	/**
	 * 获取敌人生命值
	 * @return 敌人生命值
	 */
	public int getLife();
	
	/**
	 * 获取敌人的功击力
	 * @return 敌人的攻击力
	 */
	public int getPower();
	
	/**
	 * @return 打不中的概率
	 */
	public double getMissPossible();
}
