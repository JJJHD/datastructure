package T0;

public class Demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ints = {5,3,8,4,7,2,6};
		
		//iѭ����������1��ʼһֱ�����
		for(int i=1;i<ints.length;i++)
		{
			if(ints[i]<ints[i-1])//iλ�õ�ֵ��Ҫ���뵽ǰ��λ��
			{
				//jѭ������0��ʼ��iǰ��
				for(int j=0;j<i;j++)
				{
					if(ints[i]<ints[j])//�ҵ�����λ��(jλ��)
					{
						int temp = ints[i];
						//kѭ��������������ƶ�
						for(int k=i-1;k>=j;k--)
						{
							ints[k+1]=ints[k];
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
