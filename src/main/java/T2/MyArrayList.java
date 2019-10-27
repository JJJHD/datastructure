package T2;

public class MyArrayList {

	Object[] objs = new Object[4];
	
	int size=0;//���ϵĴ�С
	
	public int size()
	{
		return size;
	}
	
	//���
	public void add(Object value)
	{
		//�Ų��ŵ���
		if(size>=objs.length)
		{
			Object[] temp = new Object[objs.length*2];
			//���
			for (int i = 0; i < objs.length; i++) {
				temp[i]=objs[i];
			}
			objs=temp;
		}
		objs[size]=value;
		size++;
	}
	
	public void set(int index,Object value) throws Exception
	{
		if(index<0 || index>=size)
		{
			throw new Exception("������Χ");
		}
		objs[index]=value;
	}
	
	public Object get(int index) throws Exception
	{
		if(index<0 || index>=size)
		{
			throw new Exception("������Χ");
		}
		return objs[index];
	}
	
	public void clear()
	{
		size=0;
		objs=new Object[4];
	}
	
	public void removeAt(int index)throws Exception
	{
		if(index<0 || index>=size)
		{
			throw new Exception("������Χ");
		}
		
		for(int i=index+1;i<size;i++)
		{
			objs[i-1]=objs[i];
		}
		size--;
	}

}
