package java0702.adapter;

public class TFAdapter extends SDCard implements TFCardInterface {

	@Override
	public int readData() {
		return read();
	}

	@Override
	public int writeData() {
		return write();
	}
	public static void main(String[] args) {
		TFCardInterface tf = new TFAdapter();
		tf.readData();
		tf.writeData();
	}
}
