
public class Potato {
	static int price = 5;//静态的(如果用private修饰，在其他文件中就不能使用类名调用)
	String content = "";//非静态的
	public Potato(int price, String content)
	{
		this.price = price;
		this.content = content;
	}	
	public static void main(String[] a)
	{
		System.out.println(Potato.price); //Potato.content （因为content不是静态的，content只依赖于类存在）   wrong
		System.out.println("----------------------------------");
		Potato obj1 = new Potato(10,"青椒土豆丝");
		System.out.println(Potato.price);
		System.out.println(obj1.price);//内存里面是同一个东西
		
		System.out.println("----------------------------------");
		Potato obj2 = new Potato(20,"西红柿鸡蛋");
		System.out.println(Potato.price);
		System.out.println(obj2.price);
		//类的所有实例共享同一个静态变量
		
	}
}
