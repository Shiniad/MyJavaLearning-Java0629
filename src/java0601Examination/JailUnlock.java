package java0601Examination;


/**
 * ������������ı����ƽ� 
ĳ������100���η�������100�������������������£��ͷŲ�����������������Ϊ��
������˳���Ŷ�վ�ã�ÿ���������β���һ���Լ���������������η��������ԭ������Ϊ�򿪣���رգ���������� 
�����һ������������е��η��ŵ��������ڶ���������ر�2��4...��100���η������� ʹ�ó�����������Щ������˻ᱻ�ͷš�
 */

public class JailUnlock {
	//���������ı����ƽ�����
	
	public static void main(String[] args) {
		JailLock[] jl = new JailLock[100];
		
		//��ʼ�����飬��ʼ״̬Ϊ�ر�
		for(int i=0; i<jl.length; i++) {
			jl[i] = JailLock.Lock;
		}
		
		//���㷨�߼����������״̬
		for(int i=1; i<=jl.length; i++) {
			//i��ʾ����
			for(int j=1;j<=((jl.length-1)/i+1);j++) {
				//i*(j-1)��ʾ����ɸ���״̬�ķ�����
				//  a.n = i*n,  a.n-1 = i*(n-1),  0<=a.n-1<=99
				jl[i*(j-1)] = jl[0].key(jl[i*(j-1)]);
			}
		}
		
		//�������飬���������������ӡ��
		System.out.print("��");
		boolean b = false;
		for(int i=0; i<jl.length; i++) {
			if(jl[i].equals(JailLock.UnLock)) {
				if(b) System.out.print(","); else b = true;
				System.out.print(i);
			}
		}
		System.out.print("�����˽����ͷ�");

	}

}

enum JailLock {
	//������������״̬���رպͿ���
	Lock, UnLock;
	
	public JailLock key(JailLock k) {
		//����������Ϊ��������ر��������رյ���������
		if(k.equals(Lock)) {
			return JailLock.UnLock;
		} else {
			return JailLock.Lock;
		}
	}
}


