package systemOfCar;
//继承父类汽车的属性能力，接口的载客能力
public class Coach extends Car implements IPerson{
	public Coach(int id,String name,float price,int capacityOfMan){
		this.id = id;
		this.name = name;
		this.capacityOfMan = capacityOfMan;
		this.price = price;
	}
	//返回载客量
	public int Person() {
		return capacityOfMan;
	}
}
