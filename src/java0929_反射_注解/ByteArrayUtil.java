package java0929_反射_注解;

/**
 * SELF 自定义工具类
 * 字节转换工具
 *
 */
public class ByteArrayUtil {
	
	public static String byteToHex(byte b) {
		String hex = Integer.toHexString(b & 0xFF);// 将b与常数(1111 1111)sub2进行与运算，去除头三个字节的随机位
		if(hex.length() < 2) {
			hex = "0" + hex;// 标记个位整数为16进制数
		}
		return hex;
	}
	
	public static String bytesToHex(byte[] b) {
		StringBuffer sb = new StringBuffer();
		String str = "";
		for (byte c : b) {
			str = Integer.toHexString(c & 0xFF);
			sb.append(str);
		}
		return new String(sb);
	}
}
