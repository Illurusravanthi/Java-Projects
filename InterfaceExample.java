package hello;
interface Printable {
	void print();
}
class Message implements Printable{
	public void print() {
		System.out.println("hello from INTERFACE");	
	}
	public class InterfaceExample{
		public static void main(String[] args){
			Message msg=new Message();
			msg.print();
	}

	}

}

