import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Student s = new Student();

                    System.out.print("Enter ID: ");
                    s.id = sc.nextInt();

                    sc.nextLine(); // clear buffer

                    System.out.print("Enter Name: ");
                    s.name = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    s.marks = sc.nextDouble();

                    students.add(s);

                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    if (students.isEmpty()) {
                        System.out.println("No students found.");
                    } else {
                        for (Student st : students) {
                            st.display();
                            System.out.println("---------------");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}