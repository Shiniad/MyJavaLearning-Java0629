package java0627;

public class UDisk implements Usb {
	private byte[] data = new byte[4096];// 4k存储空间的U盘

	@Override
	public void init() {
		
	}

	@Override
	public void close() {
		
	}

	@Override
	public int write(byte[] data,int startIndex) {// startIndex从0开始
		if(data!=null) {
			int len = data.length;
			if(startIndex + len > this.data.length) {
				len = this.data.length - startIndex;
			}
			System.arraycopy(data, 0, this.data, startIndex, len);
			return len;
		}
		return 0;
	}

	@Override
	public byte[] read(int startIndex, int len) {
		byte[] dataReturn = null;
		if(startIndex + len > data.length) {
			len = data.length - startIndex;
		}
		dataReturn = new byte[len];
		System.arraycopy(this.data, startIndex, dataReturn, 0, len);
		return dataReturn;
	}
	
	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

	
}
