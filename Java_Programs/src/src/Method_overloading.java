package src;

public class Method_overloading {
	 public void m()
	 {
		 System.out.println("No Parameters");
	 }
	 public void m(int i)
	 {
		 System.out.println("I am an integer Method");
	 }
	 public void m(double d)
	 {
		 System.out.println("I am double method");
	 }
		public static void main(String[] args) {
			Method_overloading obj= new Method_overloading();
			obj.m();
			obj.m(6);
			obj.m(5.67);
			
			obj.m('a');
			obj.m(41);
			obj.m(3.87f);
			obj.m(3);
			
		}

	}