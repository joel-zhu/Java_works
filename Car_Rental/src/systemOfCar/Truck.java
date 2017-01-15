package systemOfCar;

public class Truck extends Car implements ICargo {
	public Truck(int id,String name,float capacityOfGoods,float price){
		this.id = id;
		this.name = name;
		this.capacityOfGoods = capacityOfGoods;
		this.price = price;
	}
	public float Cargo() {
		return capacityOfGoods;
	}
}
