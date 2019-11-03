package java0627.desk;

public class Desk {
	public DeskTop dt;
	public final int SIZE = 4;// ���Ƚӿڸ�����Ĭ��Ϊ4��
	public Legs[] leg = new LegImpl[SIZE];
	
	// ��װ����
	public void setLeg(Legs leg) {
		for (int i = 0; i < this.leg.length; i++) {
			if(this.dt !=null && this.leg[i]==null && leg!=null) {// Ҫ�������������������ϵ����Ƚӿ�Ϊ��
				if(this.dt.getDiagonalLineLen() == leg.getDiagonalLineLen()) {// Ҫ�����������ȵĽӿڴ�С�ǺϷ��ɰ�װ����
					this.leg[i] = leg;
					return ;
				}
			}
		}
	}
	
	// ��װ����
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
			return "������װ����\n���棺" + this.dt + "\n���ȣ�" + str;
		} else {
			return "������װʧ��";
		}
		
	}
	
	public static void main(String[] args) {
		Desk d = new Desk();
		
		DeskTop dt = new DeskTopImpl(100.0,2.0,3.0,"����������","��ľ");
		d.setDeskTop(dt);
		
		Legs[] leg = new LegImpl[4];
		leg[0] = new LegImpl(71.5,3.0,"�ľ");
		leg[1] = new LegImpl(71.5,3.0,"��ľ");
		leg[2] = new LegImpl(71.5,3.0,"��ľ");
		leg[3] = new LegImpl(71.5,3.0,"��ľ");
		for (Legs ileg : leg) {
			d.setLeg(ileg);
		}
		
		System.out.println(d);
	}
}
