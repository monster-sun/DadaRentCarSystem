package dadaRentCarSystem;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("欢迎使用达达租车系统：");
	System.out.println("您是否要租车：1是  0否");
	Scanner tmp=new Scanner(System.in);
	int m=tmp.nextInt();
	if(m==1){
		Car[] buffer={
				new passageCar(1,"奥迪A4",500,4),
				new passageCar(2,"马自达6",400,4),
				new pickUp(3,"皮卡雪6",450,4,2),
				new trunk(4,"松花江",400,20)
		};
		System.out.println("您可以租车的类型及其价目表：");
		System.out.println("序号"+"\t"+"汽车类型 "+"\t"+"租金"+"\t"+"容量");
		for(Car car:buffer){
			if(car instanceof passageCar){
				System.out.println(car.getCarNumber()+"\t"+car.getCarName()+"\t"+car.getCarRentMoney()+"元/天"+"\t"+"载人:"+((passageCar)(car)).getCarCapacity()+"人");
			}
			if(car instanceof pickUp){
				System.out.println(car.getCarNumber()+"\t"+car.getCarName()+"\t"+car.getCarRentMoney()+"元/天"+"\t"+"载人:"+((pickUp)(car)).getCarCapacity()+"人"+" 载货:"+((pickUp)(car)).getCarCargo()+"吨");
			}
			if(car instanceof trunk){
				System.out.println(car.getCarNumber()+"\t"+car.getCarName()+"\t"+car.getCarRentMoney()+"元/天"+"\t"+"载货:"+((trunk)(car)).getCarCargo()+"吨");				
			}
		}
		System.out.println("请输入你要租车的数量:");
		Scanner e=new Scanner(System.in);
		int rentNumber=e.nextInt();

		List<Car> carList=new ArrayList<Car>();
		int p=0;
		List<Car> carListPassage=new ArrayList<Car>();
		List<Car> carListTrunk=new ArrayList<Car>();
		
		int totalPassager=0;
		int totalPeople=0;
		int totalCargo=0;
		int totalMoney=0;
		
		for(int i=1;i<=rentNumber;i++){
			System.out.println("请输入第"+i+"辆车的序号:");
			Scanner number=new Scanner(System.in);
			int num=number.nextInt();
			carList.add(buffer[num-1]);     //将车添加入List
			
			if(buffer[num-1] instanceof passageCar){
				totalPassager+=((passageCar)carList.get(p)).getCarCapacity();
				totalPeople+=((passageCar)buffer[num-1]).getCarCapacity();
				totalMoney+=((passageCar)carList.get(p)).getCarRentMoney();
				carListPassage.add(carList.get(p));
			}
			if(buffer[num-1] instanceof pickUp){
				totalPassager+=((pickUp)carList.get(p)).getCarCapacity();
				totalPeople+=((pickUp)buffer[num-1]).getCarCapacity();
				totalMoney+=((pickUp)carList.get(p)).getCarRentMoney();
				totalCargo+=((pickUp)carList.get(p)).getCarCargo();
				carListTrunk.add(carList.get(p));
				carListPassage.add(carList.get(p));
			}
			if(buffer[num-1] instanceof trunk){
				totalCargo+=((trunk)carList.get(p)).getCarCargo();
				totalMoney+=((trunk)carList.get(p)).getCarRentMoney();
				carListTrunk.add(carList.get(p));
			}
			p++;
		}
		System.out.println("请输入使用天数:");
		Scanner t=new Scanner(System.in);
		int days=t.nextInt();
				
		System.out.println("您的账单:");
		System.out.println("***********载人的车有:");
			for(Car car:carListPassage){
				System.out.print(car.getCarName()+"  ");
			}
		System.out.println("\n"+"***********载货的车有:");
			for(Car car:carListTrunk){
				System.out.print(car.getCarName()+"  ");
			}
		System.out.println("\n租车总价格:"+totalMoney*days+"元");
		
	}else if(m==0){
			System.out.println("欢迎再次光临！");
		}else{
			System.out.println("输入有误！");
		}
	}

}


