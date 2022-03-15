
import org.junit.jupiter.api.*;

public class TestCaseDemo 
{
@RepeatedTest(15)
	void sum() {
		int a=10;
		int b=23;
		System.out.println(a+b);
	}
//@Disabled = To disable from running
@Test
void display()
{

	System.out.println("Executing TDD");
}

}
