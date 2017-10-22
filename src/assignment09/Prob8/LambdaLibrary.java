package assignment09.Prob8;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary {

    public static final TriFunction<List<Employee>, Integer, Character, List<String>> f = (list, salary, ch)
            -> list.parallelStream()
                    .filter((e) -> e.getSalary() > salary)
                    .filter((e) -> e.getLastName().charAt(0) > ch)
                    .map((e) -> e.getFullName())
                    .sorted()
                    .collect(Collectors.toList());

    public static final TriFunction<List<Employee>, Integer, Character, List<String>> fnew = (list, salary, ch)
            -> list.parallelStream()
                    .filter((e) -> e.getSalary() > salary)
                    .filter((e) -> e.getFirstName().charAt(0) < ch)
                    .map((e) -> e.getFullName().toUpperCase())
                    .sorted()
                    .collect(Collectors.toList());
}
