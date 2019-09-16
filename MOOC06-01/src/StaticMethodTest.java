
public class StaticMethodTest {
	int a = 111111;//非静态
	static int b = 222222;//静态
	public static void hello()
	{//静态方法
		System.out.println("000000");
		System.out.println(b);
		//System.out.println(a);  //error, cannot call non-static variables（静态方法不能调用非静态变量）
		//hi()                    //error, cannot call non-static method（静态方法不能调用非静态方法）
	}
	public void hi()
	{//非静态方法
		System.out.println("333333");
		hello();                  //ok, call static methods
		System.out.println(a);    //ok, call non-static variables
		System.out.println(b);    //ok, call static variables
	}
	public static void main(String[] a)
	{
		StaticMethodTest.hello();//调用静态方法
		//StaticMethodTest.hi(); //error, 不能使用类名调用非静态方法
		System.out.println("------------------------------");
		StaticMethodTest foo = new StaticMethodTest();
		foo.hello();  //warning, but it is ok（静态方法需要使用类名来调用）
		System.out.println("------------------------------");
		foo.hi();     //right
	}
}
