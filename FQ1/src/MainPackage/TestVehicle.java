package MainPackage;

public class TestVehicle {
     
	public static void main(String[] args){
    	 
    	 Person a = new Person();
    	 
    	 a.setFirstName("a");
    	 
    	 
    	 Truck NewTruck= new Truck();
    	 
    	 NewTruck.Owner=a;
    	 
    	 NewTruck.setNumberOfAxels(2);
    	 
    	 System.out.println(NewTruck.Owner.getFirstName());

    	 
    	 Car NewCar= new Car();
    	 
    	 NewCar.Owner= a;
    	 
    	 NewCar.setNumberOfDoors(4);
    	 
    	 System.out.println(NewCar.Owner.getFirstName());

    	 
    	 Person b= new Person();
    	 
    	 b.setFirstName("b");
    	 
    	 NewTruck.Owner=b;
    	 
    	 
    	 MotorCycle NewMotorcycle= new MotorCycle();
    	 
    	 NewMotorcycle.setHasSideCar(false);
    
    	 System.out.println(NewTruck.Owner.getFirstName());
    	 
    	 System.out.println(NewCar.getNumberOfDoors());
    	 
    	 System.out.println(NewMotorcycle.isHasSideCar());

     }
}
