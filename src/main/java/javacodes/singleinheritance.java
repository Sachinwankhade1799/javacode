package javacodes;

public class singleinheritance {

public static void main(String[] args) {
	 
	sportsbicycle mysportsbicyle =new sportsbicycle();
	mysportsbicyle.running();
	mysportsbicyle.Moving();
}
}
	

class Vehical{
	
 String color = "Blue";
 String Brand = "hero";
 int Price = 10000;
 
 public void running  () 
 {
	System.out.println("bicycle is running so fast");
	
}
}

 class sportsbicycle extends Vehical {
	
	String Model = "without gear";
	
	public void Moving ()
	{
		System.out.println("bicycle is stop ");
	}
}

 
 



