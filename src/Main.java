import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
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
                    System.out.print("Enter ID to search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (Student st : students) {
                        if (st.getId() == searchId) {
                            st.display();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter ID to delete: ");
                    int deleteId = sc.nextInt();

                    boolean removed = false;

                    for (Student st : students) {
                        if (st.getId() == deleteId) {
                            students.remove(st);
                            System.out.println("Student deleted successfully!");
                            removed = true;
                            break;
                        }
                    }

                    if (!removed) {
                        System.out.println("Student not found.");
                    }
                    break;
                case 5:
                    System.out.print("Enter ID to update: ");
                    int updateId = sc.nextInt();

                    boolean updated = false;

                    for (Student st : students) {
                        if (st.getId() == updateId) {

                            sc.nextLine(); // clear buffer

                            System.out.print("Enter new name: ");
                            String newName = sc.nextLine();

                            System.out.print("Enter new marks: ");
                            double newMarks = sc.nextDouble();

                            st.setName(newName);
                            st.setMarks(newMarks);

                            System.out.println("Student updated successfully!");
                            updated = true;
                            break;
                        }
                    }

                    if (!updated) {
                        System.out.println("Student not found.");
                    }
                    break;
                case 6:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}