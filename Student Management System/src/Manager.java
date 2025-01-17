
import java.util.Scanner;

public class Manager {
    private Database database = new Database();
    private Scanner scanner = new Scanner(System.in);

    public void showMenu(){
        while (true) { 
            System.out.println("==== Student Managerment System ====");
            System.out.println("1. Add student ");
            System.out.println("2. View student ");
            System.out.println("3. Delete student ");
            System.out.println("4. Search student ");
            System.out.println("5. Exit ");
            System.out.println("Enter any choice ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addstudent();
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    deleteStudent();
                    break;
                case 4:
                    searchbyId();
                    break;
                case 5:
                    System.out.println("Exiting........Thankyou for visiting.....");
                    break;
                default:
                    System.out.println("Invalid choise ");
                    break;
            }
        }
    }
    private void addstudent(){
        System.out.println("Enter Student Id: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.println("Enter Student Course: ");
        String course = scanner.nextLine();

        Information student = new Information(id, name, course);
        database.addstudent(student);
    }

    private void viewStudents(){
        database.viewStudents();
    }

    private void searchbyId(){
        System.out.println("Enter student ID to search: ");
         int id = scanner.nextInt();
         Information student = database.searchbyId(id); 
         if (student != null) {
            System.out.println("Student found:");
            student.displayInformation(); 
        } else {
            System.out.println("Student with ID " + id + " not found.\n");
        }
    }

    
    private void deleteStudent(){
        System.out.println("Enter Student ID to delete: ");
        int id = scanner.nextInt();

        if(database.deleteStudent(id)){
            System.out.println("Student with Id " + id + " Delete Successfully!!\n");
        }else{
            System.out.println("Student with Id " + id + "Not found!!\n");
        }
    }
}
