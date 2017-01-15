package systemOfCar;

public  class Car {
	 int      id;
	 String   name;
	 float      price;
	 float capacityOfGoods ;
	 int capacityOfMan;
	
	 public  String toString() {
		 if(capacityOfMan==0){
			 return id+".\t"+name+"\t"+price+"元/天\t载货"+capacityOfGoods+"吨";		 
		 }else if(capacityOfGoods==0){
			 return id+".\t"+name+"\t"+price+"元/天\t载客"+capacityOfMan+"人";
		 }else{
			return id+".\t"+name+"\t"+price+"元/天\t载货"+capacityOfGoods+"吨\t载客"+capacityOfMan+"人";
		 }
		 
	 }
}
