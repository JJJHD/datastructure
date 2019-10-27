package T3;

import java.io.File;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���������ļ���
		play(new File("D:\\���Ͻ���"));
	}
	
	static void play(File file)
	{
		//��ȡ��ǰ�ļ������������ļ���/�ļ�
		File[] files = file.listFiles();
		for(int i =0;i<files.length;i++)
		{
			if(files[i].isFile())//�ļ�
			{
				System.out.println(files[i].getName());
			}
			else
			{
				play(files[i]);
			}
		}
	}

}
