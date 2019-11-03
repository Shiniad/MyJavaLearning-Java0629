package java0601Examination;

import java.util.Arrays;

public class Encryption {
	// 数据加密，罗马皇帝凯撒在打仗时曾经使用过以下方法加密军事情报：

	public static void main(String[] args) {
		// 算法加密
		int key;
		key = 9;
		char[] cipher = "Ihaveasecret".toCharArray();

		System.out.print("加密前内容为:");
		for (char c : cipher) {
			System.out.print(c);
		}

		System.out.print("\n加密后内容为:");
		char[] encipher = new char[cipher.length];
		for (int i = 0; i < cipher.length; i++) {
			// 小写字母加密
			if (cipher[i] <= 122 && cipher[i] >= 97) {
				encipher[i] = (char) (cipher[i] + key);
				if (encipher[i] > 122) {
					encipher[i] -= 26;
				}
			}
			// 大写字母加密
			if(cipher[i] <=90 && cipher[i] >= 65) {
				encipher[i] = (char) (cipher[i] + key);
				if (cipher[i] > 90) {
					encipher[i] -= 26;
				}
			}
		}
		for (char c2 : encipher) {
			System.out.print(c2);
		}
		System.out.println();

		// 算法解密
		int ukey = 0;
		char[] mycipher = new char[encipher.length];
		for(ukey = 0; ukey <= 26; ukey++) {
			for (int i = 0; i < cipher.length; i++) {
				// 小写字母解密
				if (encipher[i] <= 122 && encipher[i] >= 97) {
					mycipher[i] = (char) (encipher[i] - ukey);
					if (mycipher[i] < 97) {
						mycipher[i] += 26;
					}
				}
				// 大写字母解密
				if(encipher[i] <=90 && encipher[i] >= 65) {
					mycipher[i] = (char) (encipher[i] - ukey);
					if (mycipher[i] < 65) {
						mycipher[i] += 26;
					}
				}
			}
			if(Arrays.equals(mycipher, cipher)) {
				break;
			}
		}
		
		System.out.print("\n密码为:" + ukey + ", 破解的内容为:");
		for (char c : mycipher) {
			System.out.print(c);
		}	
		
	}

}
