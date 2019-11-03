package java0702.adapter;
/**
 * 结构型模式
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
		// 要直接写接口
		TFCardInterface sdAdapter = new TF2SDAdapter(sd);
		sdAdapter.writeData();
		sdAdapter.readData();
		
	}
}
