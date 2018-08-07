package mypack;

class Abc
{
	int var=420,var1;
	Abc()
	{
		System.out.println("in default constructor");
	}
	Abc(int var)
	{
	 System.out.println("in parameterised constructor");	
	}
	Abc(int var,int var1)
	{
		System.out.println("in 2 parameterised constructor");
	}
}

public class Third extends Abc
	{
	public static void main(String args[])
	{
		Third s1= new Third();
		System.out.println(s1.var1);
	}
	}
