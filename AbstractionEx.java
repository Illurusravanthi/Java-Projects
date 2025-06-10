package hello;
abstract class car{
	abstract void start();
	abstract void drive();
	abstract void stop();
	void musicSystem() {
		System.out.println("playing music");
	}
}

public class AbstractionEx {
	void start() {
		System.out.println("car started usin start button");
	}
	void drive() {
		System.out.println();
	}

	public AbstractionEx() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
