package Abstraction.interfaces;

class Honda implements Car {
		@Override
		public void go(){
			System.out.println("Inside Hondas Go()");
		}
		@Override
		public void stop(){
			System.out.println("Inside Hondas Stop() ");
		}
}
