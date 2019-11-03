package java0627;

/**
 * ��ҵ��
 * @author Administrator
 *
 */
public class Test {

}
//-------------------------------------------------------------------------------Desktop.java-------------------------------------------------------------------------------package com.octopus.interfaceoreinted1;

/** * �������ӵĹ淶 * @author hw * */
 interface Desktop {
	/** * ��ȡ�������ӵ����� * @return */
	public String getInfo();
}
//-------------------------------------------------------------------------------GlassDesktop.java-------------------------------------------------------------------------------package com.octopus.interfaceoreinted1;

 class GlassDesktop implements Desktop {
	@Override
	public String getInfo() {
		return "����������";
	}
}
//-------------------------------------------------------------------------------WoodDesktop.java-------------------------------------------------------------------------------package com.octopus.interfaceoreinted1;

 class WoodDesktop implements Desktop {
	@Override
	public String getInfo() {
		return "ľͷ������";
	}
}
//-------------------------------------------------------------------------------Leg.java-------------------------------------------------------------------------------package com.octopus.interfaceoreinted1;

/** * �ȵĹ淶 * @author hw * */
 interface Leg {
	public String getLegInfo();
}
//-------------------------------------------------------------------------------GlassLeg.java-------------------------------------------------------------------------------package com.octopus.interfaceoreinted1;

 class GlassLeg implements Leg {
	@Override
	public String getLegInfo() {
		return "������";
	}
}
//-------------------------------------------------------------------------------WoodLeg.java-------------------------------------------------------------------------------package com.octopus.interfaceoreinted1;

 class WoodLeg implements Leg {
	@Override
	public String getLegInfo() {
		return "ľͷ��";
	}
}
//-------------------------------------------------------------------------------Desk.java-------------------------------------------------------------------------------package com.octopus.interfaceoreinted1;

/** * ���� * @author hw * */ 
 class Desk { 
	//��Ҫ������ 
	private Desktop desktop; 
	//��Ҫ�� 
	private Leg leg; 
	
	public void showInfo() { 
		System.out.println("����һ�����ӣ���ϢΪ��"); 
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
//		 //װ������
//		 desk.setDesktop(new GlassDesktop()); 
//		 //�� 
//		 desk.setLeg(new WoodLeg()); 
//		 //�����Ϣ desk.showInfo(); 
//		 //�ӿڻ��ĺô�����ʵ���������ʱ�ı� 
//		 desk.setDesktop(new WoodDesktop()); 
//		 desk.showInfo(); 
//	} 
//}

