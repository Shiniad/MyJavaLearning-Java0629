package myUtil;


/**
 * SELF 自定义工具类
 * 字节转换工具，将字节/字节数组转为16进制数(字符串格式)
 * @author 宏
 */
public class ByteArrayUtil {
	
	public static String byteToHex(byte b) {
		String hex = Integer.toHexString(b & 0xFF);// 将b与常数(1111 1111)sub2进行与运算，将头三个字节的随机位的值定为0
		if(hex.length() < 2) {
			hex = "0" + hex;// 标记个位整数为16进制数
		}
		return hex;
	}
	
	public static String bytesToHex(byte[] b) {
		StringBuffer sb = new StringBuffer();
		String str = "";
		for (byte c : b) {
			str = byteToHex(c);
			sb.append(str);
		}
		return new String(sb);
	}
}
