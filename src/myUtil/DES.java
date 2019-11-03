package myUtil;

import java.security.SecureRandom;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;


/**
 * 
 * SELF �Զ��幤����
 * ����DES����
 * @author ��
 */
public class DES {
	
	// ����
	public static String encrypt(String content, String password) {
		byte[] contentByte = content.getBytes();
		byte[] passwordByte = password.getBytes();
		SecureRandom random = new SecureRandom();
		
		try {
			// ��������֤��
			DESKeySpec key = new DESKeySpec(passwordByte);
			SecretKeyFactory factory = SecretKeyFactory.getInstance("DES");
			SecretKey secretKey = factory.generateSecret(key);
			// ʹ��֤�����
			Cipher cipher = Cipher.getInstance("DES");
			cipher.init(Cipher.ENCRYPT_MODE, secretKey, random);// ���ò���
			byte[] result = cipher.doFinal(contentByte);
			// Base64����,���������ļ�ת���ַ�����ʽ
			String contentResult = Base64.getEncoder().encodeToString(result);
			
			return contentResult;
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	// ����
	public static byte[] decrypt(String password, byte[] result) {
		byte[] passwordByte = password.getBytes();
		SecureRandom random = new SecureRandom();
		
		try {
			// ��������֤��
			DESKeySpec key = new DESKeySpec(passwordByte);
			SecretKeyFactory factory = SecretKeyFactory.getInstance("DES");
			SecretKey secretKey = factory.generateSecret(key);
			
			// ����
			Cipher decipher = Cipher.getInstance("DES");
			decipher.init(Cipher.DECRYPT_MODE, secretKey, random);
			byte[] de_result = decipher.doFinal(result);
			
			return de_result;
				
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	// ����2
	public static byte[] decrypt(String password, String contentResult) {
		byte[] passwordByte = password.getBytes();
		byte[] result = Base64.getDecoder().decode(contentResult);
		SecureRandom random = new SecureRandom();
		
		try {
			// ��������֤��
			DESKeySpec key = new DESKeySpec(passwordByte);
			SecretKeyFactory factory = SecretKeyFactory.getInstance("DES");
			SecretKey secretKey = factory.generateSecret(key);
			
			// ����
			Cipher decipher = Cipher.getInstance("DES");
			decipher.init(Cipher.DECRYPT_MODE, secretKey, random);
			byte[] de_result = decipher.doFinal(result);
			
			return de_result;
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static void main(String[] args) throws Exception {
		String content = "123456";
		String password = "UnkonwnSecret";// ��������
		
		String contentResult = encrypt(content, password);
		System.out.println("���ܺ���ı���" + contentResult);
	
		if(contentResult!=null) {
			byte[] myByte = decrypt(password, contentResult);
			System.out.println("���ܺ���ı���" + new String(myByte));
		}
		
		
//		// ��������֤��
//		DESKeySpec key = new DESKeySpec(password.getBytes());
//		SecretKeyFactory factory = SecretKeyFactory.getInstance("DES");
//		SecretKey secretKey = factory.generateSecret(key);// ����������תΪ��Կ֤��
//		// ʹ��֤�����
//		Cipher cipher = Cipher.getInstance("DES");
//		cipher.init(Cipher.ENCRYPT_MODE, secretKey);
//		byte[] result = cipher.doFinal(content.getBytes());
//		// Base64ת��
//		String base64Result = Base64.getEncoder().encodeToString(result);
	}

}
