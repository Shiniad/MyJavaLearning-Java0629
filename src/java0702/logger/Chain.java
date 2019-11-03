package java0702.logger;

public interface Chain {
	/**
	 * @param req
	 * @param resp
	 * @return
	 */
	public boolean doChain(Request req, Response resp);
}
