package systemOfCar;

public class Coach extends Car implements IPerson{
	public Coach(int id,String name,float price,int capacityOfMan){
		this.id = id;
		this.name = name;
		this.capacityOfMan = capacityOfMan;
		this.price = price;
	}
	public int Person() {
		return capacityOfMan;
	}
}
