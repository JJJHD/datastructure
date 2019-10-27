package T3;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//쳲���������1,1��2,3,5,8.....
		
		//ѭ��ʵ��
//		int num1=1;
//		int num2 = 1;
//		int num3=0;
//		int n = 6;
//		for(int i=3;i<=n;i++)
//		{
//			num3=num1+num2;
//			num1=num2;
//			num2=num3;
//		}
//		System.out.println(num3);
		
		//�ݹ�ʵ��
		int num = run(6);
		System.out.println(num);
	}
	
	static int run(int n)
	{
		if(n==1||n==2)
		{
			return 1;
		}
		else
		{
			return run(n-1)+run(n-2);
		}
	}
	
	

}
