package TodayClass2;

import TodayClass.ClassCar;

public class MainCar2 extends ClassCar {
	public static void main(String[] args) {
		MainCar2 car = new MainCar2();
		int car1 = car.speed;
		System.out.println("Car speed is   "+car1);
		
		String car2 = car.color;
		System.out.println("Car color is   "+car2);
			car.method1();
			car.method2();
			car.method3();
			car.method4();
	}

}
