
public class Test
{
	GenericArray elements;

	public Test()
	{
		elements = new GenericArray();
		for (int i = 1; i <= 100; i++)
		{
			elements.add(i);
		}
		elements.print();
		System.out.print(elements.getSize());
	}

	public static void main(String[] args)
	{
		new Test();
	}
}
