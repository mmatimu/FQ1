
import static org.junit.Assert.*;

import org.junit.Test;

import MainPackage.Car;
import MainPackage.MotorCycle;
import MainPackage.Person;
import MainPackage.Truck;

public class FVJunit {

	@Test
	public void test() {
		
		Person a = new Person();
		
   	 a.setFirstName("a");

   	 Car NCar= new Car();
   	 
   	 NCar.setOwner(a);
   	 
   	 NCar.setNumberOfDoors(4);
  	
   	 assertEquals("Person (a) first name","a",a.getFirstName());

  	
   	 Truck NTruck= new Truck();
   	 
   	 NTruck.setOwner(a);
   	 
   	 NTruck.setNumberOfAxels(2);
  	
   	 assertEquals("Person (a) new owned truck","a",NTruck.getOwner().getFirstName());


   	 Person b= new Person();
   	 
   	 b.setFirstName("b");
   	 
   	 NTruck.setOwner(b);
   	
   	 assertEquals("Person (b) new owned truck","b",NTruck.getOwner().getFirstName());


   	 MotorCycle NMotorcycle= new MotorCycle();
   	 
   	 NMotorcycle.setHasSideCar(false);
   
   	
   	assertEquals("Motorcycle without sidecar",false,NMotorcycle.isHasSideCar());
  	
   	assertEquals("The car owned by person (a) has 4 doors",4,NCar.getNumberOfDoors());
  	
  	assertEquals("The truck owned by person (a) has 2 axels",2,NTruck.getNumberOfAxels());

 

	}

}
