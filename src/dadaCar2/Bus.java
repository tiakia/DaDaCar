package dadaCar2;

public class Bus extends Car {
	String name;
	int person;
	int goods;
	double price;
	public Bus(String name,int person,int goods,double price) {
		this.name = name;
		this.person = person;
		this.goods = goods;
		this.price = price;
	}
	@Override
	public String toString() {
		return "" + name + "\t"+ price +"元/天\t"+ "载人："+person + "人\t";
	}
	public int getPerson() {
		return this.person;
	}
	public double getPrice() {
		return price;
	}
	public int getGoods() {
		return goods;
	}
	public String getName() {
		return this.name;
	}
}
