package java0702.abstractproduct;
/**
 * 
 * @author Administrator
 *
 */
public interface Enemy {
	/**
	 * @return 敌人生命值
	 */
	public int getLife();
	
	/**
	 * @return 敌人的数量
	 */
	public int getCount();
	
	/**
	 * @return 敌人的攻击力
	 */
	public int getPower();
}
