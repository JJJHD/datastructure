package T1;

public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ints = {7,3,8,2,1,9,4,5};
		
		//i:1�����
		for(int i=1;i<ints.length;i++)
		{
			if(ints[i]<ints[i-1])
			{
				for(int j=0;j<i;j++)//�ҵ������λ��
				{
					if(ints[i]<ints[j])
					{
						int temp = ints[i];
						for(int k=i-1;k>=j;k--)
						{
							ints[k+1]=ints[k];//����ƶ�
						}
						ints[j]=temp;
						break;
					}
				}
			}
		}
		
		for (int i = 0; i < ints.length; i++) {
			System.out.println(ints[i]);
		}
	}

}
