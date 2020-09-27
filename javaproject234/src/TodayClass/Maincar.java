package TodayClass;

public class Maincar {

	public static void main(String[] args) {
		ClassCar car = new ClassCar();
		int car1 = car.speed;
		System.out.println("Car speed is   "+car1);
		
		String car2 = car.color;
		System.out.println("Car color is   "+car2);
			car.method1();
			//car.method2();   //not visible because modifier in classcar is on private
			car.method3();
			car.method4();
	}

}
