package T1;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5!�׳�=1*2*3*4*5...n
		//����������
		int n=100;
//		double num1  = 1;
//		//����int�ķ�Χ
//		for(int i=1;i<=n;i++)
//		{
//			num1=num1*i;
//		}
//		System.out.println(num1);
		
		//732*16
		int[] ints = new int[200];
		ints[ints.length-1]=1;
		
		for(int i=1;i<=n;i++)
		{
				ints=demo(ints,i);
		}
		
		
		for (int i = 0; i < ints.length; i++) {
			System.err.print(ints[i]);
		}
		
	}
	
	static int[] demo(int[] ints,int num)
	{
		for (int i = 0; i < ints.length; i++) {
			ints[i]*=num;
		}
		//������
		for(int i=ints.length-1;i>0;i--)
		{
			ints[i-1]+=ints[i]/10;
			ints[i]=ints[i]%10;
		}
		return ints;
	}

}
