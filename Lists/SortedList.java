package lists; 

public class SortedList extends DynamicList
{
	public SortedList()
	{
		super(10);
	}
	
	public SortedList(int size)
	{
		super(size);
	}
	
	public void insert(IntElement element)
	{
		//inserts and sorts the element
		int i = 0;
		
		if (count == capacity)
			resizeInternalArray();
		
		while (list[i] != null && list[i].getKey() <= element.getKey())
			i++;
		
		if (i < count)
			System.arraycopy(list, i, list, i + 1, count - i);
			
		list[i] = element;
		count++;
		
	}

	// gets index using binary search
	@Override
	public int getIndex(int key)
	{
		int index = count/2; //index currently looking at
		int size = count/2; // size of area we are searching
	 
		while (size > 0)
		{
			// if we found it, return the index
			if(key == list[index].getKey())
			{
				return index;
			}
			else
			{
				// make the search area smaller
				size = size/2;
			
				// if element is smaller than index, then move halfway to the left
				if(key < list[index].getKey())
				{	
					count = count - size; 
				}
				// if element is larger than index, then move halfway to the right
				else if(key > list[index].getKey())
				{
					count = count + size; 
				}
			}
		}
		
		// if not found return -1
		return -1; 
		
	}

	// return element with desired key
	@Override
	public IntElement find(int key)
	{
		// check if key is in list
		int index = getIndex(key);

		// if not return null
		if(index != -1)
		{
			return null;
		} 
		else // return element
		{
			return list[index];
		}
	}
}
