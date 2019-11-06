package java0929_反射_注解;

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
 * 演示经典的DES加密
 * @author Administrator
 *
 */
public class EncryptoDemo {
	public static void main(String[] args) {
		String content = "myDesSecret";
		String password = "wordiscovered";// 可以是使用静态变化的数据当作秘文证书
		
		byte[] contentByte = content.getBytes();// 转成字节数组
		byte[] passwordByte = password.getBytes();
		
		try {
			// 将明文密码转成规范的秘文证书
			DESKeySpec key = new DESKeySpec(passwordByte);// 加密密码提供类
			SecretKeyFactory factory = SecretKeyFactory.getInstance("DES");// 秘文证书生产工厂
			SecretKey secretKey = factory.generateSecret(key);// 生成秘文证书
			
			// 加密，利用钥匙加密数据
			Cipher cipher = Cipher.getInstance("DES");
			cipher.init(Cipher.ENCRYPT_MODE, secretKey);// 添加配置 加密/解密
			byte[] result = cipher.doFinal(contentByte);// 经过加密的二进制文本
			
			// 如果需要将byte数组转成字符串，则可以使用Base64编码，将二进制转文体
			String contentResult = Base64.getEncoder().encodeToString(result);// 使用Base64加密器加密，方便存入数据库
			System.out.println("Base64密钥为：" + contentResult);
			
			// 解密
			Cipher cipher2 = Cipher.getInstance("DES");
			cipher2.init(Cipher.DECRYPT_MODE, secretKey);
			byte[] result1 = cipher2.doFinal(result);
			System.out.println(new String(result1));
			
		} catch (InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | NoSuchPaddingException | IllegalBlockSizeException | BadPaddingException e) {
			e.printStackTrace();
		}
		
	}	
}









