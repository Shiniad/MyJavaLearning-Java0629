package java0625;


class B extends A {
    public void test() {
        System.out.println("B���test()����");
    }
    public static void main(String args[]) {
            A a = new B();
            a.test();
    }
}