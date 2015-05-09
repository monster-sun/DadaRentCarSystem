package dadaRentCarSystem;

public class passageCar extends Car{
      private int carCapacity;
      public passageCar(int carNumber,String carName,int carRentMoney,int carCapzcity){
    	  this.setCarNumber(carNumber);
    	  this.setCarName(carName);
    	  this.setCarRentMoney(carRentMoney);
    	  this.setCarCapacity(carCapzcity);
      }
      public void setCarCapacity(int carCapacity){
    	  this.carCapacity=carCapacity;
      }
      public int getCarCapacity(){
    	  return carCapacity;
      }
}
