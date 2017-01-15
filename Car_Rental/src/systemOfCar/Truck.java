package systemOfCar;
//继承父类汽车的属性能力，接口的载货能力
public class Truck extends Car implements ICargo {
	public Truck(int id,String name,float capacityOfGoods,float price){
		this.id = id;
		this.name = name;
		this.capacityOfGoods = capacityOfGoods;
		this.price = price;
	}
	//载货能力显示返回载货量
	public float Cargo() {
		return capacityOfGoods;
	}
}
