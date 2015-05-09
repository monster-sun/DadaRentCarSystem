package dadaRentCarSystem;

public class pickUp extends Car{
	private int carCapacity;
	private int carCargo;
	public void setCarCapacity(int carCapacity){
		this.carCapacity=carCapacity;
	}
	public int getCarCapacity(){
		return carCapacity;
	}
	public void setCarCargo(int carCargo){
		this.carCargo=carCargo;
	}
	public int getCarCargo(){
		return carCargo;
	}
	public pickUp(int carNumber,String carName,int carRentMoney,int carCapacity,int carCargo) {
		// TODO Auto-generated constructor stub
		this.setCarNumber(carNumber);
		this.setCarName(carName);
		this.setCarRentMoney(carRentMoney);
		this.setCarCapacity(carCapacity);
		this.setCarCargo(carCargo);
	}

}
