package java0929_����_ע��;

/**
 * SELF �Զ��幤����
 * �ֽ�ת������
 *
 */
public class ByteArrayUtil {
	
	public static String byteToHex(byte b) {
		String hex = Integer.toHexString(b & 0xFF);// ��b�볣��(1111 1111)sub2���������㣬ȥ��ͷ�����ֽڵ����λ
		if(hex.length() < 2) {
			hex = "0" + hex;// ��Ǹ�λ����Ϊ16������
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
