import java.util.Scanner;
abstract class Animal
{
	public String color,breed,name;
	public void speak()
	{
		System.out.println("Hello");
		System.out.println("My Name is : " + name);
		System.out.println("Breed : " + breed);
		System.out.println("Color : " + color);

	}
	abstract void eat();
	
}
class dog extends Animal
{
	void dog1(String name,String breed,String color)
	{
		this.name=name;
		this.breed=breed;
		this.color=color;
	}
	void eat()
	{
		System.out.println("Our Output");
		System.out.println(name+" eats food");
	}
}
class Abstract_ques2
{
	public static void main(String ars[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter name of the dog");
		String a=s.nextLine();
		System.out.println("Enter breed of the dog");
		String b=s.nextLine();
		System.out.println("Enter color of the dog");
		String c=s.nextLine();
	    dog d=new dog();
		d.dog1(a,b,c);
		d.eat();
		
	}
}