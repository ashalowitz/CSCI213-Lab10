
public class Car extends Vehicle{
	private int doors;
	private int passengers;
	
	public Car(String aMake, String aModel, String aPlate, int doors, int passengers){
		super(aMake, aModel, aPlate);
		this.doors = doors;
		this.passengers = passengers;
	}
	
	public int getDoors(){
		return this.doors;
	}
	
	public int getPassengers(){
		return this.passengers;
	}
	
	@Override
	public String toString(){
		String result = "";
		result = String.format("%d-door %s %s with license %s", this.doors, this.getMake(), this.getModel(), this.getPlate());
		return result;
	}
	
	@Override
	public boolean equals(Object car2){
		boolean result = false;
		if(!(car2 instanceof Car)){
			return false;
		}
		Car other = (Car) car2;
		
		if(this.doors == other.getDoors()){
			if(this.passengers == other.getPassengers()){
				return super.equals(car2);
			}
		}
		return result;
	}
	
	public Car copy(){
		int doors = this.getDoors();
		int passengers = this.getPassengers();
		String make = this.getMake();
		String model = this.getModel();
		String plate = this.getPlate();
		
		Car theCopy = new Car(make, model, plate, doors, passengers);
		
		return theCopy;
	}
}

	