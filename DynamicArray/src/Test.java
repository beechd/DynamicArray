
public class Test
{
	GenericArray<String> elements;

	public Test()
	{
		elements = new GenericArray<String>();
		for (int i = 1; i <= 20; i++)
		{
			elements.add("Hello " + i);
		}
		elements.print();
		System.out.println(elements.get(2));
		elements.remove(19);
		elements.print();
		System.out.print(elements.getSize());
	}

	public static void main(String[] args)
	{
		new Test();
	}
}
