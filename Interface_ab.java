import java.util.Scanner;
interface Animal
{
	void speak();
	void eat();
}
class dog implements Animal
{
	public void speak()
	{
		System.out.println(" The Dog Barks");
	}
	public void eat()
	{
		System.out.println(" The Dog eats bones ");
	}
	
}
class cat implements Animal
{
	
	   public void speak()
	{
		System.out.println(" The Cat Meows ");
	}
	public void eat()
	{
		System.out.println(" The Cat eats food");
	}
}
class Interface_ab
{
	public static void main(String ar[])
	{
		
		dog d=new dog();
		cat c=new cat();
		d.speak();
		d.eat();
		c.speak();
		c.eat();
	}
}