package java0601;

public class EatPeach {
	//递归计算桃子数
	
	public int myPeach(int day) {
		if(day >= 10) {
			return 1;
		} 
		return ( myPeach(day+1) + 1 )*2;
	}
	
	public static void main(String[] args) {
		EatPeach e = new EatPeach();
		for(int i=1;i<=10;i++) {
			System.out.println("这是第" + i + "天,共有" +e.myPeach(i) + "只桃子");
		}
		System.out.println("原来共有" + e.myPeach(1) + "只桃子。");
	}

}
