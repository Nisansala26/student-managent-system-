import java.lang.reflect.Array;
import java.util.ArrayList;

public class StudentManager {
    //studentArrayList
    private ArrayList<Student> studentArray = new ArrayList<>();

    //  add students

    public void addStudent(Student student){
        studentArray.add(student);
        System.out.println("Student added successfully! \n");
    }

    //display  all the students

    public void displayAllStudents(){
        for(Student student: studentArray){     // for each loop (to take one by one )
            student.displayInfo();
        }
        System.out.println();  // just a line

    }
    // remove students
    public void removeStudent(String id){
        boolean found = false;
        for(Student student: studentArray){
            if(student.getId().equalsIgnoreCase(id)){
                studentArray.remove(student);
                System.out.println("student  removed successfully ");
                found = true;
                break;
            }
        }if(!found){
            System.out.println("no student found with id: " + id +"\n");
        }
    }
}
