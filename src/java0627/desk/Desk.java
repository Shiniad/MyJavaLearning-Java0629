package java0627.desk;

public class Desk {
	public DeskTop dt;
	public final int SIZE = 4;// 桌腿接口个数，默认为4个
	public Legs[] leg = new LegImpl[SIZE];
	
	// 安装桌腿
	public void setLeg(Legs leg) {
		for (int i = 0; i < this.leg.length; i++) {
			if(this.dt !=null && this.leg[i]==null && leg!=null) {// 要求至少有桌面且桌面上的桌腿接口为空
				if(this.dt.getDiagonalLineLen() == leg.getDiagonalLineLen()) {// 要求桌面与桌腿的接口大小吻合方可安装桌腿
					this.leg[i] = leg;
					return ;
				}
			}
		}
	}
	
	// 安装桌面
	public void setDeskTop(DeskTop dt) {
		this.dt = dt;
	}
	
	public String toString() {
		String str = "";
		for (int i = 0; i < this.leg.length; i++) {
			if(leg[i]!=null) {
				str += leg[i] + "\n";
			}
		}
		int len = 0;
		for (Legs ileg : this.leg) {
			if(ileg!=null) {
				len++;
			}
		}
		if(len == SIZE) {
			return "桌子组装好了\n桌面：" + this.dt + "\n桌腿：" + str;
		} else {
			return "桌子组装失败";
		}
		
	}
	
	public static void main(String[] args) {
		Desk d = new Desk();
		
		DeskTop dt = new DeskTopImpl(100.0,2.0,3.0,"正方形桌面","橡木");
		d.setDeskTop(dt);
		
		Legs[] leg = new LegImpl[4];
		leg[0] = new LegImpl(71.5,3.0,"楠木");
		leg[1] = new LegImpl(71.5,3.0,"橡木");
		leg[2] = new LegImpl(71.5,3.0,"橡木");
		leg[3] = new LegImpl(71.5,3.0,"红木");
		for (Legs ileg : leg) {
			d.setLeg(ileg);
		}
		
		System.out.println(d);
	}
}
