import com.student.manage.Student;
import com.student.manage.StudentDao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Welcome to student management app");

        BufferedReader br = new BufferedReader((new InputStreamReader((System.in))));
        while (true) {
            System.out.println("Press 1 to add Student");
            System.out.println("Press 2 to Delete Student");
            System.out.println("Press 3 to Display Student");
            System.out.println("Press 4 to Exit app");
            int c = 0;
            try {
                c = Integer.parseInt(br.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            if(c == 1) {
                // add student
                System.out.println("Enter user name:");
                String name = br.readLine();
                System.out.println("Enter user phone");
                String phone = br.readLine();
                System.out.println("Enter user city: ");
                String city = br.readLine();

                Student st = new Student(name, phone, city);
                boolean answer = StudentDao.insertStudentToDB(st);
                if (answer) {
                    System.out.println("Student is added successfully...");
                }else {
                    System.out.println("Something went wrong.Try again.");
                }
                System.out.println(st);
            } else if (c == 2) {
//                // delete student
                System.out.println("Enter student id to delete: ");
                int userId = Integer.parseInt(br.readLine());
                boolean f = StudentDao.deleteStudent(userId);
                if (f) {
                    System.out.println("Deleted .......");
                }else {
                    System.out.println("Something went wrong.");
                }
            } else if (c == 3) {
//                display student
//                System.out.println("Enter student id to delete: ");
                boolean f = StudentDao.showAllStudents();
                if (f) {
                    System.out.println("Successfully all students are displayed:  .......");
                }else {
                    System.out.println("Something went wrong.");
                }
            }else if(c == 4){
                // exit
                break;
            }else{

            }

            System.out.println("Thank you for using my application...");
            System.out.println("See you soon .... bye bye");
        }
    }
}