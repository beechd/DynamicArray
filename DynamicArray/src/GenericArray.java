
public class GenericArray
{
	private int[] elements;

	private int capacity;
	private int size;

	public GenericArray()
	{
		size = 0;
		capacity = 10;
		elements = new int[capacity];
	}

	public int getSize()
	{
		return size;
	}

	public void add(int element)
	{
		if (capacity == size)
		{
			capacity *= 2;
			int[] temp = new int[capacity];
			for (int i = 0; i < size; i++)
			{
				temp[i] = elements[i];
			}
			elements = temp;
		}
		elements[size++] = element;
	}

	public void print()
	{
		if (size > 0)
		{
			for (int i = 0; i < size; i++)
			{
				System.out.print(elements[i] + " ");
			}
			System.out.println();
		}
	}
}
