package T2;

import java.util.ArrayList;


public class Test1 {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//MyArrayList list = new MyArrayList();
		MyLinkedList list = new MyLinkedList();
		list.add(3);
		list.add(2);//
		list.add(1);//
		list.add(4);//
		list.add(7);
		list.add(5);
		list.add(8);
		
		//list.set(1, 9);
		//list.clear();
		list.removeAt(1);
		list.removeAt(1);
		list.removeAt(1);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
