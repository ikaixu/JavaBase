//单例模式，某一个类只能有一个实例对象（唯一）
public class Singleton {
	private static Singleton obj = new Singleton(); //共享同一个对象
	private String content;
	
	private Singleton()  //确保只能在内部调用
	{
		this.content = "abc";
	}
	
	public String getContent() 	{
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}	
	
	public static Singleton getInstance()	{
		//��̬����ʹ�þ�̬����
		//�������ʹ�÷����ڵ���ʱ���������ǲ������÷Ǿ�̬�ĳ�Ա����
		return obj;
	}
	
	
	public static void main(String[] args) {
		Singleton obj1 = Singleton.getInstance();
		System.out.println(obj1.getContent());  //abc
		
		Singleton obj2 = Singleton.getInstance();
		System.out.println(obj2.getContent());  //abc
		
		obj2.setContent("def");
		System.out.println(obj1.getContent());
		System.out.println(obj2.getContent());
		
		System.out.println(obj1 == obj2); //true, obj1与obj2只想同一个对象
	}

}
