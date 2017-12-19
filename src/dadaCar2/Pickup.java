package dadaCar2;

public class Pickup extends Car {
	String name;
	int person;
	int goods;
	double price;
	public Pickup(String name,int person,int goods,double price) {
		this.name = name;
		this.person = person;
		this.goods = goods;
		this.price = price;
	}
	@Override
	public String toString() {
		return "" + name + "\t"+ price +"元/天\t"+ "载人："+person + "人\t"+"载货："+goods+"吨";
	}
	public int getPerson() {
		return person;
	}
	public double getPrice() {
		return price;
	}
	public int getGoods() {
		return goods;
	}
	public String getName() {
		return name;
	}
}
