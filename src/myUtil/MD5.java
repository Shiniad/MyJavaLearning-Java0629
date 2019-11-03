package myUtil;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/**
 * SELF �Զ�����
 * �����㷨 MD5/SHA1
 * @author ��
 *
 */
public class MD5 {
	public static String contentResult;
	public static String salt;
	
	public static void encrypt(String password) {
		MD5.contentResult = null;
		MD5.salt = null;
		
		SecureRandom random = new SecureRandom();
		String salt = String.valueOf(random.nextDouble());// �����
		
		String contentResult = null;
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] result = md.digest((password).getBytes());
			contentResult = ByteArrayUtil.bytesToHex(result);
			if(contentResult!=null && salt!=null) {
				MD5.contentResult = contentResult;
				MD5.salt = salt;
			}
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
	}
	
	public static boolean verification(String salt,String secretKey) {
		System.out.print("������������֤��");
		java.util.Scanner in = new java.util.Scanner(System.in);
		String password = in.nextLine();
		
		try {
			MessageDigest md = MessageDigest.getInstance("SHA1");
			byte[] result = md.digest((password+salt).getBytes());
			
			String contentResult = ByteArrayUtil.bytesToHex(result);
			if(contentResult.equals(secretKey)) {
				System.out.println("�������������ȷ��");
				in.close();
				return true;
			}
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		System.out.println("��������������");
		in.close();
		return false;
	}
	
	public static void main(String[] args) throws Exception {
		String password = "123456";
		
		encrypt(password);
		System.out.println("��ֵΪ��" + MD5.salt + ", ��ԿΪ��" + MD5.contentResult);
		
		while( !MD5.verification(MD5.salt, MD5.contentResult) ) {
			MD5.verification(MD5.salt, MD5.contentResult);
		}
		
//		MD5�ĺ���API
//		MessageDigest md = MessageDigest.getInstance("MD5");
//		byte[] result = md.digest(password.getBytes());
	}

	
	
}
