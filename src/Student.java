public class Student {
//    three private variables.
    private String firstName;
    private String lastName;
    private int studentNumber;

//    setter and getter for each variable.
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public  String getLastName(){
        return lastName;
    }
    public void setStudentNumber(int studentNumber){
        this.studentNumber = studentNumber;
    }
    public int getStudentNumber(){
        return studentNumber;
    }
//    Constructer with three parameters.
    public Student(String firstName, String lastName, int studentNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentNumber = studentNumber;
    }

}
