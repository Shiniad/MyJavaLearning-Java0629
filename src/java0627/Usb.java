package java0627;


public interface Usb {// 接口的修饰符必须是public 
	
	/**
	 * 初始化U盘
	 */
	public void init();
	
	/**
	 * 读取数据
	 * @param startIndex 开始索引，从0开始
	 * @param length 读取长度
	 * @return
	 */
	byte[] read(int startIndex, int length);

	/**
	 * 写入数据
	 * @param data 要写入的数据
	 * @param startIndex 开始索引，从0开始
	 * @return
	 */
	int write(byte[] data, int startIndex);

	public default void close() {
		System.out.println("语法糖：接口默认实现，不用再为接口的方法写具体实现");
	};
	
	/**
	 * 针脚4
	 */
	public static final int PIN_COUNT = 4;
	
	/**
	 * 电压5V
	 */
	double VOTAGE = 5;
	
	public static void usbShowInfo() {
		System.out.println("1.8支持静态方法");
	}
}
