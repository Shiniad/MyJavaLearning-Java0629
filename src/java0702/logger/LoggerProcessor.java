package java0702.logger;

import java.util.ArrayList;
import java.util.Iterator;


public class LoggerProcessor {
	private ArrayList<Chain> chains = new ArrayList<Chain>();
	
	public LoggerProcessor(Chain... chains) {
		for (Chain chain : chains) {
			this.chains.add(chain);
		}
	}
	public void addChain(Chain chain) {
		this.chains.add(chain);
	}
	
	public void processor(String content) {
		Request req = new RequestImpl(content);
		Response resp = new ResponseImpl();
		Iterator<Chain> iter = this.chains.iterator();
		while(iter.hasNext()) {
			Chain c = iter.next();
			boolean persistent = c.doChain(req, resp);
			if(!persistent) {
				break;
			}
			req = new RequestImpl(resp.getResponse());
		}
	}
	
	
}
