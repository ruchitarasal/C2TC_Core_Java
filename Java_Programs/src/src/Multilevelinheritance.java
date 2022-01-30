package src;

class Animals{
	void eat() {
		System.out.println("Eating");
	}
}
class Dogs extends Animals{
	void bark() {
		System.out.println("Barking");
	}
}
class BabyDog extends Dogs{
	void weep() {
		System.out.println("Weeping");
	}
}

public class Multilevelinheritance {

	public static void main(String[] args) {
		BabyDog b=new BabyDog();
		b.weep();
		b.bark();
		b.eat();
	}

}

