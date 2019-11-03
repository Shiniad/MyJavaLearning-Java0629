package java0604;

public class HannuoiTower {
	
	public void Hannuoi(int n, String A,String B, String C) {
		if(n == 1) {
			System.out.println("将圆盘" + n + "从" + A + "移动到" + C);
		} else {
			//先将n-1个盘移动到临时盘上
			Hannuoi(n-1,A,C,B);
			//最大的只需要挪动一次(不影响游规则)
			System.out.println("将圆盘" + n + "从" + A + "移动到" + C);
			//将n-1个盘移动回来
			Hannuoi(n-1,B,A,C);
		}
	}
	public static void main(String[] args) {
		String A = "A";
		String B = "B";
		String C = "C";
		HannuoiTower ht = new HannuoiTower();
		ht.Hannuoi(4, A, B, C);
	}
}
