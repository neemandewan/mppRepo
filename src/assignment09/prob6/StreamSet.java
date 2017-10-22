package assignment09.prob6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StreamSet {

    public static final Set<String> EMPTY_SET = new HashSet<String>();

    public Set<String> union(List<Set<String>> sets) {
        return sets.stream().reduce(EMPTY_SET, (a, b) -> {
            a.addAll(b);
            return a;
        });
    }

    public static void main(String[] args) {
        StreamSet s = new StreamSet();
        Set<String> set1 = new HashSet<>();
        set1.add("M");
        set1.add("N");
        set1.add("O");
        
        Set<String> set2 = new HashSet<>();
        set2.add("P");
        set2.add("Q");
        set2.add("R");
        
        Set<String> set3 = new HashSet<>();
        set3.add("S");
        set3.add("T");
        set3.add("U");
        
        Set<String> set4 = new HashSet<>();
        set4.add("1");
        set4.add("2");
        set4.add("3");
        
        List<Set<String>> list = new ArrayList<>();
        list.add(set1);
        list.add(set2);
        list.add(set3);
        list.add(set4);
        
        Set<String> set = s.union(list);
        set.forEach(System.out::print);

    }
}
