package java0702.responsibilitychain;

/**
 * 一个处理环节的抽象
 * @author Administrator
 *
 */
public interface Chain {
	/**
	 * 处理方法-对请求的字符串进行相应的逻辑处理并做出响应
	 * @param req 发出请求
	 * @param resp 响应结果
	 * @return 
	 */
	public boolean doChain(Request req, Response resp);
}
