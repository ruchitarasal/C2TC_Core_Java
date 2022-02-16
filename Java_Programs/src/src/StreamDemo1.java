package src;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class StreamDemo1 {

	public static void main(String[] args) {
		List<Integer> orig=List.of(13,45,63,23,78,96,54,33,21,27,98);
		System.out.println(orig);
		
		List<Integer> evenlist=new ArrayList<>();
		for(Integer i:orig)
		{
			if(i%2==0)
			{
				evenlist.add(i);
				
			}	
		}
		System.out.println(evenlist);
		
		Stream<Integer> stream=orig.stream();
		List<Integer> l=stream.filter(i->i%2==0).collect(Collectors.toList());
		}
}
