import java.sql.SQLOutput;

public class Student {
    private String name;
    private String id;
    private int age;

    // parameterized constructor

    Student(String studentName, String studentId , int studentAge){
        this.name = studentName;
        this.age = studentAge;
        this.id = studentId;

    }
    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    //print student details
    public void  displayInfo(){
        System.out.println("ID:" + id + " | Name:" + name + " | Age:" + age);
    }

}
