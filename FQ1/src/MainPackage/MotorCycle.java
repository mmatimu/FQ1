package MainPackage;

public  class MotorCycle extends Vehicle implements vehicleAbstract {
	
	private boolean hasSideCar;
	
	public MotorCycle(){
	}
	
	public MotorCycle(boolean hasSideCar){
		
		this.hasSideCar=hasSideCar;
	}

	public boolean isHasSideCar() {
		
		return hasSideCar;
	}

	public void setHasSideCar(boolean hasSideCar) {
		
		this.hasSideCar = hasSideCar;
	}

	
}
