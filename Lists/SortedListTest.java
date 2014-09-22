package lists;

import static org.junit.Assert.*;

import org.junit.Test;

public class SortedListTest {

	@Test
	public void insertTest() {
		SortedList list = new SortedList(10);
		//Inserting objects into the array 
		list.insert(new IntElement(1));
		list.insert(new IntElement(2));
		list.insert(new IntElement(4));
		list.insert(new IntElement(3));
		list.insert(new IntElement(5));
		list.insert(new IntElement(8));
		list.insert(new IntElement(7));
		list.insert(new IntElement(6));
		list.insert(new IntElement(9));
		list.insert(new IntElement(10));
		list.insert(new IntElement(11));
		//getting the array
		IntElement[] arr = list.toArray();
		
		for (int i = 0; i < 10; i++)
		{
			//this loop tests for every element in the array 
			assertEquals(arr[i].getKey(),i+1);

		}
	}

	@Test
	public void findTest()
	{
		SortedList list = new SortedList(10);
		//Inserting objects into the array 
		list.insert(new IntElement(1));
		list.insert(new IntElement(2));
		list.insert(new IntElement(4));
		list.insert(new IntElement(3));
		list.insert(new IntElement(5));
		list.insert(new IntElement(8));
		list.insert(new IntElement(7));
		list.insert(new IntElement(6));
		list.insert(new IntElement(9));
		list.insert(new IntElement(10));
		list.insert(new IntElement(11));

		assertEquals(list.find(6) , 5);
	}

}
