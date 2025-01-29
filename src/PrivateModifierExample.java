
public class PrivateModifierExample {

	private int data;
	
	protected void display() {
		System.out.println("Data:"+ data);
	}
	
	public static void main(String[] args) {
		PrivateModifierExample obj = new PrivateModifierExample();
		obj.data = 200;
		obj.display();
	}
}


class Demo 
{
	public static void main(String[] args) {
		PrivateModifierExample obj = new PrivateModifierExample();
		obj.data = 200;
		obj.display();
	}
}
