package myUtil;

import java.security.SecureRandom;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;


/**
 * 
 * SELF 自定义工具类
 * 经典DES加密
 * @author 宏
 */
public class DES {
	
	// 加密
	public static String encrypt(String content, String password) {
		byte[] contentByte = content.getBytes();
		byte[] passwordByte = password.getBytes();
		SecureRandom random = new SecureRandom();
		
		try {
			// 生成秘文证书
			DESKeySpec key = new DESKeySpec(passwordByte);
			SecretKeyFactory factory = SecretKeyFactory.getInstance("DES");
			SecretKey secretKey = factory.generateSecret(key);
			// 使用证书加密
			Cipher cipher = Cipher.getInstance("DES");
			cipher.init(Cipher.ENCRYPT_MODE, secretKey, random);// 配置参数
			byte[] result = cipher.doFinal(contentByte);
			// Base64加密,将二进制文件转成字符串格式
			String contentResult = Base64.getEncoder().encodeToString(result);
			
			return contentResult;
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	// 解密
	public static byte[] decrypt(String password, byte[] result) {
		byte[] passwordByte = password.getBytes();
		SecureRandom random = new SecureRandom();
		
		try {
			// 生成秘文证书
			DESKeySpec key = new DESKeySpec(passwordByte);
			SecretKeyFactory factory = SecretKeyFactory.getInstance("DES");
			SecretKey secretKey = factory.generateSecret(key);
			
			// 解密
			Cipher decipher = Cipher.getInstance("DES");
			decipher.init(Cipher.DECRYPT_MODE, secretKey, random);
			byte[] de_result = decipher.doFinal(result);
			
			return de_result;
				
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	// 解密2
	public static byte[] decrypt(String password, String contentResult) {
		byte[] passwordByte = password.getBytes();
		byte[] result = Base64.getDecoder().decode(contentResult);
		SecureRandom random = new SecureRandom();
		
		try {
			// 生成秘文证书
			DESKeySpec key = new DESKeySpec(passwordByte);
			SecretKeyFactory factory = SecretKeyFactory.getInstance("DES");
			SecretKey secretKey = factory.generateSecret(key);
			
			// 解密
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
		String password = "UnkonwnSecret";// 明文密码
		
		String contentResult = encrypt(content, password);
		System.out.println("加密后的文本：" + contentResult);
	
		if(contentResult!=null) {
			byte[] myByte = decrypt(password, contentResult);
			System.out.println("解密后的文本：" + new String(myByte));
		}
		
		
//		// 生成秘文证书
//		DESKeySpec key = new DESKeySpec(password.getBytes());
//		SecretKeyFactory factory = SecretKeyFactory.getInstance("DES");
//		SecretKey secretKey = factory.generateSecret(key);// 将明文密码转为秘钥证书
//		// 使用证书加密
//		Cipher cipher = Cipher.getInstance("DES");
//		cipher.init(Cipher.ENCRYPT_MODE, secretKey);
//		byte[] result = cipher.doFinal(content.getBytes());
//		// Base64转码
//		String base64Result = Base64.getEncoder().encodeToString(result);
	}

}
