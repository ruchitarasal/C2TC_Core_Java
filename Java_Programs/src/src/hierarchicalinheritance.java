package src;

class Animalss{
	void eat() {
		System.out.println("Eating");
	}
}

class dog extends Animalss{
	void bark() {
		System.out.println("Barking");
	}
}	
class cats extends Animalss{
		void meow() {
			System.out.println("meowing");
		}
}			
public class hierarchicalinheritance {

	public static void main(String[] args) {
		cats c=new cats();
		c.meow();
		c.eat();

	}

}