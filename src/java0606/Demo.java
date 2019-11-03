package java0606;

class fatherDemo {
	public fatherDemo() {
		System.out.println("hello");
	}
	public fatherDemo(int x) {
		System.out.println("I am father class!");
	}

}
public class Demo extends fatherDemo {

	public int add(int x) {
		return x+1;
	}
	public int multiply(int x) {
		return add(x)*2;
	}
	
	public Demo() {
		super();
		System.out.println("son");
	}
	
	public Demo(int x) {
		super(x);
		System.out.println("I am son class!");
	}
	
	
	public static void main(String[] args) {
		Demo fd = new Demo();
		System.out.println(fd.multiply(5));
	}
}
