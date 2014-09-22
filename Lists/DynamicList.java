package lists;

public abstract class DynamicList
{
	protected IntElement[] list;
	protected int count, capacity;
	
	
	public DynamicList()
	{
		this(10);
	}
	
	public DynamicList(int size)
	{
		list = new IntElement[size];
		capacity = size;
		count = 0;
	}
	
	protected void resizeInternalArray()
	{
		IntElement[] newList = new IntElement[capacity * 2];
		System.arraycopy(list, 0, newList, 0, capacity);
		capacity *= 2;
		list = newList;
	}

	// finds index using linear search
	public int getIndex(int key)
	{
		// check each element linearly
		for(int i = 0; i <= count; i++)
			if(key == list[i].getKey())
				return i;
				
		// if not found return -1
		return -1;
	}
	
	public abstract void insert(IntElement element);
	
	// return element with desired key
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
	
	public IntElement delete(int key)
	{
		return null;
	}
	
	public IntElement[] toArray()
	{
		return list;
	}
	
	public IntElement[] sort()
	{
		return null;
	}
}
hey today is the day
