package T3;

public class Test3 {

	/**
	 * @param args
	 */
	static int[][] map = new int[8][8];//��ʾ����,0��ʾû�лʺ�1��ʾ���˻ʺ�
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		play(0);
	}
	static int count = 1;
	//��ʾ����
	static void show()
	{
		System.out.println("��"+count+"�ְڷ�");
		count++;
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.print(map[i][j]+"  ");
			}
			System.out.println();
		}
	}
	//��֤��λ���Ƿ��ܹ��Żʺ�
	static boolean check(int row,int col)
	{
		//����
		for(int i=row-1;i>=0;i--)
		{
			if(map[i][col]==1)return false;
		}
		//��б��
		for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--)
		{
			if(map[i][j]==1)return false;
		}
		//��б��
		for(int i=row-1,j=col+1;i>=0&&j<8;i--,j++)
		{
			if(map[i][j]==1)return false;
		}
		return true;
	}
	
	static void play(int row)
	{
		//������ǰ�е����е�Ԫ��
		for(int i=0;i<8;i++)
		{
			if(check(row,i))//��֤�Ƿ��ܹ��Żʺ�
			{
				map[row][i]=1;//���ûʺ�
				if(row==7)//��������һ�У���ʾ���8�ʺ�
				{
					show();
					//�����һ���ʺ�ںã�ȥ���ʺ�����ڷ�
				}
				else//����һ�н�������
				{
					play(row+1);
					//�������Լ�����ʱ��ȥ����ǰ���õĻʺ�
				}
				map[row][i]=0;//ȥ�ʺ�
			}
		}
	}
}
