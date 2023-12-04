public class A {
static int data;
public static void main(String[] args) {
	A a1 = new A();
	a1.data = 100;
	A a2 = new A();
	a2.data = 200;
	int result = a1.data + a2.data;
	System.out.println(a1.data+"+"+a2.data+"="+result); }
}
