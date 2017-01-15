package systemOfCar;

public class Pickup extends Car implements ICargo,IPerson{
	public Pickup(int id,String name,float price,float capacityOfGoods,int capacityOfMan){
		this.id = id;
		this.name = name;
		this.capacityOfGoods = capacityOfGoods;
		this.capacityOfMan = capacityOfMan;
		this.price = price;
	}
	public float Cargo(){
		return capacityOfGoods;
	}
	public int Person(){
		return capacityOfMan;
	}
}
