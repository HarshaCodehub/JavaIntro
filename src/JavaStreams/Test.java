package JavaStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;

public class Test {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Harsha");
		names.add("Alekya");
		names.add("Navya");
		names.add("Venkat");
		names.add("Avinash");
		int count = 0;
		for (int i = 0; i < names.size(); i++) {
			String Actual = names.get(i);
			if (Actual.startsWith("A")) {
				count++;
			}
		}
		//System.out.println(count);
		// names.stream().filter(s->s.length()>5).forEach(s->System.out.println(s));
		names.stream().filter(s -> s.length() > 5).limit(1).forEach(s -> System.out.println(s));
		JavaStreams();
		streamMap();

	}

	public static void JavaStreams() {
		/*
		 * ArrayList<String> names = new ArrayList<String>(); names.add("Harsha");
		 * names.add("Alekya"); names.add("Navya"); names.add("Venkat");
		 * names.add("Avinash"); Long c =
		 * names.stream().filter(h->h.startsWith("A")).count();
		 */
		// System.out.println(c);
		Long c = Stream.of("Harsha", "Alekya", "Navya", "Venkat", "Avinash").filter(h -> h.startsWith("A")).count();
		System.out.println(c);

	}

	public static void streamMap() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Harsha");
		names.add("Kalyani");
		names.add("Supriya");
		names.add("Santhoshi");
		names.add("Kranti");
		// for upperCase
		Stream.of("Harsha", "Alekya", "Navya", "Venkat", "Avinash").filter(t -> t.endsWith("a"))
				.map(t -> t.toUpperCase()).forEach(t -> System.out.println(t));
		// for sorting using arrays
		List<String> words = Arrays.asList("Harsha", "Alekya", "Navya", "Venkat", "Avinash");
		//words.stream().filter(p -> p.startsWith("A")).sorted().map(p -> p.toUpperCase())
			//	.forEach(p -> System.out.println(p));
		// how to merge two arrayLists or two streams
		Stream<String> newStream =Stream.concat(names.stream(), words.stream());
		//newStream.sorted().forEach(u->System.out.println(u));
		boolean flag =newStream.anyMatch(p->p.equalsIgnoreCase("Navya"));
		System.out.println(flag);
		Assert.assertTrue(flag);
		streamCollect();
		
	}
	
	public static void streamCollect()
	{
		List<String> ls=Stream.of("Harsha", "Alekya", "Navya", "Venkat", "Avinash").filter(t -> t.endsWith("a"))
		.map(t -> t.toUpperCase()).collect(Collectors.toList());//we can use limit also to get single variable output
		System.out.println(ls.get(0));
		
		List<Integer> vammo = Arrays.asList(3,2,2,7,5,1,9,7);
		vammo.stream().distinct().sorted().forEach(p->System.out.println(p));
		//if wanted to make list and print desired
		List<Integer>vayamo=vammo.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(vayamo.get(2));
	}

}
