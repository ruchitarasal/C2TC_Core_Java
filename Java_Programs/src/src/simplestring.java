package src;

public class simplestring {

	public static void main(String[] args) {
		char c[]= {'j','a','v','a'};
		String s1=new String(c);
		String s2=new String(s1);
		
		System.out.println(s1);
		System.out.println(s2);
		String longStr=" This could have been"+
		               "a very long line that would have "+
				       "wrapped around. But sring concatenation "+
		               "prevents this.";
		System.out.println(longStr);
	}

}