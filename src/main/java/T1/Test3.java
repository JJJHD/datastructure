package T1;

public class Test3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ints={2,4,7,8,10,12,16,19,20};
		int num = 17;
		int s=0;//��ʼλ��
		int e = ints.length-1;//����λ��
		int m = 0;//�м�λ��
		while(s<=e)
		{
			m=(s+e)/2;
			if(num==ints[m])
			{
				System.out.println("�ҵ�:"+m);
				return;
			}
			else if(num<ints[m])//���
			{
				e=m-1;
			}
			else//�ұ�
			{
				s=m+1;
			}
		}
		System.out.println("������");
	}

}
