package java0601Examination;


/**
 * 监狱开锁问题的暴力破解 
某王国有100间牢房，正好100个狱吏，国王大赦天下，释放部分囚犯，操作规则为：
狱吏按顺序排队站好，每个狱吏依次操作一次自己的序号整数倍的牢房锁，如果原来的锁为打开，则关闭，否则打开锁。 
例如第一个狱吏会打开所有的牢房门的锁，而第二个狱吏则关闭2、4...、100号牢房的锁。 使用程序计算最后哪些房间的人会被释放。
 */

public class JailUnlock {
	//监狱开锁的暴力破解问题
	
	public static void main(String[] args) {
		JailLock[] jl = new JailLock[100];
		
		//初始化数组，初始状态为关闭
		for(int i=0; i<jl.length; i++) {
			jl[i] = JailLock.Lock;
		}
		
		//依算法逻辑更改数组的状态
		for(int i=1; i<=jl.length; i++) {
			//i表示狱卒
			for(int j=1;j<=((jl.length-1)/i+1);j++) {
				//i*(j-1)表示狱卒可更改状态的房间编号
				//  a.n = i*n,  a.n-1 = i*(n-1),  0<=a.n-1<=99
				jl[i*(j-1)] = jl[0].key(jl[i*(j-1)]);
			}
		}
		
		//遍历数组，将符合条件的项打印出
		System.out.print("第");
		boolean b = false;
		for(int i=0; i<jl.length; i++) {
			if(jl[i].equals(JailLock.UnLock)) {
				if(b) System.out.print(","); else b = true;
				System.out.print(i);
			}
		}
		System.out.print("名犯人将被释放");

	}

}

enum JailLock {
	//监狱锁的两种状态，关闭和开启
	Lock, UnLock;
	
	public JailLock key(JailLock k) {
		//若监狱的锁为开启的则关闭它，若关闭的则开启它。
		if(k.equals(Lock)) {
			return JailLock.UnLock;
		} else {
			return JailLock.Lock;
		}
	}
}


