package systemOfCar;
//继承汽车父类的属性能力，接口的载货载客能力
public class Pickup extends Car implements ICargo,IPerson{
	public Pickup(int id,String name,float price,float capacityOfGoods,int capacityOfMan){
		this.id = id;
		this.name = name;
		this.capacityOfGoods = capacityOfGoods;
		this.capacityOfMan = capacityOfMan;
		this.price = price;
	}
	//继承载货车的载货能力
	public float Cargo(){
		return capacityOfGoods;
	}
	//继承载客车的载客能力
	public int Person(){
		return capacityOfMan;
	}
}
