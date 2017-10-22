package assignment09.Prob7b;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary {

    public static final TriFunction<List<Employee>, Integer, Character, List<String>> objTriFunction = (
            list, salary, searchchar) -> list
            .parallelStream()
            .filter((e) -> e.getSalary() > salary)
            .filter((e) -> e.getLastName().charAt(0) > searchchar)
            .map((e) -> e.getfullName(e)).sorted().collect(Collectors.toList());

}
