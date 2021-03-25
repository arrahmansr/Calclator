package Defualt;


class Demo
{
	public static void main(String[] args)
	{
	  System.out.println("Hi Riy");
      
	  student s=new student("r",111,12.3);
	  s.PrintDetalis();

	 

	}
}

class student
{

	String name;
	int id;
	double markes;

	student(String name,int id,double markes)
	{
	   this.name=name;
	   this.id=id;
	   this.markes=markes;
	}

	   public void PrintDetalis()
		{
		   String name;
	       int id;
	       double markes;

		   System.out.println("Name="+this.name);
		   System.out.println("ID="+this.id);
		   System.out.println("Markes="+this.markes);
	       
	    }



	}