package java0614;

public class IdentifyCode {

	public static void main(String[] args) {
		//65-90 97-122
		char[] randomLetter = new char[4];
		for (int i = 0; i < 5; i++) {
			//将生成的四个随机英文单词组成字符数组
			for (int j = 0; j < 4; j++) {
				boolean isLorU = Math.random()>=0.5;// 决定生成的是大写字母还是小写字母
				randomLetter[j] = (char)( (int)(Math.random() * 26) + (isLorU?65:97) );// 生成一个随机的英文字母
			}
			
			String str = String.valueOf(randomLetter);// 字符数组转化为字符串
			System.out.println("第" + (i+1) + "次产生的随机码:" + str);
		}
	}
}
