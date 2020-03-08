
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

	public E get(int index)
	{
		if (index >= 0 && index < size)
		{
			return elements[index];
		}
		else
		{
			throw new IndexOutOfBoundsException(
					index + " is outside the size of the Dynamic Array. Size is " + size + ".");
		}
	}

	public void remove(int index)
	{
		if (index >= 0 && index < size)
		{
			if (index != size - 1)
			{
				for (int i = index; i < size - 1; i++)
				{
					elements[i] = elements[i + 1];
				}
			}
			size--;
		}
		else
		{
			throw new IndexOutOfBoundsException(
					index + " is outside the size of the Dynamic Array. Size is " + size + ".");
		}
	}
}
