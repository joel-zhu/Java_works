package systemOfCar;
//创建Car类，是三种不同能力的汽车的父类
public  class Car {
	 int      id;
	 String   name;
	 float      price;
	 float capacityOfGoods ;
	 int capacityOfMan;
	
	 public  String toString() {
		 if(capacityOfMan==0){//如果该车载客量为0，则不显示载客量
			 return id+".\t"+name+"\t"+price+"元/天\t载货"+capacityOfGoods+"吨";		 
		 }else if(capacityOfGoods==0){//如果该车载货量为0，则不显示载货量
			 return id+".\t"+name+"\t"+price+"元/天\t载客"+capacityOfMan+"人";
		 }else{
			return id+".\t"+name+"\t"+price+"元/天\t载货"+capacityOfGoods+"吨\t载客"+capacityOfMan+"人";
		 }
		 
	 }
}
