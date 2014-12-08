package MainPackage;

public abstract class Vehicle  {
	
	private String Name;
	
	private String Color;
	
	private double Weight;
	
	public Person Owner;
	
	Person Vehicle_Driver = new Person();
	
	
	public String getName() {
		
		return Name;
	}
	
	public String getColor() {
		
		return Color;
	}
	
	public double getWeight() {
		
		return Weight;
	}

	public Person getOwner() {
		
		return Owner;
	}

	public void setName(String name) {
		
		Name = name;
	}

	public void setColor(String color) {
		
		Color = color;
	}
	
	public void setWeight(double weight) {
		
		Weight = weight;
	}
	
	public void setOwner(Person owner) {
		
		Owner = owner;
	}
	
	public void transferOwnerShip(Person newOwner){
		
		this.Owner = newOwner;
	}
	
}
