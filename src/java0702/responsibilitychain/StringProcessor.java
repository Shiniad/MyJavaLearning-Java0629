package java0702.responsibilitychain;

/**
 * ��������ʵ��
 * @author Administrator
 *
 */
public class StringProcessor {
	public static int MAX_CHAIN = 100;
	
	/**
	 * ��ǰ����������Ч����
	 */
	private int currentIndex = 0;
	
	/**
	 * ��������
	 */
	public Chain[] chains = new Chain[MAX_CHAIN];
	
	/**
	 * ֱ�Ӵ���Ҫ����Ļ��ڵĹ���
	 * @param chains
	 */
	public StringProcessor(Chain... chains) {// ...��ʾ�����������
		for (int i = 0; i < chains.length; i++) {
			this.chains[currentIndex++] = chains[i];
		}
	}
	
	/**
	 * ��̬�������
	 * @param chain
	 */
	public void addChain(Chain chain) {
		if(currentIndex<MAX_CHAIN) {
			this.chains[currentIndex++] = chain;
		} else {
			// ��̬����
			Chain[] temp = this.chains;
			this.chains = new Chain[currentIndex*2];
			System.arraycopy(temp, 0, this.chains, 0, temp.length);
			MAX_CHAIN = currentIndex*2;
			this.chains[currentIndex++] = chain;
		}
	}
	
	/**
	 * ���ķ������������Ա䣬����������������
	 */
	public String process(String content) {
		Request req = new Request(content);
		Response resp = new Response();
		for (int i = 0; i < currentIndex; i++) {
			Chain chain = this.chains[i];
			boolean doChain = chain.doChain(req, resp);
			if(!doChain) {
				break;// �κ�һ����������Ȩ�ж�������ģʽ
			}
			req = new Request(resp.getResponse());// ����Ҫ�Բ���req���¸�ֵ������
		}
		return resp.getResponse();
	}
	
}







