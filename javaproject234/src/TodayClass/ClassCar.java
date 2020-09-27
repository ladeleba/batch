package TodayClass;

public class ClassCar {
	protected int speed = 30 ;
	protected String color = "Blue";
	
	protected void method1()
	{
		System.out.println("Speed of the Car   "+speed);
		System.out.println("Color of the Car   "+color);
	}
		
		private void method2()
		{
			System.out.println("Speed of the Car 2   "+speed);
			System.out.println("Color of the Car 2  "+color);
		}
		public void method3()
		{
			System.out.println("Speed of the Car  3 "+speed);
			System.out.println("Color of the Car  3 "+color);
		}
		void method4()
		{
			System.out.println("Speed of the Car  4 "+speed);
			System.out.println("Color of the Car   4"+color);
	}
}
