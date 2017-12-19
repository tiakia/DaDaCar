package dadaCar2;
import java.util.Scanner;

public class Initial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car[] dadaCar = {
				new Bus("奥迪A4",4,0,500),
				new Bus("马自达6",4,0,400),
				new Pickup("皮卡6",4,2,450),
				new Bus("金龙",20,0,800),
				new Truck("松花江",0,4,400),
				new Truck("依维柯",0,20,1000)
        };
		System.out.println("欢迎使用答答租车系统：");
		System.out.println("您是否要租车：1是0否");
		
		Scanner input = new Scanner(System.in);
		int result = input.nextInt();
		
		if(result == 1) {
			
			System.out.println("您可租的类型及价目表");
			
			System.out.println("序号\t汽车名称\t租金\t\t容量");
		
			for(int i = 0; i < dadaCar.length;i++) {
				System.out.println((i+1)+"\t"+dadaCar[i].toString());
			}
			
			System.out.println("请输入租车的数量：");
			
			Scanner carNum = new Scanner(System.in);
			int num = carNum.nextInt();
			
			//选中的汽车编号
			int[] cars = new int[num];
			for(int j = 0; j < cars.length; j++ ) {
				System.out.println("请输入第"+(j+1)+"辆车的序号");
				Scanner input_carOrder = new Scanner(System.in);
				int carOrder = input_carOrder.nextInt();
				cars[j] = carOrder - 1;
			}
			
			System.out.println("请输入租车天数：");
			
			Scanner input_day = new Scanner(System.in);
			int day_car = input_day.nextInt();
			
			System.out.println("可载人的车有：");
			
			int totalPerson = 0;
			double totalPrice = 0;
			int totalGoods = 0;	
			
			for(int m = 0; m < cars.length; m++) {
			
				totalPrice += dadaCar[cars[m]].getPrice() * day_car;
				
				if(dadaCar[cars[m]].getPerson() != 0) {
					
					System.out.print(dadaCar[cars[m]].getName() + " ");
				
					totalPerson += dadaCar[cars[m]].getPerson();
					
				}
			}
			System.out.println(" 共载人："+ totalPerson);
			
			System.out.println("可载货的车有：");
			
			for(int m = 0; m < cars.length; m++) {
				
				if(dadaCar[cars[m]].getGoods() != 0) {
					
					System.out.print(dadaCar[cars[m]].getName() + " ");
		
					totalGoods += dadaCar[cars[m]].getGoods();
				}
			}
			
			System.out.println(" 共载货："+ totalGoods);
			
			System.out.println("总价格："+ totalPrice);
		
		}else {
			
			System.out.println("谢谢使用！");
		
		}
	}

}
