package javase;

public class Print {

	
	public static void main(String[] args) {
		String s = "Al99oha";
		char[] c = s.toCharArray();
		Print op = new Print();
		for(int i=0;i<s.length();i++) {
			System.out.print(op.IsStr(c[i]) + " ");
			System.out.print(op.IsNum(c[i]));
			System.out.println("");
		}
		
	}
	
	public boolean IsStr(char ch) {
		if(ch>='A' && ch<='z' || ch>='a' && ch<='z') {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean IsNum(char ch) {
		if(Character.isDigit(ch)) {
			return true;
		} else {
			return false;
		}
	}
}
