package hello;

class Car extends Thread{
	public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println(" BMW Car Moving" +i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
	}
}
}
class Bike extends Thread{
	public void run() {
		for(int j=1;j<=3;j++) {
			System.out.println("Bike Moving" +j);	
			try {
				Thread.sleep(500);
			} catch(Exception e) {
			}
	}
}
}

public class SimpleRace {
	public static void main(String[] args) {
		new Car().start();
		new Bike().start();
		

	}

}
