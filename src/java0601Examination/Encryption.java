package java0601Examination;

import java.util.Arrays;

public class Encryption {
	// ���ݼ��ܣ�����ʵۿ����ڴ���ʱ����ʹ�ù����·������ܾ����鱨��

	public static void main(String[] args) {
		// �㷨����
		int key;
		key = 9;
		char[] cipher = "Ihaveasecret".toCharArray();

		System.out.print("����ǰ����Ϊ:");
		for (char c : cipher) {
			System.out.print(c);
		}

		System.out.print("\n���ܺ�����Ϊ:");
		char[] encipher = new char[cipher.length];
		for (int i = 0; i < cipher.length; i++) {
			// Сд��ĸ����
			if (cipher[i] <= 122 && cipher[i] >= 97) {
				encipher[i] = (char) (cipher[i] + key);
				if (encipher[i] > 122) {
					encipher[i] -= 26;
				}
			}
			// ��д��ĸ����
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

		// �㷨����
		int ukey = 0;
		char[] mycipher = new char[encipher.length];
		for(ukey = 0; ukey <= 26; ukey++) {
			for (int i = 0; i < cipher.length; i++) {
				// Сд��ĸ����
				if (encipher[i] <= 122 && encipher[i] >= 97) {
					mycipher[i] = (char) (encipher[i] - ukey);
					if (mycipher[i] < 97) {
						mycipher[i] += 26;
					}
				}
				// ��д��ĸ����
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
		
		System.out.print("\n����Ϊ:" + ukey + ", �ƽ������Ϊ:");
		for (char c : mycipher) {
			System.out.print(c);
		}	
		
	}

}
