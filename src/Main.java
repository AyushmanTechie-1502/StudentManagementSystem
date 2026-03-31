import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();

        while (true) {
            try {
                System.out.println("\n--- Student Management System ---");
                System.out.println("1. Add Student");
                System.out.println("2. View Students");
                System.out.println("3. Search Student");
                System.out.println("4. Delete Student");
                System.out.println("5. Update Student");
                System.out.println("6. Exit");
                System.out.print("Enter choice: ");

                int choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();

                        sc.nextLine();

                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Marks: ");
                        double marks = sc.nextDouble();

                        Student s = new Student(id, name, marks);
                        service.addStudent(s);
                        break;

                    case 2:
                        service.viewStudents();
                        break;

                    case 3:
                        System.out.print("Enter ID to search: ");
                        int searchId = sc.nextInt();
                        service.searchStudent(searchId);
                        break;

                    case 4:
                        System.out.print("Enter ID to delete: ");
                        int deleteId = sc.nextInt();
                        service.deleteStudent(deleteId);
                        break;

                    case 5:
                        System.out.print("Enter ID to update: ");
                        int updateId = sc.nextInt();

                        sc.nextLine();

                        System.out.print("Enter new name: ");
                        String newName = sc.nextLine();

                        System.out.print("Enter new marks: ");
                        double newMarks = sc.nextDouble();

                        service.updateStudent(updateId, newName, newMarks);
                        break;

                    case 6:
                        System.out.println("Exiting...");
                        return;

                    default:
                        System.out.println("Invalid choice!");
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter correct data type.");
                sc.nextLine(); // clear wrong input
            } catch (Exception e) {
                System.out.println("Something went wrong: " + e.getMessage());
            }
        }
    }
}