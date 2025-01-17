//import java.lang.reflect.Array;
import java.util.ArrayList;

public class Database {

    private final ArrayList<Information> students = new ArrayList<>();

    public void addstudent(Information student){
        students.add(student);
        System.out.println("Student added successfully!!\n");
    }

    
    public void viewStudents(){
        if(students.isEmpty()){
            System.out.println("No students to display\n");
        }else{
            System.out.println("Students list:");
            for (Information student : students) {
                student.displayInformation();
            }
            System.out.println();
        }
    }

    

    public boolean deleteStudent(int id){
        for (Information student : students) {
            if(student.getid() == id){
                students.remove(student);
                return true;
            }
        }
        return false;
    }

    public Information searchbyId(int id) {
        for (Information student : students) {
            if (student.getid() == id) {
                return student; 
            }
        }
        return null; 
    

 }
}
