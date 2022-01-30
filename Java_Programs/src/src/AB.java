package src;

interface B
{void Bdisplay();
	}
interface A
{void Adisplay();
	}


class MIE implements A,B
{
	public void Adisplay()
	{
		System.out.println("I am A");
	}
	public void Bdisplay()
	{
		System.out.println("I am B");
	}

}

public class AB {

	public static void main(String[] args)
	{
		MIE obj=new MIE();
		
		obj.Bdisplay();
		obj.Adisplay();

	}

}
