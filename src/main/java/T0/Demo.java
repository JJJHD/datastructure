package T0;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ints = {6,2,8,4,7,3,9,5,1};
		int size = ints.length;
		while(size>2)
		{
			//������
			//ѭ�����������ڵ���������ڵ�����
			for(int i=(size-1)/2;i>=1;i--)
			{
				//�����=���ڵ�����*2���Ҷ���=�����+1
				int maxIndex=i*2;//������������
				//�������Ҷ������Ҷ��ӱ�����Ӵ�
				if((maxIndex+1)<size && ints[maxIndex+1]>ints[maxIndex])
				{
					maxIndex++;//�Ҷ��Ӵ�
				}
				//���Ķ����븸�ױ�
				if(ints[maxIndex]>ints[i])
				{
					int temp = ints[maxIndex];
					ints[maxIndex]=ints[i];
					ints[i]=temp;
				}
			}
			//���ڵ������һ����㽻��
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
