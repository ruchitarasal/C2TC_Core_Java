package src;

public class exampleofstring {

	public static void main(String[] args)
	{
		
		String s="Ruchita";
		
		System.out.println(s.length());
		
		System.out.println(s.charAt(3));

		System.out.println(s.toUpperCase());
		
		System.out.println(s.toLowerCase());
		
		System.out.println(s.concat(" Rasal"));

		System.out.println(s.indexOf("i"));
		
		System.out.println(s.substring(2));
		
		System.out.println(s.substring(2,5));
		
		System.out.println(s.replace("R", "S"));
		
		System.out.println(s.repeat(3));
		
		System.out.println(s.getClass());
		
		System.out.println(s.equals("ruchita"));
		
		System.out.println(s.indent(3));
		
		System.out.println(s.compareTo("Ruchita"));
		
		System.out.println(s.isBlank());
		
		System.out.println(s.isEmpty());
		
		System.out.println(s.startsWith("Ruc"));
		
		System.out.println(s.endsWith("ta"));
		
		String r=new String("  Good evening");
		
		System.out.println(r.trim());
		

	}

}
