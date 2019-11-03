package java0627;

import java.util.Arrays;

public class TestUDisk {
	public static void main(String[] args) {
		Usb udisk = new UDisk(); 
		udisk.init();
		byte[] data = new byte[] {1,2,3,4,5,6};
		udisk.write(data, 0);
		byte[] readData = udisk.read(0, 6);
		System.out.println("从U盘中读取到的数据为:" + Arrays.toString(readData));
	}
}
