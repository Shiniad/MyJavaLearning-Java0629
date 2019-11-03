package java0627;

import java0627.desk.LegImpl;
import java0627.desk.Legs;
/**
 * 接口在实际项目中的作用：系统之间的隔离，被调用的方法和发起调用的方法之间不需要知道对方的细节
 * 类：描述实际事物
 * 接口：描述规范，代表能力
 * 类可以有属性和方法
 * 接口只有方法的定义及常量
 * 
 * ## 面向接口编程
 * 设计时考虑接口
 * 实现时一部分考虑实现
 * 组装时，利用多态的思相实现，只使用接口组装不考虑具体细节，只要接口的规范完成，基本上无论实现类怎样写都不会有太大问题
 * @author Administrator
 *
 */
public class Demo {
	private Legs[] leg  = new LegImpl[4];
	
	public void add(Legs[] leg) {
		if(leg!=null) {
			boolean stand = true;
			
			if(leg.length != leg.length) {
				stand = false;
			}

			if(stand && leg.length == this.leg.length) {
				System.out.println("桌子组装好了");
			} else {
				System.out.println("组装失败");
			}
		}
	}
	
	public static void main(String[] args) {
//		DeskTop dt = new DeskTop();
//		Legs[] leg = new LegImpl[4];
//		dt.add(leg);
	}

}
