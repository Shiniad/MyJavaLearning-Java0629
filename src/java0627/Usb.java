package java0627;


public interface Usb {// �ӿڵ����η�������public 
	
	/**
	 * ��ʼ��U��
	 */
	public void init();
	
	/**
	 * ��ȡ����
	 * @param startIndex ��ʼ��������0��ʼ
	 * @param length ��ȡ����
	 * @return
	 */
	byte[] read(int startIndex, int length);

	/**
	 * д������
	 * @param data Ҫд�������
	 * @param startIndex ��ʼ��������0��ʼ
	 * @return
	 */
	int write(byte[] data, int startIndex);

	public default void close() {
		System.out.println("�﷨�ǣ��ӿ�Ĭ��ʵ�֣�������Ϊ�ӿڵķ���д����ʵ��");
	};
	
	/**
	 * ���4
	 */
	public static final int PIN_COUNT = 4;
	
	/**
	 * ��ѹ5V
	 */
	double VOTAGE = 5;
	
	public static void usbShowInfo() {
		System.out.println("1.8֧�־�̬����");
	}
}
