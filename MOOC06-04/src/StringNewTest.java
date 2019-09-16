
public class StringNewTest {
	public static void main(String[] args) {
		String s0 = "abcdef";
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc");
		String s4 = new String("abc");
		System.out.println(s1 == s2); //true ������
		System.out.println(s1 == s3); //false һ��ջ�ڴ棬һ�����ڴ�
		System.out.println(s3 == s4); //false �������Ƕ��ڴ�
		System.out.println("=========================");
		
		String s5 = s1 + "def";    //�漰���������ʱ��������Ż�
		String s6 = "abc" + "def"; //���ǳ��� ���������Զ��Ż���abcdef
		String s7 = "abc" + new String ("def");//�漰��new���󣬱��������Ż�
		System.out.println(s5 == s6); //false
		System.out.println(s5 == s7); //false
		System.out.println(s6 == s7); //false
		System.out.println(s0 == s6); //true 
		System.out.println("=========================");

		
		String s8 = s3 + "def";//�漰��new���󣬱��������Ż�
		String s9 = s4 + "def";//�漰��new���󣬱��������Ż�
		String s10 = s3 + new String("def");//�漰��new���󣬱��������Ż�
		System.out.println(s8 == s9); //false
		System.out.println(s8 == s10); //false
		System.out.println(s9 == s10); //false
	}
}
