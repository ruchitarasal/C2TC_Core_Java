package src;

public class static_block {
	 static int a;
		public static void main(String[] args) {
			System.out.println("Executing the main block");
			System.out.println(a);
			m();
		}
		static void m()
		{
			System.out.println("I am static method()");
		}
		static
		{
			System.out.println("India is hte best");
		}
		static
		{
			System.out.println("Vande Mataram");
		}
		static
		{
			System.out.println("Jai hind");
		}
		
	}
		

