
public class GenericArray<E>
{
	private E[] elements;

	private int capacity;
	private int size;

	@SuppressWarnings("unchecked")
	public GenericArray()
	{
		size = 0;
		capacity = 10;
		elements = (E[]) new Object[capacity];
	}

	public int getSize()
	{
		return size;
	}

	@SuppressWarnings("unchecked")
	public void add(E element)
	{
		if (capacity == size)
		{
			capacity *= 2;
			E[] temp = (E[]) new Object[capacity];

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
				if (i != size - 1)
				{
					System.out.print(elements[i] + ", ");
				}
				else
				{
					System.out.print(elements[i]);
				}
			}
			System.out.println();
		}
	}
}
