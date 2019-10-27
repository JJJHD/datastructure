package T4;

public class DoubleTree {

	Node root;
	
	public void add(int value)
	{
		Node newNode = new Node(value);
		if(root ==null)
		{
			root=newNode;
		}
		else
		{
			Node temp = root;
			while(true)
			{
				if(value<temp.getValue())//С�ķ����
				{
					if(temp.getLeft()==null)
					{
						temp.setLeft(newNode);
						break;
					}
					else
					{
						temp=temp.getLeft();
					}
				}
				else
				{
					if(temp.getRight()==null)
					{
						temp.setRight(newNode);
						break;
					}
					else
					{
						temp=temp.getRight();
					}
				}
			}
		}
	}
	
	public void show()
	{
		showNode(root);
	}
	
	private void showNode(Node pnode)
	{
		//System.out.println(pnode.getValue());
		if(pnode.getLeft()!=null)
		{
			showNode(pnode.getLeft());
		}
		System.out.println(pnode.getValue());
		if(pnode.getRight()!=null)
		{
			showNode(pnode.getRight());
		}
		//System.out.println(pnode.getValue());
	}
	
}
