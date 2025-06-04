package hello;
class Car1 implements Runnable{
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
class Bike1 implements Runnable{
	public void run() {
		for(int j=1;j<=3;j++) {
			System.out.println(" ninja Bike Moving" +j);	
			try {
				Thread.sleep(500);
			} catch(Exception e) {
			}
	}
}
}

public class SimpleRace1 {

	public static void main(String[] args) {
		Thread caThread = new Thread(new Car1());
		Thread baThread = new Thread(new Bike1());
		System.out.println("Goo");
		caThread.start();
		baThread.start();

	}

}
