package java0702.responsibilitychain;

/**
 * 责任链的实现
 * @author Administrator
 *
 */
public class StringProcessor {
	public static int MAX_CHAIN = 100;
	
	/**
	 * 当前责任链的有效长度
	 */
	private int currentIndex = 0;
	
	/**
	 * 整个链条
	 */
	public Chain[] chains = new Chain[MAX_CHAIN];
	
	/**
	 * 直接传递要处理的环节的构建
	 * @param chains
	 */
	public StringProcessor(Chain... chains) {// ...表示任意参数传入
		for (int i = 0; i < chains.length; i++) {
			this.chains[currentIndex++] = chains[i];
		}
	}
	
	/**
	 * 动态添加链条
	 * @param chain
	 */
	public void addChain(Chain chain) {
		if(currentIndex<MAX_CHAIN) {
			this.chains[currentIndex++] = chain;
		} else {
			// 动态扩容
			Chain[] temp = this.chains;
			this.chains = new Chain[currentIndex*2];
			System.arraycopy(temp, 0, this.chains, 0, temp.length);
			MAX_CHAIN = currentIndex*2;
			this.chains[currentIndex++] = chain;
		}
	}
	
	/**
	 * 核心方法，链条可以变，利用链条处理文字
	 */
	public String process(String content) {
		Request req = new Request(content);
		Response resp = new Response();
		for (int i = 0; i < currentIndex; i++) {
			Chain chain = this.chains[i];
			boolean doChain = chain.doChain(req, resp);
			if(!doChain) {
				break;// 任何一个链条都有权中断责任链模式
			}
			req = new Request(resp.getResponse());// 必须要对参数req重新赋值传递链
		}
		return resp.getResponse();
	}
	
}







