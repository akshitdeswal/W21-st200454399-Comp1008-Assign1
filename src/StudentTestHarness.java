import java.util.ArrayList;
import java.util.Arrays;

public class StudentTestHarness {
    public static void main(String[]args){
        ArrayList<String> unchartedInterests = new ArrayList<>();//the static method we created in Student class.
        unchartedInterests.addAll(Arrays.asList("music", "sports","hiking","skiing"));
        Student student = new Student("AKSHIT", "DESWAL", 12345, unchartedInterests );//student object
//        invalid input
//        unchartedInterests.addAll(Arrays.asList("sleeping"));
//        student.setInterest(unchartedInterests);
        System.out.printf("Student First name is %s and Last name is %s,%n his student number is %d and he loves %s",student.getFirstName(), student.getLastName(),student.getStudentNumber(),student.getInterest());


    }
}
