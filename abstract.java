import java.util.Scanner;
abstract class Animal
{
	String name,color,breed;
	Animal(String n,String c,String b)
	{
		this.name = n;
		this.color = c;
		this.breed = b;
	}
	abstract void eat();
	void speak()
	{
		System.out.println(this.name+" Speaks");
	}
}
class Dog extends Animal
{
	Dog(String n,String c,String b)
	{
		super(n,c,b);
	}
	public void eat()
	{
		System.out.println(name+" eats");
	}
}
class Cat extends Animal
{
	Cat(String n,String c,String b)
	{
		super(n,c,b);
	}
	public void eat()
	{
		System.out.println(name+" eats");
	}
}
public class abs
{
	public static void main(String args[])
	{
		Dog d = new Dog("Tommy","brown","labrador");
		Cat c = new Cat("blurry","white","Persian cat");
		c.speak();
		c.eat();
		d.speak();
		d.eat();	
	}
}
