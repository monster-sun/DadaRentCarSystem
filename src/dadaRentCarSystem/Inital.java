package dadaRentCarSystem;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("��ӭʹ�ô���⳵ϵͳ��");
	System.out.println("���Ƿ�Ҫ�⳵��1��  0��");
	Scanner tmp=new Scanner(System.in);
	int m=tmp.nextInt();
	if(m==1){
		Car[] buffer={
				new passageCar(1,"�µ�A4",500,4),
				new passageCar(2,"���Դ�6",400,4),
				new pickUp(3,"Ƥ��ѩ6",450,4,2),
				new trunk(4,"�ɻ���",400,20)
		};
		System.out.println("�������⳵�����ͼ����Ŀ��");
		System.out.println("���"+"\t"+"�������� "+"\t"+"���"+"\t"+"����");
		for(Car car:buffer){
			if(car instanceof passageCar){
				System.out.println(car.getCarNumber()+"\t"+car.getCarName()+"\t"+car.getCarRentMoney()+"Ԫ/��"+"\t"+"����:"+((passageCar)(car)).getCarCapacity()+"��");
			}
			if(car instanceof pickUp){
				System.out.println(car.getCarNumber()+"\t"+car.getCarName()+"\t"+car.getCarRentMoney()+"Ԫ/��"+"\t"+"����:"+((pickUp)(car)).getCarCapacity()+"��"+" �ػ�:"+((pickUp)(car)).getCarCargo()+"��");
			}
			if(car instanceof trunk){
				System.out.println(car.getCarNumber()+"\t"+car.getCarName()+"\t"+car.getCarRentMoney()+"Ԫ/��"+"\t"+"�ػ�:"+((trunk)(car)).getCarCargo()+"��");				
			}
		}
		System.out.println("��������Ҫ�⳵������:");
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
			System.out.println("�������"+i+"���������:");
			Scanner number=new Scanner(System.in);
			int num=number.nextInt();
			carList.add(buffer[num-1]);     //���������List
			
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
		System.out.println("������ʹ������:");
		Scanner t=new Scanner(System.in);
		int days=t.nextInt();
				
		System.out.println("�����˵�:");
		System.out.println("***********���˵ĳ���:");
			for(Car car:carListPassage){
				System.out.print(car.getCarName()+"  ");
			}
		System.out.println("\n"+"***********�ػ��ĳ���:");
			for(Car car:carListTrunk){
				System.out.print(car.getCarName()+"  ");
			}
		System.out.println("\n�⳵�ܼ۸�:"+totalMoney*days+"Ԫ");
		
	}else if(m==0){
			System.out.println("��ӭ�ٴι��٣�");
		}else{
			System.out.println("��������");
		}
	}

}


