package java0606;

public class PrintRhombus {
	
	public void printSomeThing(int length,boolean isStar) {
		//打印length长度的某个东西，isStar为真时打印星星，为假时打印空格
		if(isStar) {
			for (int i = 0; i < length; i++) {
				System.out.print("*");
			}
		} else {
			for (int i = 0; i < length; i++) {
				System.out.print(" ");
			}
		}
	}
	
	//打印星星
	public PrintRhombus(int size, int row) {
		//打印上半部分形状
		for (int i = 0; i < size; i++) {
			//在当前i行内打印row个something
			for (int k = 0; k < row; k++) {
				//输出当前第i行的星星数
				//输出size-i-1个空格
				printSomeThing(size-i-1,false);
				//输出2*i+1个星星
				printSomeThing(1+2*i,true);
				//输出size-i-1个空格
				printSomeThing(size-i-1,false);
			}
			System.out.println();
		}
	
			//打印下半部分形状
			for (int i = 0; i < size - 1; i++) {
				//在当前i行内打印row个something
				for (int k = 0; k < row; k++) {
					//输出当前第i行的星星数
					//输出i+1个空格
					printSomeThing(i+1,false);
					//输出2*i+1个星星
					printSomeThing(2*size-1-2*(i+1),true);
					//输出i+1个空格
					printSomeThing(i+1,false);
				}
				System.out.println();
			}		
	}
	
	public static void main(String[] args) {
		int size = 4;
		int col = 2;
		int row = 3;
		
		for (int i = 0; i < col; i++) {
			new PrintRhombus(size,row);
		}
		
	}
}
