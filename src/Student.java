import java.util.ArrayList;


public class Student {
//    three private variables.
    private String firstName;
    private String lastName;
    private int studentNumber;
    private ArrayList<String> interests;

    /*
    The Constructor takes 4 argument two of String type, one integer type and one is ArrayList<String> type.
     */
    public Student(String firstName, String lastName, int studentNumber, ArrayList<String> interest){
        setFirstName(firstName);
        setLastName(lastName);
        setStudentNumber(studentNumber);
        setInterest(interest);
    }

//    setter and getter for each variable.
    public void setFirstName(String firstName){
        if (firstName.equals(firstName.toUpperCase()))
        this.firstName = firstName;
        else
            throw new IllegalArgumentException(firstName+" is invalid please write your First name in CAPITAL LETTERS ");
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName){
        if(lastName.equals(lastName.toUpperCase()))
        this.lastName = lastName;
        else
            throw new IllegalArgumentException(lastName+" is not valid, Please write your last name in CAPITAL LETTERS");
    }
    public  String getLastName(){
        return lastName;
    }
    public void setStudentNumber(int studentNumber){
        if(studentNumber<100000&&studentNumber>9999)
        this.studentNumber = studentNumber;
        else
            throw new IllegalArgumentException(studentNumber+" is not valid, please type a correct five digit number");
    }
    public int getStudentNumber(){
        return studentNumber;
    }

    /*
    Static method which returns an ArrayList of type String and returns the same type of data.
     */
    public static ArrayList<String> availableInterest()
    {
        ArrayList<String> interests = new ArrayList<>();//new ArrayList or we can use List here
        interests.add("hiking");//all the valid inputs
        interests.add("skiing");
        interests.add("reading");
        interests.add("coding");
        interests.add("gaming");
        interests.add("music");
        interests.add("dancing");
        interests.add("sports");
        return interests;
    }

    public void setInterest(ArrayList<String> interests) {
        ArrayList<String> validInterest = availableInterest();
        for (String interest : interests)//for loop is used to iterate the ArrayList.
        {
            if (!validInterest.contains(interest))//condition
                throw new IllegalArgumentException(interest + " is not valid.  please choose from these options: "
                        +validInterest);
        }
        this.interests = interests;
    }
    public ArrayList<String> getInterest(){
        return interests;
    }


}
