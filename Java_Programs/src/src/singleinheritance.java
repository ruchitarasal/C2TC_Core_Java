package src;

class Furniture{
	void eat() {
		System.out.println("Eating");
	}
}

class table extends Furniture{
	void write() {
		System.out.println("Barking");
	}
}
public class singleinheritance {

	public static void main(String[] args) {
		table d=new table();
		d.write();
		d.eat();
	}

}