import java.util.ArrayList;

public class StudentService {

    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Student added successfully!");
    }

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student st : students) {
                st.display();
                System.out.println("---------------");
            }
        }
    }

    public void searchStudent(int id) {
        boolean found = false;

        for (Student st : students) {
            if (st.getId() == id) {
                st.display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }
    }

    public void deleteStudent(int id) {
        boolean removed = false;

        for (Student st : students) {
            if (st.getId() == id) {
                students.remove(st);
                System.out.println("Student deleted successfully!");
                removed = true;
                break;
            }
        }

        if (!removed) {
            System.out.println("Student not found.");
        }
    }

    public void updateStudent(int id, String name, double marks) {
        boolean updated = false;

        for (Student st : students) {
            if (st.getId() == id) {
                st.setName(name);
                st.setMarks(marks);
                System.out.println("Student updated successfully!");
                updated = true;
                break;
            }
        }

        if (!updated) {
            System.out.println("Student not found.");
        }
    }
}