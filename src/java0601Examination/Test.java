package java0601Examination;

import java.util.Arrays;
import java.util.Scanner;
/**
 * 1.声明某个类型的数组变量
 * 2.创建数组
 * 3.数组初始化
 * 4.对数组进行取值和操作
 * 1.声明数组（声明某个类型的数组变量）
2.分配空间（创建数组）
3.赋值（数组初始化）
4.处理数据（对数组进行取值和操作）
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
		int[] a = new int[] {3,9,5,7,6};
		int[] b = new int[5];//b和a都指向new int[] {1,2};
		System.arraycopy(a, 0, b, 0, a.length);
		b[0] = 14;
		int index1 = Arrays.binarySearch(a,5);  //数组的二分查找法，要求数组必须有序
		System.out.println(index1);
		
		//数组排序
		int[] arr1 = new int[] {6,3,15,19,11,34,};
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		
		//将数组倒序输出
		int[] numbers3 = {2,3,5,9,7};
		for( int i=0; i<numbers3.length/2; i++ ) {
			int temp = numbers3[i];
			numbers3[i] = numbers3[numbers3.length-i-1];
			numbers3[numbers3.length-i-1] = temp;
		}
		System.out.println(Arrays.toString(numbers3));
		
		//将数组打乱
		String[] str = {"A","B","C","D","E"};
		for(int i=0;i<str.length;i++) {
			int index = (int)(Math.random() * str.length);
			String temp = str[0];
			str[0] = str[index];
			str[index] = temp;
		}
		System.out.println(Arrays.toString(str));
		
		//查找数组元素
		String toFind = "F";
		int index2 = -1;
		for(int i=0;i<str.length;i++) {
			if(toFind.equals(str[i])) {
				index2 = i;
				break;
			}
		}
		System.out.println(index2);
		
		//替换数组元素
		
		//数组元素的插入和删除
		int[] buffer = new int[100];//定义缓冲区
		int mylength = 0;
		Scanner scn = new Scanner(System.in);
		for( int i=0; i<5; i++ ) {
			System.out.println("请输入一数字:");
			buffer[mylength++] = scn.nextInt();//数组元素的追加
		}
		//输出
		for( int i=0; i<mylength; i++ ) {
			System.out.println(buffer[i]);
		}
		//删除元素
		int index = -1;
		System.out.print("请输入要删除的元素:");
		index = scn.nextInt();
		for( int i=0; i<mylength; i++ ) {
			if(i==index) {
				mylength--;
				for( int j=i; j<mylength; j++ ) {
					buffer[j] = buffer[j+1];
				}
			}
		}
		scn.close();
	}

}





