package java0929_����_ע��;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;

public class MD5Demo {
	public static void main(String[] args) {
		try {
//			String salt = "isSecret";
			// �ٽ�һ����ǿ��ȫ�������
			SecureRandom random = new SecureRandom();
			String salt = String.valueOf(random.nextDouble());// ÿ���ʻ���Ӧ�������Ҳ����������ݿ�
			// MD5 16�ֽ� | SHA1 20�ֽ�
			MessageDigest md = MessageDigest.getInstance("SHA1");
			
			String password = "iamunknown";
			
			System.out.println(password + salt);
			byte[] digest = md.digest((password + salt).getBytes());// ����ɢ���㷨
			System.out.println(Arrays.toString(digest));
			System.out.println(ByteArrayUtil.bytesToHex(digest));
		} catch (NoSuchAlgorithmException e) {
			// XXX Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
