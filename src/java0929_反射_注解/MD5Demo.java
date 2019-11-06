package java0929_反射_注解;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;

public class MD5Demo {
	public static void main(String[] args) {
		try {
//			String salt = "isSecret";
			// 再进一步增强安全：随机盐
			SecureRandom random = new SecureRandom();
			String salt = String.valueOf(random.nextDouble());// 每个帐户对应的随机盐也必须存入数据库
			// MD5 16字节 | SHA1 20字节
			MessageDigest md = MessageDigest.getInstance("SHA1");
			
			String password = "iamunknown";
			
			System.out.println(password + salt);
			byte[] digest = md.digest((password + salt).getBytes());// 单向散列算法
			System.out.println(Arrays.toString(digest));
			System.out.println(ByteArrayUtil.bytesToHex(digest));
		} catch (NoSuchAlgorithmException e) {
			// XXX Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
