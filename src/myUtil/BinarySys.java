package myUtil;

/**
 * SELF
 * 将其它整数转为二进制数
 * @author Administrator
 *
 */
public class BinarySys {
	
	public static void main(String[] args) {
		short x = 0;
		System.out.println(toBinary(x));
	}

	public static String addBlank(String str) {
		char[] ch = str.toCharArray();
		
		StringBuffer sb = new StringBuffer("");
		for (int i = 0; i < ch.length; i++) {
			if(i%4 == 0 && i != 0) {
				sb.append(" ");
			}
			sb.append(ch[i]);
		}
		return new String(sb);
	}

	public static String toBinary(byte x) {
		byte typeLength = Byte.MAX_VALUE;
		int count = 0;
		do {
			count++;
		} while( (typeLength>>=1) > 0);
		
		StringBuffer sb = new StringBuffer("");
		if(x >= 0) {
			sb.append("0");
		}
		else {
			x = (byte) (-x);
			sb.append("1");
		}
		
		if(Integer.toBinaryString(x).length() < count) {
			for (int j = 0; j < count - Integer.toBinaryString(x).length(); j++) {
				sb.append("0");
			}
		}
		sb.append(Integer.toBinaryString(x));
		String str = addBlank(new String(sb));
		return str;
	}
	
	public static String toBinary(short x) {
		short typeLength = Short.MAX_VALUE;
		int count = 0;
		do {
			count++;
		} while( (typeLength>>=1) > 0);
		
		StringBuffer sb = new StringBuffer("");
		if(x >= 0) {
			sb.append("0");
		}
		else {
			x = (short) (-x);
			sb.append("1");
		}
		
		if(Integer.toBinaryString(x).length() < count) {
			for (int j = 0; j < count - Integer.toBinaryString(x).length(); j++) {
				sb.append("0");
			}
		}
		sb.append(Integer.toBinaryString(x));
		String str = addBlank(new String(sb));
		return str;
	}
	
	public static String toBinary(int x) {
		int typeLength = Integer.MAX_VALUE;
		int count = 0;
		do {
			count++;
		} while( (typeLength>>=1) > 0);
		
		StringBuffer sb = new StringBuffer("");
		if(x >= 0) {
			sb.append("0");
		}
		else {
			x = -x;
			sb.append("1");
		}
		
		if(Integer.toBinaryString(x).length() < count) {
			for (int j = 0; j < count - Integer.toBinaryString(x).length(); j++) {
				sb.append("0");
			}
		}
		sb.append(Integer.toBinaryString(x));
		String str = addBlank(new String(sb));
		return str;
	}
}
