package assignment09.Prob7a;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    static boolean getCheck(Employee e) {
        return (e.getSalary() > 100000) && (e.lastName.charAt(0) > 'M');
    }

    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(new Employee("Joe", "Davis", 120000),
                new Employee("John", "Sims", 110000),
                new Employee("Joe", "Stevens", 200000),
                new Employee("Andrew", "Reardon", 80000),
                new Employee("Joe", "Cummings", 760000),
                new Employee("Steven", "Walters", 135000),
                new Employee("Thomas", "Blake", 111000),
                new Employee("Alice", "Richards", 101000),
                new Employee("Donald", "Trump", 100000));

        //your stream pipeline here
        List<String> listnew = list
                .parallelStream()
                .filter(Main::getCheck)
                .map(Employee::fullName)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(listnew);

    }

}
