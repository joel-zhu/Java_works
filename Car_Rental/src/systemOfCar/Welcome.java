package systemOfCar;
import java.util.Scanner;

public class Welcome {
	Scanner in = new Scanner(System.in);
	//添加车型和价格等信息
	Car CarList[] = {new Truck(1,"小货车",3.5f,500f),new Truck(2,"大货车",7.8f,800f),new Coach(3,"小客车",400f,12),new Coach(4,"大客车",900f,25),new Pickup(5,"小皮卡",600f,1.1f,4),new Pickup(6,"大皮卡",1100f,2.5f,6)};
	//进入系统的初始界面
	public void Entry() {
		System.out.println("********Welcome*******\n是否租车：1、是\t2、否");
		//输入判断是否进行租车
		int judge = in.nextInt();
		if(judge ==1){
			System.out.println("以下是提供的车型和价目表");
			System.out.println("序号\t汽车名称\t租金\t容量");
			//列出车型
			for(int i=0,len = CarList.length;i<len;i++){
				System.out.println(CarList[i]);
			};

		}else if(judge==2){
			System.out.println("成功退出系统");
			System.exit(2);
		}else{
			System.out.println("您输入的有误，无法执行程序");
		}
	}
	//计算租车的信息，所选车型，载客量，载货量以及总价
	public void PriceSum() {
		System.out.println("请输入您要租用的汽车数量");
		int rentNum = in.nextInt();//租车数量
		Car[] selectedCar = new Car[rentNum]; 
		for(int i = 0;i<rentNum;i++){
			System.out.println("请输入第"+(i+1)+"辆车的序号");
			int CarId = in.nextInt();//根据序号选择车型
			selectedCar[i] = CarList[CarId-1];
		}
		System.out.println("请输入您要租车的天数");
		int rentDays = in.nextInt();//租车天数
		System.out.println("您要支付的总费用：");
		System.out.println("您租用的可载乘客的汽车有：");
		int sumPassengers = 0;
		//显示租用的汽车名称
		for(Car car : selectedCar){
			//根据接口判断是否是具有载客能力的汽车
			if(car instanceof IPerson){
				sumPassengers = sumPassengers+((IPerson)car ).Person();//载客量
			}
			System.out.print(car.name+"\t");//载客车名称
		}
		System.out.println("共载人"+sumPassengers+"人");
		System.out.println("您租用的可载货的汽车有：");
		float sumCargo = 0;
		float sumPrice = 0;
		for(Car car : selectedCar){
			//根据接口判断是否是具有载货能力的汽车
			if(car instanceof ICargo){
				sumCargo = sumCargo+((ICargo)car ).Cargo();//载货量
			}
			System.out.print(car.name+"\t");//载货车名称
			sumPrice = sumPrice+car.price*rentDays;//租车金额
		}
		System.out.println("共可载货"+sumCargo+"吨");
		System.out.println("您租车的费用为"+sumPrice+"元");
	}
	
}
