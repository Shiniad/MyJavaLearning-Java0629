package myUtil;


/**
 * SELF �Զ��幤����
 * �ֽ�ת�����ߣ����ֽ�/�ֽ�����תΪ16������(�ַ�����ʽ)
 * @author ��
 */
public class ByteArrayUtil {
	
	public static String byteToHex(byte b) {
		String hex = Integer.toHexString(b & 0xFF);// ��b�볣��(1111 1111)sub2���������㣬��ͷ�����ֽڵ����λ��ֵ��Ϊ0
		if(hex.length() < 2) {
			hex = "0" + hex;// ��Ǹ�λ����Ϊ16������
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
