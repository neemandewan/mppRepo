package assignment02.prob2C;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student("tom");
        s1.addSection(21);
        s1.addSection(22);
        
        Student s2 = new Student("jerry");
        s2.addSection(41);
        s2.addSection(42);
        
        Section sce1 = new Section(32);
        sce1.addStudent("oggy");
        sce1.addStudent("cockroaches");
        
        Section sce2 = new Section(52);
        sce2.addStudent("Micky");
        sce2.addStudent("Minnie");
        
        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        
        for(Student st : students) {
            List<StudentSection> ss = st.getStudentSections();
            for(int i =0; i<ss.size(); i++) {
            	System.out.println(ss.get(i).getStudent() + "-->>" + ss.get(i).getSection());
            }
            
        }
        
        System.out.println("\n\n");
        
        List<Section> sections = new ArrayList<>();
        sections.add(sce1);
        sections.add(sce2);
        
        for(Section st : sections) {
            List<StudentSection> ss = st.getStudentSections();
            for(int i =0; i<ss.size(); i++) {
            	System.out.println(ss.get(i).getStudent() + "-->>" + ss.get(i).getSection());
            }
            
        }

	}

}
