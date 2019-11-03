package java0702.adapter;
/**
 * �ṹ��ģʽ
 * @author Administrator
 *
 */
public class TF2SDAdapter implements TFCardInterface {
	private  SDCard sd;
	
	public TF2SDAdapter(SDCard card) {
		this.sd = card;
	}

	@Override
	public int readData() {
		return sd.read();
	}

	@Override
	public int writeData() {
		return sd.write();
	}
	
	public static void main(String[] args) {
		SDCard sd = new SDCard();
		// Ҫֱ��д�ӿ�
		TFCardInterface sdAdapter = new TF2SDAdapter(sd);
		sdAdapter.writeData();
		sdAdapter.readData();
		
	}
}
