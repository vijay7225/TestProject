package mypack;

public class Demo
{
	byte a;
	short b;
	int c;
	long d;
	
	float e;
	double f;
	
	char g;
	
	boolean h;
	
	String i;
	
	public static void main(String args[])
	{
		Demo ref=new Demo();
		System.out.println("default value of byte is\t"+ref.a);
		System.out.println("default value of short is\t"+ref.b);
		System.out.println("default value of int is\t\t"+ref.c);
		System.out.println("default value of long is\t"+ref.d);
		
		System.out.println("default value of float is\t"+ref.e);
		System.out.println("default value of double is\t"+ref.f);
		
		System.out.println("default value of char is\t"+ref.g);
		//System.out.println(e);
		System.out.println("default value of boolean is\t"+ref.h);
		
		System.out.println("default value of String is\t"+ref.i);
	}
}

