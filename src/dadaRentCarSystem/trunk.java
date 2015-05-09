package dadaRentCarSystem;

public class trunk extends Car{
	private int carCargo;
	public void setCarCargo(int carCargo){
		this.carCargo=carCargo;
	}
	public int getCarCargo(){
		return carCargo;
	}
	public trunk(int carNumber,String carName,int carRentMoney,int carCargo) {
		// TODO Auto-generated constructor stub
		this.setCarName(carName);
		this.setCarNumber(carNumber);
		this.setCarRentMoney(carRentMoney);
		this.setCarCargo(carCargo);
	}

}
