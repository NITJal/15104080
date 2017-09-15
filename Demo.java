/*Q3. Write a java program to create an abstract class named Shape that contains an empty method named number Of Sides ( ).
  Provide three classes named Trapezoid, Triangle and Hexagon such that each one of the classes extends the class Shape. 
  Each one of the classes contains only the method number Of Sides ( ) that shows the number of sides in the given geometrical figures.*/
  
package Assignment01;
abstract class Shape 
{
	public abstract void number_of_sides();
	
}
class Trapezoid extends Shape
		{
public void number_of_sides()
	{
	System.out.println("Trapezoid : 4");
	}
		}
class Triangle extends Shape

{	public void number_of_sides()
{
	System.out.println("Triangle : 3");
}}
class Hexagon extends Shape
{
	public void number_of_sides()
{
	System.out.println("Hexagon: 6");
}}
 class Demo {
public static void main (String args[])
{	
	Trapezoid tz=new Trapezoid();

	Triangle t=new Triangle();
	Hexagon h1=new Hexagon();
	tz.number_of_sides();
	t.number_of_sides();
	h1.number_of_sides();
	
}
}

	


