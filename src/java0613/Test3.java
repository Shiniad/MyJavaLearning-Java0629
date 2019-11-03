package java0613;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Test3 {

	public static void main(String[] args) {
		System.out.println((int)(0.997 * 100));
		
		//高精度浮点数运算
		BigDecimal big1 = BigDecimal.valueOf(0.92867516678796);
		BigDecimal big2 = BigDecimal.valueOf(0.865453345666);
		big1 = big1.multiply(big2);
		System.out.println(big1);

		
		//高精度整数运算
		BigInteger num1 = BigInteger.valueOf(15687945612687633L);
		BigInteger num2 = BigInteger.valueOf(56489716563468963L);
		num1 = num1.multiply(num2);
		System.out.println(num1);
		
		//
		BigDecimal big4 = BigDecimal.valueOf(10);
		BigDecimal big5 = new BigDecimal(3);
		big4 = big4.divide(big5,30,BigDecimal.ROUND_HALF_UP);
		System.out.println(big4);
		
		for (int i = 65; i < 123; i++) {
			System.out.print((char)i + ":" + i + " ");
		}
	}
}
