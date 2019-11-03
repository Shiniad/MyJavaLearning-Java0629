package java0627;

/**
 * 作业答案
 * @author Administrator
 *
 */
public class Test {

}
//-------------------------------------------------------------------------------Desktop.java-------------------------------------------------------------------------------package com.octopus.interfaceoreinted1;

/** * 桌子面子的规范 * @author hw * */
 interface Desktop {
	/** * 获取桌子面子的描述 * @return */
	public String getInfo();
}
//-------------------------------------------------------------------------------GlassDesktop.java-------------------------------------------------------------------------------package com.octopus.interfaceoreinted1;

 class GlassDesktop implements Desktop {
	@Override
	public String getInfo() {
		return "玻璃的桌面";
	}
}
//-------------------------------------------------------------------------------WoodDesktop.java-------------------------------------------------------------------------------package com.octopus.interfaceoreinted1;

 class WoodDesktop implements Desktop {
	@Override
	public String getInfo() {
		return "木头桌面子";
	}
}
//-------------------------------------------------------------------------------Leg.java-------------------------------------------------------------------------------package com.octopus.interfaceoreinted1;

/** * 腿的规范 * @author hw * */
 interface Leg {
	public String getLegInfo();
}
//-------------------------------------------------------------------------------GlassLeg.java-------------------------------------------------------------------------------package com.octopus.interfaceoreinted1;

 class GlassLeg implements Leg {
	@Override
	public String getLegInfo() {
		return "玻璃腿";
	}
}
//-------------------------------------------------------------------------------WoodLeg.java-------------------------------------------------------------------------------package com.octopus.interfaceoreinted1;

 class WoodLeg implements Leg {
	@Override
	public String getLegInfo() {
		return "木头腿";
	}
}
//-------------------------------------------------------------------------------Desk.java-------------------------------------------------------------------------------package com.octopus.interfaceoreinted1;

/** * 桌子 * @author hw * */ 
 class Desk { 
	//需要桌面子 
	private Desktop desktop; 
	//需要腿 
	private Leg leg; 
	
	public void showInfo() { 
		System.out.println("这是一张桌子，信息为："); 
		System.out.println(this.desktop.getInfo()); 
		System.out.println(this.leg.getLegInfo()); 
		System.out.println(); 
	} 
	
	public Desktop getDesktop() { return desktop; } 
	
	public void setDesktop(Desktop desktop) { this.desktop = desktop; }
	
	public Leg getLeg() { return leg; } 
	public void setLeg(Leg leg) {
		this.leg = leg; 
	} 
} 
//------------------------------------------------------------------------------- TestDesk.java ------------------------------------------------------------------------------- 
// package com.octopus.interfaceoreinted1; 
//  class TestDesk { 
//	 public static void main(String[] args) { 
//		 Desk desk = new Desk();
//		 //装桌面子
//		 desk.setDesktop(new GlassDesktop()); 
//		 //腿 
//		 desk.setLeg(new WoodLeg()); 
//		 //输出信息 desk.showInfo(); 
//		 //接口化的好处：其实现类可以随时改变 
//		 desk.setDesktop(new WoodDesktop()); 
//		 desk.showInfo(); 
//	} 
//}

