package mypack;

class sixth
{
	int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
}

public class Demo1 
{
 int a=5;
 public static void main(String args[])
 {
	  sixth s1 =new sixth();
	 System.out.println(s1.getA());
 }
}
