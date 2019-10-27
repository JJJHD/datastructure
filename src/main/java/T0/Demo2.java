package T0;

public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��������
		int[] ints = {6,3,8,2,4,5,9,7,1};
		
		sort(ints,0,ints.length-1);
		
		for (int i = 0; i < ints.length; i++) {
			System.out.println(ints[i]);
		}
	}
	
	static void sort(int[] ints,int s,int e)
	{
		if(s<e)
		{
			int index = sortUnit(ints,s,e);//��ȡ������ڵ�λ��
			sort(ints,s,index-1);//���
			sort(ints,index+1,e);//�ұ�
		}
	}
	
	//s=��ʼλ�ã�e=����λ��
	static int sortUnit(int[] ints,int s,int e)
	{
		int temp = ints[s];//���
		int j=e;
		int i=s;
		while(i<j)
		{
			while(i<j)
			{
				if(ints[j]<temp)//j�����ҵ��ȱ��С�������Ӹ�i
				{
					ints[i]=ints[j];
					break;
				}
				j--;
			}
			while(i<j)
			{
				if(ints[i]>=temp)//i�����ҵ��ȱ�˴�������Ӹ�j
				{
					ints[j]=ints[i];
					break;
				}
				i++;
			}
		}
		ints[i]=temp;//�����ֵ�Żص�������
		return i;
	}

}
