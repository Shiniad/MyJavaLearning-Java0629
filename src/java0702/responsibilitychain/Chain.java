package java0702.responsibilitychain;

/**
 * һ�������ڵĳ���
 * @author Administrator
 *
 */
public interface Chain {
	/**
	 * ������-��������ַ���������Ӧ���߼�����������Ӧ
	 * @param req ��������
	 * @param resp ��Ӧ���
	 * @return 
	 */
	public boolean doChain(Request req, Response resp);
}
