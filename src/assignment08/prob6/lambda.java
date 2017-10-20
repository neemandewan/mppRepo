package assignment08.prob6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;


public class lambda {
	
	
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("Rajesh");
		list1.add("Krishna");
		list1.add("Nibesh");
		
		list1.forEach((s) -> System.out.println(s.toUpperCase()));
		
		List<Student>  list = new ArrayList<>();
		list.add(new Student("Rajesh", 985574));
		list.add(new Student("Krishna", 985774));
		list.add(new Student("Nibesh", 985875));
		
		/*Collections.sort(list, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		});*/
		
		Collections.sort(list, (o1, o2) -> {
			return o1.getName().compareTo(o2.getName());
		});
		
		System.out.println(list);
		
		Collections.sort(list, (o1, o2) -> {
			return Integer.compare(o1.getRollNo(), o2.getRollNo());
		});
		
		System.out.println(list);
		
		System.out.println("By functional interface");
		Function<String, String> function = x -> x.toUpperCase();
		list.forEach((s)-> {
			System.out.println(function.apply(s.getName()));
		});
		
	}
	
	
}
