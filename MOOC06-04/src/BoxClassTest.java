
public class BoxClassTest {
	public static void main(String[] args)
	{
		int i1 = 10;
		Integer i2 = 10;                // �Զ�װ��
		System.out.println(i1 == i2);   //true
		// �Զ�����  �������ͺͰ�װ����бȽϣ���װ���Զ�����
		
		Integer i3 = new Integer(10);
		System.out.println(i1 == i3);  //true
		// �Զ�����  �������ͺͰ�װ����бȽϣ���װ���Զ�����
		
		System.out.println(i2 == i3); //false
		// ��������Ƚϣ��Ƚ����ַ�� 
		// i2�ǳ���������ջ�ڴ泣�����У�i3��new�����󣬷��ڶ��ڴ���
		
		Integer i4 = new Integer(5);
		Integer i5 = new Integer(5);
		System.out.println(i1 == (i4+i5));   //true
		System.out.println(i2 == (i4+i5));   //true
		System.out.println(i3 == (i4+i5));   //true
		// i4+i5 ��������ʹ��i4,i5�Զ�����Ϊ�������Ͳ�����õ�10. 
		// ��������10�Ͷ���Ƚ�, ����ʹ�����Զ����䣬���������ͱȽ�
		
		Integer i6 = i4 + i5;  // +����ʹ��i4,i5�Զ����䣬�õ�10�����i6 == i2.
		System.out.println(i1 == i6);  //true
		System.out.println(i2 == i6);  //true
		System.out.println(i3 == i6);  //false
	}	
}
