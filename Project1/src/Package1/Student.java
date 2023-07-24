package Package1;

public class Student {
	int age = 30; 
	int rollno = 2;
	
	public void display1()
	{
		System.out.println("automation is very easy");
	}
    public void display2()
    {
	System.out.println("welcome to all of you");
    }
public static void main(String[] args)
{
	Student stu =new Student();
			
	System.out.println(stu.age);
	System.out.println(stu.rollno);
	stu.display1();
	stu.display2();
	
			
	
}
}
