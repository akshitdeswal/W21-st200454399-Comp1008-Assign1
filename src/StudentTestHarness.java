public class StudentTestHarness {
    public static void main(String[]args){
        Student student = new Student("Akshit", "Deswal", 200454399);
        System.out.printf("Student First name is %s and Last name is %s,%n his student number is %d ",student.getFirstName(), student.getLastName(),student.getStudentNumber());


    }
}
