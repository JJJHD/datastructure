package T3;

public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��������
		
		int[] ints = {5,3,7,8,2,9,4,6};
		
		sort(ints,0,ints.length-1);
		
		for (int j2 = 0; j2 < ints.length; j2++) {
			System.out.println(ints[j2]);
		}
	}
	
	static void sort(int[] ints,int s,int e)
	{
		if(s<e)
		{
			int index = sortUnit(ints,s,e);
			sort(ints,s,index-1);//���
			sort(ints,index+1,e);//�ұ�
		}
	}
	
	static int sortUnit(int[] ints,int s,int e)
	{
		int num = ints[s];//���
		int i=s;//��ʼλ��
		int j=e;//����λ��
		while(i<j)
		{
			while(i<j)
			{
				if(ints[j]<num)//j������С��,�Ӹ�i
				{
					ints[i]=ints[j];
					break;
				}
				j--;
			}
			while(i<j)
			{
				if(ints[i]>=num)//i�����Ҵ��,�Ӹ�j
				{
					ints[j]=ints[i];
					break;
				}
				i++;
			}
		}
		ints[i]=num;
		return i;
	}

}
