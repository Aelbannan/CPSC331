package lists;

public class UnsortedList extends DynamicList
{
	public UnsortedList()
	{
		super(10);
	}
	
	public UnsortedList(int size)
	{
		super(size);
	}
	
	public void insert(IntElement element)
	{
		//inserts a element
		if (count == capacity)
			resizeInternalArray();
					
		list[count] = element;
		count++;
		
	}
}
