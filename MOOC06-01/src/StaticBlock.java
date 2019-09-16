
class StaticBlock
{
	//staticl block > anonymous block > constructor function	
	static
	{
		System.out.println("22222222222222222222");
	}//静态代码块,调用时先执行
	{
		System.out.println("11111111111111111111");
	}//匿名代码块
	public StaticBlock()
	{
		System.out.println("33333333333333333333");
	}//构造函数
	{
		System.out.println("44444444444444444444");
	}//匿名代码块
}