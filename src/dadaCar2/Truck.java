package dadaCar2;

public class Truck extends Car {
	String name;
	int person;
	int goods;
	double price;
	public Truck(String name,int person,int goods,double price) {
		this.name = name;
		this.person = person;
		this.goods = goods;
		this.price = price;
	}
	@Override
	public String toString() {
		return "" + name + "\t"+ price +"Ôª/Ìì\t"+ "ÔØ»õ£º"+goods + "¶Ö\t";
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
