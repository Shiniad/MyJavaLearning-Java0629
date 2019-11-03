package java0625;


class B extends A {
    public void test() {
        System.out.println("B类的test()方法");
    }
    public static void main(String args[]) {
            A a = new B();
            a.test();
    }
}