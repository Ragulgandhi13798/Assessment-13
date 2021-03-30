package javacollection;

import java.util.ArrayList;

   class details {
	 
    
	int id;
	String name;
	Status status;
	
	enum Status
	{
		CONFORMED,PENDING,REJECTED
	}

	public details(int id, String name, Status status) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
	}}
 
  public class Employee
  {
	  

	public static void main(String[] args) {
		
		ArrayList<details> al = new ArrayList<details>();
		
		al.add(new details (11,"vijay", details.Status.CONFORMED));
		al.add(new details (12,"ajith", details.Status.PENDING));
		al.add(new details (13,"ram", details.Status.REJECTED));
		
		for(details e : al)
		{
		System.out.println(e.id+ " "+e.name+ " "+e.status+ " ");
		
	}
	}
}
