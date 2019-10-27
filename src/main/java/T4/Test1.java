package T4;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ints = {5,7,2,5,8,9,3,4,6};
		int size = ints.length;
		while(size>2)
		{
			//����
			//ѭ�����еĸ��ڵ㣨�Ӻ���ǰѭ����
			for(int i=(size-1)/2;i>=1;i--)
			{
				//���ҵ����Ķ���
				int maxIndex = i*2;//�������Ķ���Ϊ�����
				//�Ҷ��Ӵ����ұ�����Ӵ�
				if((maxIndex+1)<size&&ints[maxIndex+1]>ints[maxIndex])
				{
					maxIndex++;
				}
				//���Ķ����븸�ױȽ�
				if(ints[maxIndex]>ints[i])
				{
					int temp = ints[maxIndex];
					ints[maxIndex]=ints[i];
					ints[i]=temp;
				}
			}
			//�����ڵ������һ���ڵ㽻��
			int data = ints[1];
			ints[1]=ints[size-1];
			ints[size-1]=data;
			
			size--;
		}
		
		
		
		for (int i = 1; i < ints.length; i++) {
			System.out.println(ints[i]);
		}
	}

}
