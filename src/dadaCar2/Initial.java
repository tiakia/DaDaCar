package dadaCar2;
import java.util.Scanner;

public class Initial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car[] dadaCar = {
				new Bus("�µ�A4",4,0,500),
				new Bus("���Դ�6",4,0,400),
				new Pickup("Ƥ��6",4,2,450),
				new Bus("����",20,0,800),
				new Truck("�ɻ���",0,4,400),
				new Truck("��ά��",0,20,1000)
        };
		System.out.println("��ӭʹ�ô���⳵ϵͳ��");
		System.out.println("���Ƿ�Ҫ�⳵��1��0��");
		
		Scanner input = new Scanner(System.in);
		int result = input.nextInt();
		
		if(result == 1) {
			
			System.out.println("����������ͼ���Ŀ��");
			
			System.out.println("���\t��������\t���\t\t����");
		
			for(int i = 0; i < dadaCar.length;i++) {
				System.out.println((i+1)+"\t"+dadaCar[i].toString());
			}
			
			System.out.println("�������⳵��������");
			
			Scanner carNum = new Scanner(System.in);
			int num = carNum.nextInt();
			
			//ѡ�е��������
			int[] cars = new int[num];
			for(int j = 0; j < cars.length; j++ ) {
				System.out.println("�������"+(j+1)+"���������");
				Scanner input_carOrder = new Scanner(System.in);
				int carOrder = input_carOrder.nextInt();
				cars[j] = carOrder - 1;
			}
			
			System.out.println("�������⳵������");
			
			Scanner input_day = new Scanner(System.in);
			int day_car = input_day.nextInt();
			
			System.out.println("�����˵ĳ��У�");
			
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
			System.out.println(" �����ˣ�"+ totalPerson);
			
			System.out.println("���ػ��ĳ��У�");
			
			for(int m = 0; m < cars.length; m++) {
				
				if(dadaCar[cars[m]].getGoods() != 0) {
					
					System.out.print(dadaCar[cars[m]].getName() + " ");
		
					totalGoods += dadaCar[cars[m]].getGoods();
				}
			}
			
			System.out.println(" ���ػ���"+ totalGoods);
			
			System.out.println("�ܼ۸�"+ totalPrice);
		
		}else {
			
			System.out.println("ллʹ�ã�");
		
		}
	}

}
