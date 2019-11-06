package java0929_����_ע��;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

/**
 * ��ʾ�����DES����
 * @author Administrator
 *
 */
public class EncryptoDemo {
	public static void main(String[] args) {
		String content = "myDesSecret";
		String password = "wordiscovered";// ������ʹ�þ�̬�仯�����ݵ�������֤��
		
		byte[] contentByte = content.getBytes();// ת���ֽ�����
		byte[] passwordByte = password.getBytes();
		
		try {
			// ����������ת�ɹ淶������֤��
			DESKeySpec key = new DESKeySpec(passwordByte);// ���������ṩ��
			SecretKeyFactory factory = SecretKeyFactory.getInstance("DES");// ����֤����������
			SecretKey secretKey = factory.generateSecret(key);// ��������֤��
			
			// ���ܣ�����Կ�׼�������
			Cipher cipher = Cipher.getInstance("DES");
			cipher.init(Cipher.ENCRYPT_MODE, secretKey);// ������� ����/����
			byte[] result = cipher.doFinal(contentByte);// �������ܵĶ������ı�
			
			// �����Ҫ��byte����ת���ַ����������ʹ��Base64���룬��������ת����
			String contentResult = Base64.getEncoder().encodeToString(result);// ʹ��Base64���������ܣ�����������ݿ�
			System.out.println("Base64��ԿΪ��" + contentResult);
			
			// ����
			Cipher cipher2 = Cipher.getInstance("DES");
			cipher2.init(Cipher.DECRYPT_MODE, secretKey);
			byte[] result1 = cipher2.doFinal(result);
			System.out.println(new String(result1));
			
		} catch (InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | NoSuchPaddingException | IllegalBlockSizeException | BadPaddingException e) {
			e.printStackTrace();
		}
		
	}	
}









