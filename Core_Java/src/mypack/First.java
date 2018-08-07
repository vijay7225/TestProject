package mypack;
//constructor overloading program
public class First 
{
	double var;
	 /*first()
	{
		System.out.println("in default constructor");
	}*/
	First(int var)
	{
		this.var=var;
		System.out.println("inside parameterised constructor");
	}
	public static void main(String args[])
	{
		First f1= new First(500);
		System.out.println(f1.var);
	}
}
