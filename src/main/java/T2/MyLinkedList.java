package T2;

public class MyLinkedList {
	
	int size=0;
	Node head=null;
	
	public int size()
	{
		return size;
	}
	
	public void add(Object value)
	{
		Node newNode = new Node(value);
		if(head==null)//��һ�����
		{
			head = newNode;
		}
		else
		{
			Node temp = head;//��ǰ�ڵ�
			while(temp.getNext()!=null)
			{
				temp = temp.getNext();//��ǰ�ڵ�����ƶ�
			}
			//ѭ��������temp��ʾ���һ���ڵ�
			temp.setNext(newNode);
		}
		size++;
	}
	
	public void set(int index,Object value)
	{
		Node temp = head;
		for(int i=0;i<index;i++)
		{
			temp=temp.getNext();
		}
		//temp��λ��ָ������λ��
		temp.setValue(value);
	}
	
	public Object get(int index)
	{
		Node temp = head;
		for(int i=0;i<index;i++)
		{
			temp=temp.getNext();
		}
		//temp��λ��ָ������λ��
		return temp.getValue();
	}
	
	public void clear()
	{
		head = null;
		size=0;
	}
	
	public void removeAt(int index)
	{
		if(index==0)//ɾ��ͷԪ��
		{
			head =head.getNext();
		}
		else
		{
			//�ҵ�ɾ��Ԫ�ص�ǰһ��Ԫ��
			Node temp = head;
			for(int i=0;i<index-1;i++)
			{
				temp=temp.getNext();
			}
			//ѭ��������temp��ʾɾ��Ԫ�ص�ǰһ��Ԫ��
			temp.setNext(temp.getNext().getNext());
		}
		size--;
	}
}
